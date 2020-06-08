package nhom2.coffeeshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import nhom2.coffeeshop.model.Chitietlichlamviec;

@CrossOrigin
public interface ChitietlichlamviecRepo extends JpaRepository<Chitietlichlamviec,Long>{
	
}