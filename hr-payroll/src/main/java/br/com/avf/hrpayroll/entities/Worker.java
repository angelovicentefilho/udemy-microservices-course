package br.com.avf.hrpayroll.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Worker implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private BigDecimal dailyIncome;

}
