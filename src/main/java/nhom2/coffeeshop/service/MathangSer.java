package nhom2.coffeeshop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nhom2.coffeeshop.model.Mathang;
import nhom2.coffeeshop.repo.MathangRepo;



@Service
public class MathangSer {
	@Autowired
	MathangRepo repository;

	public List<Mathang> getAllMathangs() {
		List<Mathang> MathangList = new ArrayList<Mathang>();
		repository.findAll().forEach(MathangList::add);

		if (MathangList.size() > 0) {
			return MathangList;
		} else {
			return new ArrayList<Mathang>();
		}
	}

	public Mathang getMathangById(Long id) throws Exception {
		Optional<Mathang> Mathang = repository.findById(id);

		if (Mathang.isPresent()) {
			return Mathang.get();
		} else {
			throw new Exception("No Mathang record exist for given id");
		}
	}

	public Mathang createOrUpdateMathang(Mathang entity) throws Exception {
		Optional<Mathang> Mathang = repository.findById(entity.getIdmathang());

		if (Mathang.isPresent()) 
		{
			Mathang newEntity = Mathang.get();
			newEntity.setTenhang(entity.getTenhang());
			newEntity.setChitiethoadons(entity.getChitiethoadons());
			newEntity.setChitietphieunhaps(entity.getChitietphieunhaps());
			newEntity.setChitietphieuxuats(entity.getChitietphieuxuats());
			newEntity.setDonvitinh(entity.getDonvitinh());
			newEntity.setGia(entity.getGia());
			newEntity.setMathangCuahangs(entity.getMathangCuahangs());
			newEntity = repository.save(newEntity);
			return newEntity;
		} 
		else 
		{
			entity = repository.save(entity);
			return entity;
		}
	}

	public void deleteMathangById(Long id) throws Exception {
		Optional<Mathang> Mathang = repository.findById(id);

		if (Mathang.isPresent()) {
			repository.deleteById(id);
		} else {
			throw new Exception("No Mathang record exist for given id");
		}
	}

	
}