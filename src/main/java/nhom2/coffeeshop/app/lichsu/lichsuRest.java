package nhom2.coffeeshop.app.lichsu;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class lichsuRest {

    @Autowired
    lichsuService service;

    @GetMapping("/api/lichsumuahang/{id}")
    public ResponseEntity<List<lichsu>> getall(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity<List<lichsu>>(service.getByID(id), new HttpHeaders(), HttpStatus.OK) ;
    }
}
