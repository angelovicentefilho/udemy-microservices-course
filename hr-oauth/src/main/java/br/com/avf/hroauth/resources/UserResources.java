package br.com.avf.hroauth.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.avf.hroauth.entities.User;
import br.com.avf.hroauth.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserResources {
	
	@Autowired
	private UserService service;

	@GetMapping("/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email) {
		User user = service.findByEmail(email);
		return ResponseEntity.ok(user);
	}
	
}
