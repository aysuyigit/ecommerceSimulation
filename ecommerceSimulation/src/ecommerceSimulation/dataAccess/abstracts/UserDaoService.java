package ecommerceSimulation.dataAccess.abstracts;

import java.util.List;

import ecommerceSimulation.entities.concretes.User;

public interface UserDaoService {
	void add(User user);
	void delete(User user);
	void update(User user);
	boolean getEmail(String email);
	boolean getPassword(String password);
	User get(int id);
	List<User> getAll();

}
