package nhom2.coffeeshop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nhom2.coffeeshop.model.Chitiethoadon;
import nhom2.coffeeshop.repo.ChitiethoadonRepo;



@Service
public class ChitiethoadonService {
	@Autowired
	ChitiethoadonRepo repository;

	public List<Chitiethoadon> getAllChitiethoadons() {
		List<Chitiethoadon> ChitiethoadonList = new ArrayList<Chitiethoadon>();
		repository.findAll().forEach(ChitiethoadonList::add);

		if (ChitiethoadonList.size() > 0) {
			return ChitiethoadonList;
		} else {
			return new ArrayList<Chitiethoadon>();
		}
	}

	public Chitiethoadon getChitiethoadonById(Long id) throws Exception {
		Optional<Chitiethoadon> Chitiethoadon = repository.findById(id);

		if (Chitiethoadon.isPresent()) {
			return Chitiethoadon.get();
		} else {
			throw new Exception("No Chitiethoadon record exist for given id");
		}
	}

	public Chitiethoadon createOrUpdateChitiethoadon(Chitiethoadon entity) throws Exception {
		Optional<Chitiethoadon> Chitiethoadon = repository.findById(entity.getIdchitiethoadon());

		if (Chitiethoadon.isPresent()) 
		{
			Chitiethoadon newEntity = Chitiethoadon.get();
			newEntity.setGiatienbandau(entity.getGiatienbandau());
			newEntity.setGiatienhientai(entity.getGiatienhientai());
			newEntity.setHoadon(entity.getHoadon());
			newEntity.setMathang(entity.getMathang());
			newEntity.setSoluong(entity.getSoluong());
			newEntity.setThanhtien(entity.getThanhtien());
			newEntity = repository.save(newEntity);
			return newEntity;
		} 
		else 
		{
			entity = repository.save(entity);
			return entity;
		}
	}

	public void deleteChitiethoadonById(Long id) throws Exception {
		Optional<Chitiethoadon> Chitiethoadon = repository.findById(id);

		if (Chitiethoadon.isPresent()) {
			repository.deleteById(id);
		} else {
			throw new Exception("No Chitiethoadon record exist for given id");
		}
	}

	
}