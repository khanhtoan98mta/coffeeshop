package nhom2.coffeeshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import nhom2.coffeeshop.model.Khachhang;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface KhachhangRepo extends JpaRepository<Khachhang,Long>{
	
}