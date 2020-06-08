package nhom2.coffeeshop.app.lichsu;

import nhom2.coffeeshop.model.Hoadon;
import nhom2.coffeeshop.service.HoadonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.*;

@Service
public class lichsuService {

    @Autowired
    private HoadonService hoadonService;


    public List<lichsu> getByID(Long id) throws ParseException {
        List<lichsu> res = new ArrayList<>();
        List<Hoadon> listHD = hoadonService.getAllHoadons();
        if (listHD == null) return null;
        for (Hoadon HD : listHD) {
            if (HD.getKhachhang()  == null) continue;
            if (HD.getKhachhang().getIdkhachhang() == id) {
                lichsu lichsuenti = new lichsu() ;
                lichsuenti.setDiachi(HD.getCuahang().getDiachi());
                lichsuenti.setMahoadon(HD.getIdhoadon());
                lichsuenti.setTencuahang(HD.getCuahang().getTencuahang());
                lichsuenti.setNgaymua(HD.getNgaymua());
                lichsuenti.setTongtien(HD.getTongtienthanhtoan());
                res.add(lichsuenti);
            }
        }

        return res;
    }

}
