package br.com.avf.hruser.resource;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.avf.hruser.entities.User;
import br.com.avf.hruser.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;

@RefreshScope
@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserResource {

	private final UserRepository repository;
	
	@Autowired
	public UserResource(UserRepository repository) {
		this.repository = repository;
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {
		final Optional<User> obj = repository.findById(id);
		obj.orElseThrow(() -> new RuntimeException("User not found!!!"));
		return ResponseEntity.ok(obj);
	}
	
	@GetMapping("/search")
	public ResponseEntity<?> findById(@RequestParam String email) {
		User obj = repository.findByEmail(email);
		return ResponseEntity.ok(obj);
	}
	
}
