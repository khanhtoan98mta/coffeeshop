package nhom2.coffeeshop.controller;


import nhom2.coffeeshop.Stats.StatsCuaHangService;
import nhom2.coffeeshop.Stats.statscuahang;
import nhom2.coffeeshop.model.Mathang;
import nhom2.coffeeshop.model.Phieunhapkho;
import nhom2.coffeeshop.service.MathangSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class StatsRest {
    @Autowired
    StatsCuaHangService statsCuaHangService;

    @GetMapping("/api/stats/{id}/{ngaybatdau}/{ngayketthuc}")
    public ResponseEntity<List<statscuahang>> getall(@PathVariable("id") Long id, @PathVariable("ngaybatdau") String ngaybatdau,
                                                     @PathVariable("ngayketthuc") String ngayketthuc) throws Exception {
        return new ResponseEntity<List<statscuahang>>(statsCuaHangService.Stats(id, ngaybatdau, ngayketthuc), new HttpHeaders(), HttpStatus.OK) ;
    }

    @GetMapping("/api/stats/{ngaybatdau}/{ngayketthuc}")
    public ResponseEntity<List<statscuahang>> getall(@PathVariable("ngaybatdau") String ngaybatdau,
                                                     @PathVariable("ngayketthuc") String ngayketthuc) throws Exception {
        return new ResponseEntity<List<statscuahang>>(statsCuaHangService.StatsAll(ngaybatdau, ngayketthuc), new HttpHeaders(), HttpStatus.OK) ;
    }


}
