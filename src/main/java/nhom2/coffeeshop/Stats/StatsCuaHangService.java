package nhom2.coffeeshop.Stats;


import javafx.util.Pair;
import nhom2.coffeeshop.model.*;
import nhom2.coffeeshop.service.HoadonService;
import nhom2.coffeeshop.service.PhieunhapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class StatsCuaHangService {
    @Autowired
    private HoadonService hoadonService;

    @Autowired
    private PhieunhapService phieunhapService;

    public List<statscuahang> Stats(Long id, String n1, String n2) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");

        Date ngaybatdau = simpleDateFormat.parse(n1);
        Date ngayketthuc = simpleDateFormat.parse(n2);
        List<statscuahang> res = new ArrayList<>();
        HashMap<Mathang, Pair<Long, Float>> map = new HashMap<>();
        List<Hoadon> listHD = hoadonService.getAllHoadons();
        if (listHD == null) return null;
        for (Hoadon HD : listHD) {
            if (HD.getCuahang() == null || HD.getNgaymua() == null) continue;
            if (HD.getCuahang().getIdcuahang() == id && HD.getNgaymua().compareTo(ngaybatdau) >= 0 && HD.getNgaymua().compareTo(ngayketthuc) <= 0) {
                List<Chitiethoadon> listCT = HD.getChitiethoadons();
                for (Chitiethoadon CT : listCT) {
                    if (!map.containsKey(CT.getMathang()))
                        map.put(CT.getMathang(), new Pair<Long, Float>(CT.getSoluong(), CT.getThanhtien()));
                    else {
                        map.put(CT.getMathang(),
                                new Pair<>(CT.getSoluong() + map.get(CT.getMathang()).getKey(),
                                        map.get(CT.getMathang()).getValue() + CT.getThanhtien()));

                    }
                }
            }
        }
        for (Map.Entry<Mathang, Pair<Long, Float>> entry : map.entrySet()) {
            statscuahang a = new statscuahang();
            a.setMathang(entry.getKey());
            a.setSoluong(entry.getValue().getKey());
            a.setTongtien(entry.getValue().getValue());
            res.add(a);
        }

        return res;
    }

    public List<statscuahang> StatsAll(String n1, String n2) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");

        Date ngaybatdau = simpleDateFormat.parse(n1);
        Date ngayketthuc = simpleDateFormat.parse(n2);
        List<statscuahang> res = new ArrayList<>();
        HashMap<Mathang, Pair<Long, Float>> map = new HashMap<>();
        List<Hoadon> listHD = hoadonService.getAllHoadons();
        if (listHD == null) return null;
        for (Hoadon HD : listHD) {
            if (HD.getNgaymua() == null) continue;
            if (HD.getNgaymua().compareTo(ngaybatdau) >= 0 && HD.getNgaymua().compareTo(ngayketthuc) <= 0) {
                List<Chitiethoadon> listCT = HD.getChitiethoadons();
                for (Chitiethoadon CT : listCT) {
                    if (!map.containsKey(CT.getMathang()))
                        map.put(CT.getMathang(), new Pair<Long, Float>(CT.getSoluong(), CT.getThanhtien()));
                    else {
                        map.put(CT.getMathang(),
                                new Pair<>(CT.getSoluong() + map.get(CT.getMathang()).getKey(),
                                        map.get(CT.getMathang()).getValue() + CT.getThanhtien()));

                    }
                }
            }
        }
        for (Map.Entry<Mathang, Pair<Long, Float>> entry : map.entrySet()) {
            statscuahang a = new statscuahang();
            a.setMathang(entry.getKey());
            a.setSoluong(entry.getValue().getKey());
            a.setTongtien(entry.getValue().getValue());
            res.add(a);
        }

        return res;
    }

}
