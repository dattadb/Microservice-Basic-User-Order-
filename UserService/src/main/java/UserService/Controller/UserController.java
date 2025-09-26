package UserService.Controller;

import java.util.Optional;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import UserService.Model.Users;
import UserService.Repository.UserRepository;
import jakarta.ws.rs.POST;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserRepository repository;

	@PostMapping("saveUser")
	public Users saveUserDetails(@RequestBody Users users) {
		Users save = repository.save(users);
		return save;

	}

	@GetMapping("getUserById/{userId}")
	public Optional<Users> getUserById(@PathVariable Long userId) {
		Optional<Users> user = repository.findById(userId);
		return user;
	}

}
