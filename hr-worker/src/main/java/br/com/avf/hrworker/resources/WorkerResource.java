package br.com.avf.hrworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.avf.hrworker.entities.Worker;
import br.com.avf.hrworker.repositories.WorkerRepository;

@RestController
@CrossOrigin
@RequestMapping("/workers")
public class WorkerResource {

	private final WorkerRepository repository;
	
	@Autowired
	public WorkerResource(WorkerRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping
	public ResponseEntity<?> findAll() {
		List<Worker> workers = repository.findAll();
		return ResponseEntity.ok(workers);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {
		Worker worker = repository.findById(id).orElseThrow(()-> new RuntimeException("Worker not found!!!"));
		return ResponseEntity.ok(worker);
	}
	
}
