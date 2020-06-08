
package nhom2.coffeeshop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import nhom2.coffeeshop.model.LoaikhachhangGiamgia;
import nhom2.coffeeshop.repo.LoaikhachhangGiamgiaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class LoaikhachhangGiamgiaService {
    @Autowired
    LoaikhachhangGiamgiaRepo repository;

    public List<LoaikhachhangGiamgia> getAll() {
        List<LoaikhachhangGiamgia> LoaikhachhangGiamgiaList = new ArrayList<>();
        repository.findAll().forEach(LoaikhachhangGiamgiaList::add);

        if (LoaikhachhangGiamgiaList.size() > 0) {
            return LoaikhachhangGiamgiaList;
        } else {
            return new ArrayList<>() ;
        }
    }

    public LoaikhachhangGiamgia getLoaikhachhangGiamgiaById(Long id) throws Exception {
        Optional<LoaikhachhangGiamgia> LoaikhachhangGiamgia = repository.findById(id);

        if (LoaikhachhangGiamgia.isPresent()) {
            return LoaikhachhangGiamgia.get();
        } else {
            throw new Exception("No LoaikhachhangGiamgia record exist for given id");
        }
    }

    public LoaikhachhangGiamgia createOrUpdateLoaikhachhangGiamgia(LoaikhachhangGiamgia entity) throws Exception {
        Optional<LoaikhachhangGiamgia> LoaikhachhangGiamgia = repository.findById(entity.getIdloaikhachhanggiamgia());

        if (LoaikhachhangGiamgia.isPresent())
        {
            LoaikhachhangGiamgia newEntity = new LoaikhachhangGiamgia();
            newEntity.setGiamgia(entity.getGiamgia());
            newEntity.setLoaikhachhang(entity.getLoaikhachhang());
            newEntity.setNgaybatdau(entity.getNgaybatdau());
            newEntity.setNgayketthuc(entity.getNgayketthuc());
            newEntity.setSoluong(entity.getSoluong());

            newEntity = repository.save(newEntity);
            return newEntity;
        }
        else
        {
            entity = repository.save(entity);
            return entity;
        }
    }

    public void deleteLoaikhachhangGiamgiaById(Long id) throws Exception {
        Optional<LoaikhachhangGiamgia> LoaikhachhangGiamgia = repository.findById(id);

        if (LoaikhachhangGiamgia.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new Exception("No LoaikhachhangGiamgia record exist for given id");
        }
    }


}