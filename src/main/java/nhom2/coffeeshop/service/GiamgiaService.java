package nhom2.coffeeshop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nhom2.coffeeshop.model.Giamgia;
import nhom2.coffeeshop.repo.GiamgiaRepo;



@Service
public class GiamgiaService {
	@Autowired
	GiamgiaRepo repository;

	public List<Giamgia> getAllGiamgias() {
		List<Giamgia> GiamgiaList = new ArrayList<Giamgia>();
		repository.findAll().forEach(GiamgiaList::add);

		if (GiamgiaList.size() > 0) {
			return GiamgiaList;
		} else {
			return new ArrayList<Giamgia>();
		}
	}

	public Giamgia getGiamgiaById(Long id) throws Exception {
		Optional<Giamgia> Giamgia = repository.findById(id);

		if (Giamgia.isPresent()) {
			return Giamgia.get();
		} else {
			throw new Exception("No Giamgia record exist for given id");
		}
	}

	public Giamgia createOrUpdateGiamgia(Giamgia entity) throws Exception {
		Optional<Giamgia> Giamgia = repository.findById(entity.getIdgiamgia());

		if (Giamgia.isPresent()) 
		{
			Giamgia newEntity = Giamgia.get();
			newEntity.setHoadons(entity.getHoadons());
			newEntity.setKhachhangGiamgias(entity.getKhachhangGiamgias());
			newEntity.setLoaikhachhangGiamgias(entity.getLoaikhachhangGiamgias());
			newEntity.setMathangCuahangs(entity.getMathangCuahangs());
			newEntity.setMota(entity.getMota());
			newEntity.setPhantram(entity.getPhantram());
			newEntity.setSotien(entity.getSotien());
			newEntity = repository.save(newEntity);
			return newEntity;
		} 
		else 
		{
			entity = repository.save(entity);
			return entity;
		}
	}

	public void deleteGiamgiaById(Long id) throws Exception {
		Optional<Giamgia> Giamgia = repository.findById(id);

		if (Giamgia.isPresent()) {
			repository.deleteById(id);
		} else {
			throw new Exception("No Giamgia record exist for given id");
		}
	}

	
}