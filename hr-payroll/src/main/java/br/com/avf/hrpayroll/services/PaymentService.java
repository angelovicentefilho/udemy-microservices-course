package br.com.avf.hrpayroll.services;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import br.com.avf.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	
	public Payment getPayment(Long workerId, int days) {
		return new Payment("Payment Angelo", new BigDecimal(200), days);
	}
}
