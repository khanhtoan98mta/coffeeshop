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

import nhom2.coffeeshop.model.MathangCuahang;
import nhom2.coffeeshop.service.MathangCuahangService;

@RestController
public class MathangCuahangRest {

	@Autowired
	MathangCuahangService service;

	@GetMapping("/api/mathangcuahangs")
	public ResponseEntity<List<MathangCuahang>> getAllMathangCuahangs() {
		List<MathangCuahang> list = service.getAllMathangCuahangs();

		return new ResponseEntity<List<MathangCuahang>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/api/mathangcuahangs/{id}")
	public ResponseEntity<MathangCuahang> getEmployeeById(@PathVariable("id") Long id) throws Exception {
		MathangCuahang entity = service.getMathangCuahangById(id);

		return new ResponseEntity<MathangCuahang>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping(path = "/api/mathangcuahangs",consumes = "application/json", produces = "application/json")
	public ResponseEntity<MathangCuahang> createOrUpdateEmployee( @RequestBody(required = false) MathangCuahang MathangCuahang) throws Exception {
		MathangCuahang updated = service.createOrUpdateMathangCuahang(MathangCuahang);
		return new ResponseEntity<MathangCuahang>(updated, new HttpHeaders(), HttpStatus.CREATED);
	}

	@DeleteMapping("/api/mathangcuahangs/{id}")
	public HttpStatus deleteEmployeeById(@PathVariable("id") Long id) throws Exception {
		service.deleteMathangCuahangById(id);
		return HttpStatus.FORBIDDEN;
	}
}