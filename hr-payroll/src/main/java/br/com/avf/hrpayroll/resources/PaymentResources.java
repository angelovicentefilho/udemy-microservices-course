package br.com.avf.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import br.com.avf.hrpayroll.entities.Payment;
import br.com.avf.hrpayroll.services.PaymentService;

@RestController
@CrossOrigin
@RequestMapping("/payments")
public class PaymentResources {

	private final PaymentService service;
	
	@Autowired
	public PaymentResources(PaymentService service) {
		this.service = service;
	}
	
	@HystrixCommand(fallbackMethod = "getPaymentAlternative")
	@GetMapping(value = "/{workerId}/days/{days}")
	public ResponseEntity<?> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
		Payment payment = service.getPayment(workerId, days);
		return ResponseEntity.ok(payment);
	}
	
	public ResponseEntity<?> getPaymentAlternative(Long workerId, Integer days) {
		throw new RuntimeException("O serviço de pagamento está fora do ar!");
	}
	
}
