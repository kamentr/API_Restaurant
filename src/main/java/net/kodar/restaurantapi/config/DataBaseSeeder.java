package net.kodar.restaurantapi.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.ApiGroup;
import net.kodar.restaurantapi.data.entities.ApiUser;
import net.kodar.restaurantapi.data.entities.ApiUserGroup;
import net.kodar.restaurantapi.data.entities.security.ApiSession;
import net.kodar.restaurantapi.dataaccess.repository.ApiGroupRepository;
import net.kodar.restaurantapi.dataaccess.repository.ApiSessionRepository;
import net.kodar.restaurantapi.dataaccess.repository.ApiUserGroupRepository;
import net.kodar.restaurantapi.dataaccess.repository.ApiUserRepository;

@Component
public class DataBaseSeeder {

	@Autowired
	private ApiGroupRepository groupRepository;

	@Autowired
	private ApiUserRepository userRepository;

	@Autowired
	private ApiUserGroupRepository userUserGroupRepository;

	@Autowired
	private ApiSessionRepository sessionRepository;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@PostConstruct
	public void seed() {

		// Group seeder
		ApiGroup userGroup = new ApiGroup();
		userGroup.setAuthority("USER");
		userGroup.setName("");

		ApiGroup adminGroup = new ApiGroup();
		adminGroup.setAuthority("ADMIN");
		adminGroup.setName("");

		groupRepository.save(userGroup);
		groupRepository.save(adminGroup);

		// User seeder
		ApiUser user = new ApiUser();
		ApiUser admin = new ApiUser();

		user.setPassword(encoder.encode("user"));
		user.setUsername("user");
		user.setName("");

		admin.setPassword(encoder.encode("admin"));
		admin.setUsername("admin");
		admin.setName("");

		userRepository.save(user);
		userRepository.save(admin);

		// User-ApiUser seeder
		ApiUserGroup userUserGroup = new ApiUserGroup();
		ApiUserGroup adminAdminGroup = new ApiUserGroup();

		userUserGroup.setApiGroup(userGroup);
		userUserGroup.setApiUser(user);
		userUserGroup.setName("");

		adminAdminGroup.setApiGroup(adminGroup);
		adminAdminGroup.setApiUser(admin);
		adminAdminGroup.setName("");

		userUserGroupRepository.save(userUserGroup);
		userUserGroupRepository.save(adminAdminGroup);

		// Session seeder
		ApiSession session = new ApiSession("username", "testToken");
		session.setUsername("user");
		sessionRepository.save(session);
	}
}
