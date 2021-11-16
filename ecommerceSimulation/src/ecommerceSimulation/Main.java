package ecommerceSimulation;

import ecommerceSimulation.Google.GoogleManager;
import ecommerceSimulation.business.concretes.UserCheckManager;
import ecommerceSimulation.business.concretes.UserManager;
import ecommerceSimulation.business.concretes.VerificationManager;
import ecommerceSimulation.core.concrete.GoogleManagerAdapter;
import ecommerceSimulation.dataAccess.concretes.HibernateUserDao;
import ecommerceSimulation.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1,"Aysu","Yiğit","aysuyigit@gmail.com","123456");
		User user1= new User(1,"Ali","Yıl","alıyıl@gmail.com","12345689");
		User user2 = new User(1,"Ayşen","Yiğit","aysenyigit@gmail.com","1234");
		//UserManager userManager = new UserManager(new HibernateUserDao(),new GoogleManagerAdapter());
		//userManager.Register(user1);
		
		
		
	}

}
