package nhom2.coffeeshop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nhom2.coffeeshop.model.Cuahang;
import nhom2.coffeeshop.repo.CuahangRepo;



@Service
public class CuahangService {
	@Autowired
	CuahangRepo repository;

	public List<Cuahang> getAllCuahangs() {
		List<Cuahang> CuahangList = new ArrayList<Cuahang>();
		repository.findAll().forEach(CuahangList::add);

		if (CuahangList.size() > 0) {
			return CuahangList;
		} else {
			return new ArrayList<Cuahang>();
		}
	}

	public Cuahang getCuahangById(Long id) throws Exception {
		Optional<Cuahang> Cuahang = repository.findById(id);

		if (Cuahang.isPresent()) {
			return Cuahang.get();
		} else {
			throw new Exception("No Cuahang record exist for given id");
		}
	}

	public Cuahang createOrUpdateCuahang(Cuahang entity) throws Exception {
		Optional<Cuahang> Cuahang = repository.findById(entity.getIdcuahang());

		if (Cuahang.isPresent()) 
		{
			Cuahang newEntity = Cuahang.get();
			newEntity.setDiachi(entity.getDiachi());
			newEntity.setHoadons(entity.getHoadons());
			newEntity.setMathangCuahangs(entity.getMathangCuahangs());
			newEntity.setNhanviens(entity.getNhanviens());
			newEntity.setPhieunhapkhos(entity.getPhieunhapkhos());
			newEntity.setPhieuxuatkhos(entity.getPhieuxuatkhos());
			newEntity.setTencuahang(entity.getTencuahang());
			newEntity = repository.save(newEntity);
			return newEntity;
		} 
		else 
		{
			entity = repository.save(entity);
			return entity;
		}
	}

	public void deleteCuahangById(Long id) throws Exception {
		Optional<Cuahang> Cuahang = repository.findById(id);

		if (Cuahang.isPresent()) {
			repository.deleteById(id);
		} else {
			throw new Exception("No Cuahang record exist for given id");
		}
	}

	
}