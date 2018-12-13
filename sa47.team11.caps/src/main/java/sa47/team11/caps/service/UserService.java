package sa47.team11.caps.service;

import java.util.ArrayList;

import sa47.team11.caps.model.Role;
import sa47.team11.caps.model.User;

public interface UserService {
	ArrayList<User> findAllUsers();

	User findUser(Integer userId);

	User createUser(User user);

	User changeUser(User user);

	void removeUser(User user);

	ArrayList<Role> findRolesForUser(Integer userId);

	ArrayList<String> findRoleNamesForUser(Integer userId);

	ArrayList<String> findManagerNameByUID(Integer userId);
	
	User authenticate(String uname, String pwd);
}
