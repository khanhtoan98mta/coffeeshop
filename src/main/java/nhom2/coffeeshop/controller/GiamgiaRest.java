package nhom2.coffeeshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nhom2.coffeeshop.model.Giamgia;
import nhom2.coffeeshop.service.GiamgiaService;

@RestController
public class GiamgiaRest {

	@Autowired
	GiamgiaService service;

	@GetMapping("/api/giamgias")
	public ResponseEntity<List<Giamgia>> getAllGiamgias() {
		List<Giamgia> list = service.getAllGiamgias();

		return new ResponseEntity<List<Giamgia>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/api/giamgias/{id}")
	public ResponseEntity<Giamgia> getEmployeeById(@PathVariable("id") Long id) throws Exception {
		Giamgia entity = service.getGiamgiaById(id);

		return new ResponseEntity<Giamgia>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping(path = "/api/giamgias",consumes = "application/json", produces = "application/json")
	public ResponseEntity<Giamgia> createOrUpdateEmployee( @RequestBody(required = false) Giamgia Giamgia) throws Exception {
		Giamgia updated = service.createOrUpdateGiamgia(Giamgia);
		return new ResponseEntity<Giamgia>(updated, new HttpHeaders(), HttpStatus.CREATED);
	}

	@DeleteMapping("/api/giamgias/{id}")
	public HttpStatus deleteEmployeeById(@PathVariable("id") Long id) throws Exception {
		service.deleteGiamgiaById(id);
		return HttpStatus.FORBIDDEN;
	}
}