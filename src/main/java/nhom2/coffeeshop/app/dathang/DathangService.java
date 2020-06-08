package nhom2.coffeeshop.app.dathang;

import nhom2.coffeeshop.model.*;
import nhom2.coffeeshop.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class DathangService {

    @Autowired
    private HoadonService hoadonService;


    @Autowired
    private KhachhangService khachhangService;

    @Autowired
    private CuahangService cuahangService;
    @Autowired
    private ChitiethoadonService chitiethoadonService ;

    @Autowired
    private MathangSer mathangSer ;


    public Long createHDFromApp(dathangTaoHD entity) throws Exception {
        Hoadon a = new Hoadon() ;

        Khachhang khachhang = khachhangService.getKhachhangById(entity.getIdkhachhang());
        a.setKhachhang(khachhang);

        Cuahang cuahang = cuahangService.getCuahangById(entity.getIdcuahang());
        a.setCuahang(cuahang);

        a.setNgaymua(Calendar.getInstance().getTime());
        a.setSotiennhan(entity.getTongtienthanhtoan());
        a.setSotientralai(0);
        a.setTinhtrang(0) ;
        a.setTongtienbandau(entity.getTongtienbandau());
        a.setTongtienthanhtoan(entity.getTongtienthanhtoan());
        hoadonService.createOrUpdateHoadon(a) ;
        return a.getIdhoadon();
    }

    public Long createCTHDFromApp(dathang entity) throws Exception {
        Chitiethoadon a = new Chitiethoadon() ;

        Mathang mathang = mathangSer.getMathangById(entity.getIdmathang()) ;
        a.setMathang(mathang);

        a.setGiatienbandau(entity.getGiatienhientai());
        a.setGiatienhientai(entity.getGiatienhientai());
        a.setSoluong(entity.getSoluong());
        a.setThanhtien(entity.getThanhtien());
        Hoadon hoadon = hoadonService.getHoadonById(entity.getIdhoadon()) ;
        a.setHoadon(hoadon);

        chitiethoadonService.createOrUpdateChitiethoadon(a);
        return a.getIdchitiethoadon();

    }

}
