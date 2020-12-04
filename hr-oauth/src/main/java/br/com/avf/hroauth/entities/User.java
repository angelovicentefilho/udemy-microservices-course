package br.com.avf.hroauth.entities;

import java.io.Serializable;
import java.util.Set;

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
public class User implements Serializable {

	private static final long serialVersionUID = -6776771160694615870L;

	private Long id;
	private String name;
	private String email;
	private String password;

	private Set<Role> roles;

}
