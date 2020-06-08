package nhom2.coffeeshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import nhom2.coffeeshop.model.Phieuxuatkho;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface PhieuxuatkhoRepo extends JpaRepository<Phieuxuatkho,Long>{
	
}