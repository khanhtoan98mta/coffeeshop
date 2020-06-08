package nhom2.coffeeshop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nhom2.coffeeshop.model.Chitietphieunhap;
import nhom2.coffeeshop.repo.ChitietphieunhapRepo;


@Service
public class ChitietphieunhapService {
	@Autowired
	ChitietphieunhapRepo repository;

	public List<Chitietphieunhap> getAllChitietphieunhaps() {
		List<Chitietphieunhap> ChitietphieunhapList = new ArrayList<Chitietphieunhap>();
		repository.findAll().forEach(ChitietphieunhapList::add);

		if (ChitietphieunhapList.size() > 0) {
			return ChitietphieunhapList;
		} else {
			return new ArrayList<Chitietphieunhap>();
		}
	}

	public Chitietphieunhap getChitietphieunhapById(Long id) throws Exception {
		Optional<Chitietphieunhap> Chitietphieunhap = repository.findById(id);

		if (Chitietphieunhap.isPresent()) {
			return Chitietphieunhap.get();
		} else {
			throw new Exception("No Chitietphieunhap record exist for given id");
		}
	}

	public Chitietphieunhap createOrUpdateChitietphieunhap(Chitietphieunhap entity) throws Exception {
		Optional<Chitietphieunhap> Chitietphieunhap = repository.findById(entity.getIdchitietphieunhap());

		if (Chitietphieunhap.isPresent()) 
		{
			Chitietphieunhap newEntity = Chitietphieunhap.get();
			newEntity.setDongia(entity.getDongia());
			newEntity.setMathang(entity.getMathang());
			newEntity.setPhieunhapkho(entity.getPhieunhapkho());
			newEntity.setSoluongtheochungtu(entity.getSoluongtheochungtu());
			newEntity.setSoluongthucxuat(entity.getSoluongthucxuat());
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

	public void deleteChitietphieunhapById(Long id) throws Exception {
		Optional<Chitietphieunhap> Chitietphieunhap = repository.findById(id);

		if (Chitietphieunhap.isPresent()) {
			repository.deleteById(id);
		} else {
			throw new Exception("No Chitietphieunhap record exist for given id");
		}
	}

	
}