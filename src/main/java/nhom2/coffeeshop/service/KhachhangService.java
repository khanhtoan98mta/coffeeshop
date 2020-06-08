package nhom2.coffeeshop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import nhom2.coffeeshop.model.Khachhang;
import nhom2.coffeeshop.repo.KhachhangRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class KhachhangService {
    @Autowired
    KhachhangRepo repository;

    public List<Khachhang> getAll() {
        List<Khachhang> KhachhangList = new ArrayList<>();
        repository.findAll().forEach(KhachhangList::add);

        if (KhachhangList.size() > 0) {
            return KhachhangList;
        } else {
            return new ArrayList<>() ;
        }
    }

    public Khachhang getKhachhangById(Long id) throws Exception {
        Optional<Khachhang> Khachhang = repository.findById(id);

        if (Khachhang.isPresent()) {
            return Khachhang.get();
        } else {
            throw new Exception("No Khachhang record exist for given id");
        }
    }

    public Khachhang createOrUpdateKhachhang(Khachhang entity) throws Exception {
        Optional<Khachhang> Khachhang = repository.findById(entity.getIdkhachhang());

        if (Khachhang.isPresent())
        {
            Khachhang newEntity = new Khachhang();
            newEntity.setSodienthoai(entity.getSodienthoai());
            newEntity.setTenkhachhang(entity.getTenkhachhang());
            newEntity.setEmail(entity.getEmail());
            newEntity.setFacebook(entity.getFacebook());
            newEntity.setIdloaikhachhang(entity.getIdloaikhachhang());
            newEntity = repository.save(newEntity);
            return newEntity;
        }
        else
        {
            entity = repository.save(entity);
            return entity;
        }
    }

    public void deleteKhachhangById(Long id) throws Exception {
        Optional<Khachhang> Khachhang = repository.findById(id);

        if (Khachhang.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new Exception("No Khachhang record exist for given id");
        }
    }


}