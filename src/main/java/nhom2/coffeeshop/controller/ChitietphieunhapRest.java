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

import nhom2.coffeeshop.model.Chitietphieunhap;
import nhom2.coffeeshop.service.ChitietphieunhapService;

@RestController
public class ChitietphieunhapRest {

	@Autowired
	ChitietphieunhapService service;

	@GetMapping("/api/chitietphieunhaps")
	public ResponseEntity<List<Chitietphieunhap>> getAllChitietphieunhaps() {
		List<Chitietphieunhap> list = service.getAllChitietphieunhaps();

		return new ResponseEntity<List<Chitietphieunhap>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/api/chitietphieunhaps/{id}")
	public ResponseEntity<Chitietphieunhap> getChitietphieunhapById(@PathVariable("id") Long id) throws Exception {
		Chitietphieunhap entity = service.getChitietphieunhapById(id);

		return new ResponseEntity<Chitietphieunhap>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping(path = "/api/chitietphieunhaps", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Chitietphieunhap> createOrUpdateChitietphieunhap( @RequestBody(required = false) Chitietphieunhap Chitietphieunhap) throws Exception {
		Chitietphieunhap updated = service.createOrUpdateChitietphieunhap(Chitietphieunhap);
		return new ResponseEntity<Chitietphieunhap>(updated, new HttpHeaders(), HttpStatus.CREATED);
	}

	@DeleteMapping("/api/chitietphieunhaps/{id}")
	public HttpStatus deleteChitietphieunhapById(@PathVariable("id") Long id) throws Exception {
		service.deleteChitietphieunhapById(id);
		return HttpStatus.FORBIDDEN;
	}
}