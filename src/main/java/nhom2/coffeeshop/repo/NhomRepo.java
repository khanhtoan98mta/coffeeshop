package nhom2.coffeeshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import nhom2.coffeeshop.model.Nhom;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface NhomRepo extends JpaRepository<Nhom,Long>{
	
}