package ecommerceSimulation.business.abstracts;

import ecommerceSimulation.entities.concretes.User;

public interface UserCheckService {
	
	boolean checkFirstName(User user);
	boolean checkLastName(User user);
	boolean checkEmail(User user);
	boolean uniqueEmail(User user);
	boolean checkPassword(User user);
	boolean checkUser(User user);

}
