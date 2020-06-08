
package nhom2.coffeeshop.controller;

import java.util.List;

import nhom2.coffeeshop.model.Loaikhachhang;
import nhom2.coffeeshop.service.LoaikhachhangService;
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
public class LoaikhachhangRest {

    @Autowired
    LoaikhachhangService service;

    @GetMapping("/api/loaikhachhangs")
    public ResponseEntity<List<Loaikhachhang>> getAllloaikhachhangs() {
        List<Loaikhachhang> list = service.getAll();
        return new ResponseEntity<List<Loaikhachhang>>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/api/loaikhachhangs/{id}")
    public ResponseEntity<Loaikhachhang> getLoaikhachhangById(@PathVariable("id") Long id) throws Exception {
        Loaikhachhang entity = service.getLoaikhachhangById(id);
        return new ResponseEntity<Loaikhachhang>(entity, new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping(path = "/api/loaikhachhangs", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Loaikhachhang> createOrUpdateLoaikhachhang( @RequestBody(required = false) Loaikhachhang Loaikhachhang) throws Exception {
        Loaikhachhang updated = service.createOrUpdateLoaikhachhang(Loaikhachhang);
        return new ResponseEntity<Loaikhachhang>(updated, new HttpHeaders(), HttpStatus.CREATED);
    }

    @DeleteMapping("/api/loaikhachhangs/{id}")
    public HttpStatus deleteLoaikhachhangById(@PathVariable("id") Long id) throws Exception {
        service.deleteLoaikhachhangById(id);
        return HttpStatus.FORBIDDEN;
    }
}