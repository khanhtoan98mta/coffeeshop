package nhom2.coffeeshop.service;

import nhom2.coffeeshop.model.KhachhangGiamgia;
import nhom2.coffeeshop.repo.KhachhangGiamgiaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class KhachhangGiamgiaService {
    @Autowired
    KhachhangGiamgiaRepo repository;

    public List<KhachhangGiamgia> getAll() {
        List<KhachhangGiamgia> KhachhangGiamgiaList = new ArrayList<>();
        repository.findAll().forEach(KhachhangGiamgiaList::add);

        if (KhachhangGiamgiaList.size() > 0) {
            return KhachhangGiamgiaList;
        } else {
            return new ArrayList<>() ;
        }
    }

    public KhachhangGiamgia getKhachhangGiamgiaById(Long id) throws Exception {
        Optional<KhachhangGiamgia> KhachhangGiamgia = repository.findById(id);

        if (KhachhangGiamgia.isPresent()) {
            return KhachhangGiamgia.get();
        } else {
            throw new Exception("No KhachhangGiamgia record exist for given id");
        }
    }

    public KhachhangGiamgia createOrUpdateKhachhangGiamgia(KhachhangGiamgia entity) throws Exception {
        Optional<KhachhangGiamgia> KhachhangGiamgia = repository.findById(entity.getIdkhachhanggiamgia());

        if (KhachhangGiamgia.isPresent())
        {
            KhachhangGiamgia newEntity = new KhachhangGiamgia();
            newEntity.setGiamgia(entity.getGiamgia());
            newEntity.setKhachhang(entity.getKhachhang());
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

    public void deleteKhachhangGiamgiaById(Long id) throws Exception {
        Optional<KhachhangGiamgia> KhachhangGiamgia = repository.findById(id);

        if (KhachhangGiamgia.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new Exception("No KhachhangGiamgia record exist for given id");
        }
    }


}