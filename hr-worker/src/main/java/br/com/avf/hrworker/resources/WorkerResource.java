package br.com.avf.hrworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.avf.hrworker.entities.Worker;
import br.com.avf.hrworker.repositories.WorkerRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RefreshScope
@RestController
@CrossOrigin
@RequestMapping("/workers")
public class WorkerResource {

	private final WorkerRepository repository;
	private final Environment environment;
	
	@Value("${test.config}")
	private String configuration;
	
	@Autowired
	public WorkerResource(WorkerRepository repository, Environment environment) {
		this.repository = repository;
		this.environment = environment;
	}
	
	@GetMapping("/configs")
	public ResponseEntity<Void> getConfigs() {
		log.info("Configuration:.....'{}'",configuration);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping
	public ResponseEntity<?> findAll() {
		List<Worker> workers = repository.findAll();
		return ResponseEntity.ok(workers);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {
		
		log.info(">>> Port:......'{}'", this.environment.getProperty("local.server.port"));;
		
		Worker worker = repository.findById(id).orElseThrow(()-> new RuntimeException("Worker not found!!!"));
		return ResponseEntity.ok(worker);
	}
	
}
