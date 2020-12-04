package br.com.avf.hroauth.entities;

import java.io.Serializable;

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
public class Role implements Serializable {

	private static final long serialVersionUID = 4831415968815452191L;
	private Long id;
	private String name;

}
