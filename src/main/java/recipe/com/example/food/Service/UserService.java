package recipe.com.example.food.Service;

import java.util.Set;

import org.springframework.stereotype.Service;

import recipe.com.example.food.entity.user;
import recipe.com.example.food.entity.userRole;

@Service
public interface UserService {
	
	public user createUser(user user,Set<userRole>userRole) throws Exception;
	
	public user getUser(String userName);

	public user deleteUser(Integer userId);

}
