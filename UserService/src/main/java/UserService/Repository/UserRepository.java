package UserService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import UserService.Model.Users;

@Repository
public interface UserRepository   extends JpaRepository<Users, Long>{

}
