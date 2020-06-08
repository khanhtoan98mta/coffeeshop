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

import nhom2.coffeeshop.model.Mathang;
import nhom2.coffeeshop.service.MathangSer;

@RestController
public class MathangRest {

	@Autowired
	MathangSer service;

	@GetMapping("/api/mathangs")
	public ResponseEntity<List<Mathang>> getAllMathangs() {
		List<Mathang> list = service.getAllMathangs();

		return new ResponseEntity<List<Mathang>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/api/mathangs/{id}")
	public ResponseEntity<Mathang> getEmployeeById(@PathVariable("id") Long id) throws Exception {
		Mathang entity = service.getMathangById(id);

		return new ResponseEntity<Mathang>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping(path = "/api/mathangs",consumes = "application/json", produces = "application/json")
	public ResponseEntity<Mathang> createOrUpdateEmployee( @RequestBody(required = false) Mathang Mathang) throws Exception {
		Mathang updated = service.createOrUpdateMathang(Mathang);
		return new ResponseEntity<Mathang>(updated, new HttpHeaders(), HttpStatus.CREATED);
	}

	@DeleteMapping("/api/mathangs/{id}")
	public HttpStatus deleteEmployeeById(@PathVariable("id") Long id) throws Exception {
		service.deleteMathangById(id);
		return HttpStatus.FORBIDDEN;
	}
}