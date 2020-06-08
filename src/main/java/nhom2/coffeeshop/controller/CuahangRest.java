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

import nhom2.coffeeshop.model.Cuahang;
import nhom2.coffeeshop.service.CuahangService;

@RestController
public class CuahangRest {

	@Autowired
	CuahangService service;

	@GetMapping("/api/cuahangs")
	public ResponseEntity<List<Cuahang>> getAllCuahangs() {
		List<Cuahang> list = service.getAllCuahangs();

		return new ResponseEntity<List<Cuahang>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/api/cuahangs/{id}")
	public ResponseEntity<Cuahang> getCuahangById(@PathVariable("id") Long id) throws Exception {
		Cuahang entity = service.getCuahangById(id);

		return new ResponseEntity<Cuahang>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping(path = "/api/cuahangs", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Cuahang> createOrUpdateCuahang( @RequestBody(required = false) Cuahang Cuahang) throws Exception {
		Cuahang updated = service.createOrUpdateCuahang(Cuahang);
		return new ResponseEntity<Cuahang>(updated, new HttpHeaders(), HttpStatus.CREATED);
	}

	@DeleteMapping("/api/cuahangs/{id}")
	public HttpStatus deleteCuahangById(@PathVariable("id") Long id) throws Exception {
		service.deleteCuahangById(id);
		return HttpStatus.FORBIDDEN;
	}
}