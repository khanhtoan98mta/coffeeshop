package nhom2.coffeeshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import nhom2.coffeeshop.model.Mathang;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface MathangRepo extends JpaRepository<Mathang,Long>{
	//List<Mathang>
}