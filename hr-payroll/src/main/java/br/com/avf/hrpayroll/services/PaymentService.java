package br.com.avf.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.avf.hrpayroll.entities.Payment;
import br.com.avf.hrpayroll.entities.Worker;
import br.com.avf.hrpayroll.feign.WorkerFeignClients;

@Service
public class PaymentService {


	private final WorkerFeignClients template;

	@Autowired
	public PaymentService(WorkerFeignClients template) {
		this.template = template;
	}

	public Payment getPayment(Long workerId, int days) {
		Worker worker = template.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
