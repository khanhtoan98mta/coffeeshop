package nhom2.coffeeshop.controller;

import java.util.List;

import nhom2.coffeeshop.model.Khachhang;
import nhom2.coffeeshop.service.KhachhangService;
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

@RestController
public class KhachhangRest {

    @Autowired
    KhachhangService service;

    @GetMapping("/api/Khachhangs")
    public ResponseEntity<List<Khachhang>> getAllKhachhangs() {
        List<Khachhang> list = service.getAll();
        return new ResponseEntity<List<Khachhang>>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/api/Khachhangs/{id}")
    public ResponseEntity<Khachhang> getKhachhangById(@PathVariable("id") Long id) throws Exception {
        Khachhang entity = service.getKhachhangById(id);
        return new ResponseEntity<Khachhang>(entity, new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping(path = "/api/Khachhangs", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Khachhang> createOrUpdateKhachhang( @RequestBody(required = false) Khachhang Khachhang) throws Exception {
        Khachhang updated = service.createOrUpdateKhachhang(Khachhang);
        return new ResponseEntity<Khachhang>(updated, new HttpHeaders(), HttpStatus.CREATED);
    }

    @DeleteMapping("/api/Khachhangs/{id}")
    public HttpStatus deleteKhachhangById(@PathVariable("id") Long id) throws Exception {
        service.deleteKhachhangById(id);
        return HttpStatus.FORBIDDEN;
    }
}