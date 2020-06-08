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

import nhom2.coffeeshop.model.Chitiethoadon;
import nhom2.coffeeshop.service.ChitiethoadonService;

@RestController
public class ChitiethoadonRest {

	@Autowired
	ChitiethoadonService service;

	@GetMapping("/api/chitiethoadons")
	public ResponseEntity<List<Chitiethoadon>> getAllChitiethoadons() {
		List<Chitiethoadon> list = service.getAllChitiethoadons();

		return new ResponseEntity<List<Chitiethoadon>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/api/chitiethoadons/{id}")
	public ResponseEntity<Chitiethoadon> getChitiethoadonById(@PathVariable("id") Long id) throws Exception {
		Chitiethoadon entity = service.getChitiethoadonById(id);

		return new ResponseEntity<Chitiethoadon>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping(path = "/api/chitiethoadons", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Chitiethoadon> createOrUpdateChitiethoadon( @RequestBody(required = false) Chitiethoadon Chitiethoadon) throws Exception {
		Chitiethoadon updated = service.createOrUpdateChitiethoadon(Chitiethoadon);
		return new ResponseEntity<Chitiethoadon>(updated, new HttpHeaders(), HttpStatus.CREATED);
	}

	@DeleteMapping("/api/chitiethoadons/{id}")
	public HttpStatus deleteChitiethoadonById(@PathVariable("id") Long id) throws Exception {
		service.deleteChitiethoadonById(id);
		return HttpStatus.FORBIDDEN;
	}
}