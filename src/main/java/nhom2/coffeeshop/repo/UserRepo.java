package nhom2.coffeeshop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nhom2.coffeeshop.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
	User findByUsername(String username);
}