package nhom2.coffeeshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import nhom2.coffeeshop.model.Chitiethoadon;

@CrossOrigin
public interface ChitiethoadonRepo extends JpaRepository<Chitiethoadon,Long>{
	
}