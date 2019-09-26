package net.kodar.restaurantapi.presentation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import net.kodar.restaurantapi.business.processor.Processor;

import javax.validation.Valid;
import java.util.List;

@RequestMapping(produces = "application/json")
public abstract class ServiceGeneric<IN, OUT, PK, PR extends Processor<IN, OUT, PK>> {

	@Autowired
	protected PR processor;

	@GetMapping
	public List<OUT> getAll() {
		return processor.getAll();
	}

	@GetMapping(value = "/{id}")
	public OUT get(@PathVariable(name = "id") PK id) {
		return processor.get(id);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable(name = "id") PK id) {
		processor.delete(id);
	}

	@PostMapping
	public OUT save(@Valid @RequestBody IN param) {
		OUT result = processor.save(param);
		return result;
	}

	@PutMapping("/{id}")
	public void update(@PathVariable(name = "id") PK id, @Valid @RequestBody IN param) throws Exception {
		if (getId(param) == id) {
			processor.update(param);
		} else {
			throw new Exception("Wrong id or param");
		}
	}

	protected abstract PK getId(IN param);
}
