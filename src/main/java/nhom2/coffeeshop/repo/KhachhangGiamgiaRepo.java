package nhom2.coffeeshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import nhom2.coffeeshop.model.KhachhangGiamgia;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface KhachhangGiamgiaRepo extends JpaRepository<KhachhangGiamgia,Long>{
	
}