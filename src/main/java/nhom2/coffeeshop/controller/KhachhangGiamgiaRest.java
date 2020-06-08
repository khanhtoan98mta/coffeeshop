package nhom2.coffeeshop.controller;


import nhom2.coffeeshop.model.KhachhangGiamgia;
import nhom2.coffeeshop.service.KhachhangGiamgiaService;
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

import java.util.List;


@RestController
public class KhachhangGiamgiaRest{

    @Autowired
    KhachhangGiamgiaService service;

    @GetMapping("/api/khachhanggiamgias")
    public ResponseEntity<List<KhachhangGiamgia>> getAllKhachhangGiamgias() {
        List<KhachhangGiamgia> list = service.getAll();
        return new ResponseEntity<List<KhachhangGiamgia>>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/api/khachhanggiamgias/{id}")
    public ResponseEntity<KhachhangGiamgia> getKhachhangGiamgiaById(@PathVariable("id") Long id) throws Exception {
        KhachhangGiamgia entity = service.getKhachhangGiamgiaById(id);
        return new ResponseEntity<KhachhangGiamgia>(entity, new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping(path = "/api/khachhanggiamgias", consumes = "application/json", produces = "application/json")
    public ResponseEntity<KhachhangGiamgia> createOrUpdateKhachhangGiamgia( @RequestBody(required = false) KhachhangGiamgia KhachhangGiamgia) throws Exception {
        KhachhangGiamgia updated = service.createOrUpdateKhachhangGiamgia(KhachhangGiamgia);
        return new ResponseEntity<KhachhangGiamgia>(updated, new HttpHeaders(), HttpStatus.CREATED);
    }

    @DeleteMapping("/api/khachhanggiamgias/{id}")
    public HttpStatus deleteKhachhangGiamgiaById(@PathVariable("id") Long id) throws Exception {
        service.deleteKhachhangGiamgiaById(id);
        return HttpStatus.FORBIDDEN;
    }
}
