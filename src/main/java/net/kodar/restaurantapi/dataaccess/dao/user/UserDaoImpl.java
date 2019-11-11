//package net.kodar.restaurantapi.dataaccess.dao.user;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Component;
//
//import net.kodar.restaurantapi.data.entities.user.CustomUser;
//import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;
//import net.kodar.restaurantapi.dataaccess.repository.UserRepository;
//
//@Component
//public class UserDaoImpl extends DaoGenericImpl<CustomUser, Integer> implements UserDao {
//
//	@Autowired
//	private UserRepository repository;
//
//	@Autowired
//	private BCryptPasswordEncoder encoder;
//
//	@Override
//	protected Integer getId(CustomUser entity) {
//		return entity.getId();
//	}
//
//	@Override
//	public CustomUser findByUsername(String username) {
//		return repository.findByUsername(username);
//	}
//
//	@Override
//	public CustomUser save(CustomUser user) {
//		if (user != null) {
//			user.setPassword(encoder.encode(user.getPassword()));
//			return this.repository.save(user);
//		}
//		return null;
//	}
//}
