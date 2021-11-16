package ecommerceSimulation.business.abstracts;

import ecommerceSimulation.entities.concretes.User;

public interface UserService {
	void Register(User user);
	void Login(User user);

}
