/*
 * package recipe.com.example.food.Service.Simpl;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Service;
 * 
 * import recipe.com.example.food.entity.user; import
 * recipe.com.example.food.repository.UserRepository;
 * 
 * @Service public class UserDetailServiceImpl implements UserDetailsService{
 * 
 * @Autowired private UserRepository userRepository;
 * 
 * @Override public UserDetails loadUserByUsername(String userName) throws
 * UsernameNotFoundException { user user =
 * this.userRepository.findByUserName(userName);
 * 
 * if(user == null) { System.out.println("User Not Found"); throw new
 * UsernameNotFoundException("No user found"); } return user; }
 * 
 * }
 */