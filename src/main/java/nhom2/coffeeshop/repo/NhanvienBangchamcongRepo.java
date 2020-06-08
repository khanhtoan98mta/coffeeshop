package nhom2.coffeeshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import nhom2.coffeeshop.model.NvBangchamcong;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface NhanvienBangchamcongRepo extends JpaRepository<NvBangchamcong,Long>{
	
}