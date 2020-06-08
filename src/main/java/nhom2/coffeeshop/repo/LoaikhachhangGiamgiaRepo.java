package nhom2.coffeeshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import nhom2.coffeeshop.model.LoaikhachhangGiamgia;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface LoaikhachhangGiamgiaRepo extends JpaRepository<LoaikhachhangGiamgia,Long> {
	
}