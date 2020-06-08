package nhom2.coffeeshop.app.dathang;


import nhom2.coffeeshop.model.Cuahang;
import nhom2.coffeeshop.model.Hoadon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class dathangRest {

    @Autowired
    DathangService service;


    @PostMapping(path = "/api/dathang", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Long> dathang(@RequestBody(required = false) dathangTaoHD entity) throws Exception {
        Long id = service.createHDFromApp(entity);
        return new ResponseEntity<>(id, new HttpHeaders(), HttpStatus.CREATED);
    }

    @PostMapping(path = "/api/dathangchitiet", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Long> dathangct(@RequestBody(required = false) dathang entity) throws Exception {
        Long id = service.createCTHDFromApp(entity);
        return new ResponseEntity<>(id, new HttpHeaders(), HttpStatus.CREATED);
    }

    @PostMapping(path = "/api/dathangchitiet1", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Long> dathangct(@RequestBody(required = false) List<dathang> entity) throws Exception {
        for(int i=0;i<entity.size();i++)
        {
            Long id = service.createCTHDFromApp(entity.get(i));
        }
        return new ResponseEntity<>(entity.get(0).getIdhoadon(), new HttpHeaders(), HttpStatus.CREATED);
    }
}
