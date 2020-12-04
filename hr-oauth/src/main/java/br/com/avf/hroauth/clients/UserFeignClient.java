package br.com.avf.hroauth.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.avf.hroauth.entities.User;

@Service
@FeignClient(name = "hr-user", path = "/users")
public interface UserFeignClient {

	@GetMapping("/search")
	ResponseEntity<User> findByEmail(@RequestParam String email);
	
}
