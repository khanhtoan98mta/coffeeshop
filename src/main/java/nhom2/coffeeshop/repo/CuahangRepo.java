package nhom2.coffeeshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import nhom2.coffeeshop.model.Cuahang;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface CuahangRepo extends JpaRepository<Cuahang,Long>{
	
}