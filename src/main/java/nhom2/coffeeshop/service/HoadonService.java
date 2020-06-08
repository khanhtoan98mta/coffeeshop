package nhom2.coffeeshop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nhom2.coffeeshop.model.Hoadon;
import nhom2.coffeeshop.repo.HoadonRepo;



@Service
public class HoadonService {
	@Autowired
	HoadonRepo repository;

	public List<Hoadon> getAllHoadons() {
		List<Hoadon> HoadonList = new ArrayList<Hoadon>();
		repository.findAll().forEach(HoadonList::add);

		if (HoadonList.size() > 0) {
			return HoadonList;
		} else {
			return new ArrayList<Hoadon>();
		}
	}

	public Hoadon getHoadonById(Long id) throws Exception {
		Optional<Hoadon> Hoadon = repository.findById(id);

		if (Hoadon.isPresent()) {
			return Hoadon.get();
		} else {
			throw new Exception("No Hoadon record exist for given id");
		}
	}

	public Hoadon createOrUpdateHoadon(Hoadon entity) throws Exception {
		Optional<Hoadon> Hoadon = repository.findById(entity.getIdhoadon());

		if (Hoadon.isPresent()) 
		{
			Hoadon newEntity = Hoadon.get();
			newEntity.setChitiethoadons(entity.getChitiethoadons());
			newEntity.setCuahang(entity.getCuahang());
			newEntity.setGiamgia(entity.getGiamgia());
			newEntity.setKhachhang(entity.getKhachhang());
			newEntity.setNgaymua(entity.getNgaymua());
			newEntity.setNhanvien(entity.getNhanvien());
			newEntity.setSotiennhan(entity.getSotiennhan());
			newEntity.setSotientralai(entity.getSotientralai());
			newEntity.setTinhtrang(entity.getTinhtrang());
			newEntity.setTongtienbandau(entity.getTongtienbandau());
			newEntity.setTongtienthanhtoan(entity.getTongtienthanhtoan());
			newEntity = repository.save(newEntity);
			return newEntity;
		} 
		else 
		{
			entity = repository.save(entity);
			return entity;
		}
	}

	public void deleteHoadonById(Long id) throws Exception {
		Optional<Hoadon> Hoadon = repository.findById(id);

		if (Hoadon.isPresent()) {
			repository.deleteById(id);
		} else {
			throw new Exception("No Hoadon record exist for given id");
		}
	}

	
}