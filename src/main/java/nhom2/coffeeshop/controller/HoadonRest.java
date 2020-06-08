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

import nhom2.coffeeshop.model.Hoadon;
import nhom2.coffeeshop.service.HoadonService;

@RestController
public class HoadonRest {

	@Autowired
	HoadonService service;

	@GetMapping("/api/hoadons")
	public ResponseEntity<List<Hoadon>> getAllHoadons() {
		List<Hoadon> list = service.getAllHoadons();

		return new ResponseEntity<List<Hoadon>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/api/hoadons/{id}")
	public ResponseEntity<Hoadon> getHoadonById(@PathVariable("id") Long id) throws Exception {
		Hoadon entity = service.getHoadonById(id);

		return new ResponseEntity<Hoadon>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping(path = "/api/hoadons", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Hoadon> createOrUpdateHoadon( @RequestBody(required = false) Hoadon Hoadon) throws Exception {
		Hoadon updated = service.createOrUpdateHoadon(Hoadon);
		return new ResponseEntity<Hoadon>(updated, new HttpHeaders(), HttpStatus.CREATED);
	}

	@DeleteMapping("/api/hoadons/{id}")
	public HttpStatus deleteHoadonById(@PathVariable("id") Long id) throws Exception {
		service.deleteHoadonById(id);
		return HttpStatus.FORBIDDEN;
	}
}