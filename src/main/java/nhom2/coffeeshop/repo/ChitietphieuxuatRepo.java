package nhom2.coffeeshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import nhom2.coffeeshop.model.Chitietphieuxuat;

@CrossOrigin
public interface ChitietphieuxuatRepo extends JpaRepository<Chitietphieuxuat,Long> {

}