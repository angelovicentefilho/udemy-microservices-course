package br.com.avf.hrpayroll.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

	private static final long serialVersionUID = 6505924162594312782L;
	private String name;
	private BigDecimal dailyIncome;
	private Integer days;
	
	public BigDecimal getTotal() {
		return dailyIncome.multiply(new BigDecimal(days));
	}
	
}
