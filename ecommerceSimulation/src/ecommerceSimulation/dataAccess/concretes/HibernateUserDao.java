package ecommerceSimulation.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ecommerceSimulation.dataAccess.abstracts.UserDaoService;
import ecommerceSimulation.entities.concretes.User;

public class HibernateUserDao implements UserDaoService {
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		this.users.add(user);
		System.out.println("Hibernate ile eklendi." + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		
	}

	@Override
	public void update(User user) {
		
	}

	@Override
	public boolean getEmail(String email) {
		for(User user : users) {
			if(user.getEmail()==email) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getPassword(String password) {
		for(User user : users) {
			if(user.getPassword()==password) {
				return true;
			}
		}
		return false;
	}

	@Override
	public User get(int id) {
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
