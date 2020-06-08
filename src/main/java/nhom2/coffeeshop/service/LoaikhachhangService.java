
package nhom2.coffeeshop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import nhom2.coffeeshop.model.Loaikhachhang;
import nhom2.coffeeshop.repo.LoaikhachhangRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class LoaikhachhangService {
    @Autowired
    LoaikhachhangRepo repository;

    public List<Loaikhachhang> getAll() {
        List<Loaikhachhang> LoaikhachhangList = new ArrayList<>();
        repository.findAll().forEach(LoaikhachhangList::add);

        if (LoaikhachhangList.size() > 0) {
            return LoaikhachhangList;
        } else {
            return new ArrayList<>() ;
        }
    }

    public Loaikhachhang getLoaikhachhangById(Long id) throws Exception {
        Optional<Loaikhachhang> Loaikhachhang = repository.findById(id);

        if (Loaikhachhang.isPresent()) {
            return Loaikhachhang.get();
        } else {
            throw new Exception("No Loaikhachhang record exist for given id");
        }
    }

    public Loaikhachhang createOrUpdateLoaikhachhang(Loaikhachhang entity) throws Exception {
        Optional<Loaikhachhang> Loaikhachhang = repository.findById(entity.getIdloaikhachhang());

        if (Loaikhachhang.isPresent())
        {
            Loaikhachhang newEntity = new Loaikhachhang();
            newEntity.setDinhmuc(entity.getDinhmuc());
            newEntity.setTenloai(entity.getTenloai());
            newEntity.setLoaikhachhangGiamgias(entity.getLoaikhachhangGiamgias());
            newEntity = repository.save(newEntity);
            return newEntity;
        }
        else
        {
            entity = repository.save(entity);
            return entity;
        }
    }

    public void deleteLoaikhachhangById(Long id) throws Exception {
        Optional<Loaikhachhang> Loaikhachhang = repository.findById(id);

        if (Loaikhachhang.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new Exception("No Loaikhachhang record exist for given id");
        }
    }


}