
package nhom2.coffeeshop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import nhom2.coffeeshop.model.Phieunhapkho;
import nhom2.coffeeshop.repo.PhieunhapkhoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PhieunhapService {
    @Autowired
    PhieunhapkhoRepo repository;

    public List<Phieunhapkho> getAll() {
        List<Phieunhapkho> PhieunhapkhoList = new ArrayList<>();
        repository.findAll().forEach(PhieunhapkhoList::add);

        if (PhieunhapkhoList.size() > 0) {
            return PhieunhapkhoList;
        } else {
            return new ArrayList<>() ;
        }
    }

    public Phieunhapkho getPhieunhapkhoById(Long id) throws Exception {
        Optional<Phieunhapkho> Phieunhapkho = repository.findById(id);

        if (Phieunhapkho.isPresent()) {
            return Phieunhapkho.get();
        } else {
            throw new Exception("No Phieunhapkho record exist for given id");
        }
    }

    public Phieunhapkho createOrUpdatePhieunhapkho(Phieunhapkho entity) throws Exception {
        Optional<Phieunhapkho> Phieunhapkho = repository.findById(entity.getIdphieunhapkho());

        if (Phieunhapkho.isPresent())
        {
            Phieunhapkho newEntity = new Phieunhapkho();
            newEntity.setCuahang(entity.getCuahang());
            newEntity.setNhanvien(entity.getNhanvien());
            newEntity.setNgaylap(entity.getNgaylap());
            newEntity.setNhanvien(entity.getNhanvien());
            newEntity.setNgaylap(entity.getNgaylap());
            newEntity.setTongtienchuavat(entity.getTongtienchuavat());
            newEntity.setTongtienvat(entity.getTongtienvat());
            newEntity.setTongtiendavat(entity.getTongtiendavat());
            newEntity = repository.save(newEntity);
            return newEntity;
        }
        else
        {
            entity = repository.save(entity);
            return entity;
        }
    }

    public void deletePhieunhapkhoById(Long id) throws Exception {
        Optional<Phieunhapkho> Phieunhapkho = repository.findById(id);

        if (Phieunhapkho.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new Exception("No Phieunhapkho record exist for given id");
        }
    }


}
