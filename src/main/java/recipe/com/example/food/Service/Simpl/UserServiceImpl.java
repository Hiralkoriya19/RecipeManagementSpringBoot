package recipe.com.example.food.Service.Simpl;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import recipe.com.example.food.Service.UserService;
import recipe.com.example.food.entity.user;
import recipe.com.example.food.entity.userRole;
import recipe.com.example.food.repository.RoleRepository;
import recipe.com.example.food.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public user createUser(user user, Set<userRole> userRoles) throws Exception {
		user local = this.userRepository.findByUserName(user.getUserName());
		if(local!=null) {
			System.out.println("User is already present!!");
			throw new Exception("User is already present!!");
		}
		else {
			for(userRole ur : userRoles) {
				roleRepository.save(ur.getRole());
			}
			user.getUserRole().addAll(userRoles);
			local = this.userRepository.save(user);
		}
		return local;
	}

	@Override
	public user getUser(String userName) {
		return this.userRepository.findByUserName(userName);
	}

	@Override
	public user deleteUser(Integer userId) {
		Optional<user> optional = userRepository.findById(userId);
		user user = optional.get();
		userRepository.delete(optional.get());
		return user;
	}

}
