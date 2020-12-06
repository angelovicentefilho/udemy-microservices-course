package br.com.avf.hroauth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.avf.hroauth.clients.UserFeignClient;
import br.com.avf.hroauth.entities.User;

@Service
public class UserService implements UserDetailsService {

	private final UserFeignClient client;

	@Autowired
	public UserService(UserFeignClient client) {
		this.client = client;
	}

	public User findByEmail(String email) {
		User user = client.findByEmail(email).getBody();
		if (user == null) {
			throw new UsernameNotFoundException("Email not found!!");
		}
		return user;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return findByEmail(username);
	}

}
