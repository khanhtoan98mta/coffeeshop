package nhom2.coffeeshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import nhom2.coffeeshop.model.NvLichlamviec;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface NvLichlamviecRepo extends JpaRepository<NvLichlamviec,Long>{
	
}