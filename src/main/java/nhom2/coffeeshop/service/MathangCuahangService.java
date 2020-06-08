package nhom2.coffeeshop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nhom2.coffeeshop.model.MathangCuahang;
import nhom2.coffeeshop.repo.MathangCuahangRepo;


@Service
public class MathangCuahangService {
	@Autowired
	MathangCuahangRepo repository;

	public List<MathangCuahang> getAllMathangCuahangs() {
		List<MathangCuahang> MathangCuahangList = new ArrayList<MathangCuahang>();
		repository.findAll().forEach(MathangCuahangList::add);

		if (MathangCuahangList.size() > 0) {
			return MathangCuahangList;
		} else {
			return new ArrayList<MathangCuahang>();
		}
	}

	public MathangCuahang getMathangCuahangById(Long id) throws Exception {
		Optional<MathangCuahang> MathangCuahang = repository.findById(id);

		if (MathangCuahang.isPresent()) {
			return MathangCuahang.get();
		} else {
			throw new Exception("No MathangCuahang record exist for given id");
		}
	}

	public MathangCuahang createOrUpdateMathangCuahang(MathangCuahang entity) throws Exception {
		Optional<MathangCuahang> MathangCuahang = repository.findById(entity.getIdmathangcuahang());

		if (MathangCuahang.isPresent()) 
		{
			MathangCuahang newEntity = MathangCuahang.get();
			newEntity.setCuahang(entity.getCuahang());
			newEntity.setGiamgia(entity.getGiamgia());
			newEntity.setMathang(entity.getMathang());
			newEntity.setNgay(entity.getNgay());
			newEntity = repository.save(newEntity);
			return newEntity;
		} 
		else 
		{
			entity = repository.save(entity);
			return entity;
		}
	}

	public void deleteMathangCuahangById(Long id) throws Exception {
		Optional<MathangCuahang> MathangCuahang = repository.findById(id);

		if (MathangCuahang.isPresent()) {
			repository.deleteById(id);
		} else {
			throw new Exception("No MathangCuahang record exist for given id");
		}
	}

	
}