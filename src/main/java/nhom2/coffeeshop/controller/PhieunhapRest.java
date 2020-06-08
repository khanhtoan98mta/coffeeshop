
package nhom2.coffeeshop.controller;

import java.util.List;

import nhom2.coffeeshop.model.Phieunhapkho;
import nhom2.coffeeshop.service.PhieunhapService;
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
public class PhieunhapRest {

    @Autowired
    PhieunhapService service;

    @GetMapping("/api/Phieunhapkhos")
    public ResponseEntity<List<Phieunhapkho>> getAllPhieunhapkhos() {
        List<Phieunhapkho> list = service.getAll();
        return new ResponseEntity<List<Phieunhapkho>>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/api/Phieunhapkhos/{id}")
    public ResponseEntity<Phieunhapkho> getPhieunhapkhoById(@PathVariable("id") Long id) throws Exception {
        Phieunhapkho entity = service.getPhieunhapkhoById(id);
        return new ResponseEntity<Phieunhapkho>(entity, new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping(path = "/api/Phieunhapkhos", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Phieunhapkho> createOrUpdatePhieunhapkho( @RequestBody(required = false) Phieunhapkho Phieunhapkho) throws Exception {
        Phieunhapkho updated = service.createOrUpdatePhieunhapkho(Phieunhapkho);
        return new ResponseEntity<Phieunhapkho>(updated, new HttpHeaders(), HttpStatus.CREATED);
    }

    @DeleteMapping("/api/Phieunhapkhos/{id}")
    public HttpStatus deletePhieunhapkhoById(@PathVariable("id") Long id) throws Exception {
        service.deletePhieunhapkhoById(id);
        return HttpStatus.FORBIDDEN;
    }
}