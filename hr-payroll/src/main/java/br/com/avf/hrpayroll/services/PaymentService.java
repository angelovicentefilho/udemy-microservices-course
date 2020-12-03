package br.com.avf.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.avf.hrpayroll.entities.Payment;
import br.com.avf.hrpayroll.entities.Worker;

@Service
public class PaymentService {

	@Value("${hr-worker.host}")
	private String workerHost;

	private final RestTemplate template;

	@Autowired
	public PaymentService(RestTemplate template) {
		this.template = template;
	}

	public Payment getPayment(Long workerId, int days) {
		Map<String, Object> params = new HashMap<>();
		params.put("id", workerId);
		Worker worker = template.getForObject(workerHost + "/workers/{id}", Worker.class, params);
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
