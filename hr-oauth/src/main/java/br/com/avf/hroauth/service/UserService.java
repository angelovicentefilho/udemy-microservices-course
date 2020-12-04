package br.com.avf.hroauth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.avf.hroauth.clients.UserFeignClient;
import br.com.avf.hroauth.entities.User;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {

	private final UserFeignClient client;

	@Autowired
	public UserService(UserFeignClient client) {
		this.client = client;
	}

	public User findByEmail(String email) {
		log.info(">>> Find by email '{}'", email);
		User user = client.findByEmail(email).getBody();
		if (user == null) {
			log.error("Email not found '{}'", email);
			throw new IllegalArgumentException("Email not found!!");
		}
		return user;
	}

}
