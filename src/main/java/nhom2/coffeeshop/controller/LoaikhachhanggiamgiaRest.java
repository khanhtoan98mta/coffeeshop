
package nhom2.coffeeshop.controller;

import java.util.List;

import nhom2.coffeeshop.model.LoaikhachhangGiamgia;
import nhom2.coffeeshop.service.LoaikhachhangGiamgiaService;
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
public class LoaikhachhanggiamgiaRest {

    @Autowired
    LoaikhachhangGiamgiaService service;

    @GetMapping("/api/loaikhachhanggiamgias")
    public ResponseEntity<List<LoaikhachhangGiamgia>> getAllloaikhachhanggiamgias() {
        List<LoaikhachhangGiamgia> list = service.getAll();
        return new ResponseEntity<List<LoaikhachhangGiamgia>>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/api/loaikhachhanggiamgias/{id}")
    public ResponseEntity<LoaikhachhangGiamgia> getLoaikhachhangGiamgiaById(@PathVariable("id") Long id) throws Exception {
        LoaikhachhangGiamgia entity = service.getLoaikhachhangGiamgiaById(id);
        return new ResponseEntity<LoaikhachhangGiamgia>(entity, new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping(path = "/api/loaikhachhanggiamgias", consumes = "application/json", produces = "application/json")
    public ResponseEntity<LoaikhachhangGiamgia> createOrUpdateLoaikhachhangGiamgia( @RequestBody(required = false) LoaikhachhangGiamgia LoaikhachhangGiamgia) throws Exception {
        LoaikhachhangGiamgia updated = service.createOrUpdateLoaikhachhangGiamgia(LoaikhachhangGiamgia);
        return new ResponseEntity<LoaikhachhangGiamgia>(updated, new HttpHeaders(), HttpStatus.CREATED);
    }

    @DeleteMapping("/api/loaikhachhanggiamgias/{id}")
    public HttpStatus deleteLoaikhachhangGiamgiaById(@PathVariable("id") Long id) throws Exception {
        service.deleteLoaikhachhangGiamgiaById(id);
        return HttpStatus.FORBIDDEN;
    }
}