package nhom2.coffeeshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import nhom2.coffeeshop.model.Chitietphieunhap;

@CrossOrigin
public interface ChitietphieunhapRepo extends JpaRepository<Chitietphieunhap,Long> {

}