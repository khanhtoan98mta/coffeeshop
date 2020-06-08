package nhom2.coffeeshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import nhom2.coffeeshop.model.MathangCuahang;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface MathangCuahangRepo extends JpaRepository<MathangCuahang,Long> {

}