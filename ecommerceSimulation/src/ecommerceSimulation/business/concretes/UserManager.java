package ecommerceSimulation.business.concretes;

import ecommerceSimulation.business.abstracts.UserCheckService;
import ecommerceSimulation.business.abstracts.UserService;
import ecommerceSimulation.business.abstracts.VerificationService;
import ecommerceSimulation.core.abstracts.GoogleService;
import ecommerceSimulation.dataAccess.abstracts.UserDaoService;
import ecommerceSimulation.entities.concretes.User;


public class UserManager implements UserService{
	
	UserCheckService userCheckService;
	UserDaoService userDaoService;
	VerificationService verificationService;
	GoogleService googleService;
	

	public UserManager(UserCheckService userCheckService, UserService userService,
			VerificationService verificationService,GoogleService googleService) {
		super();
		this.userCheckService = userCheckService;
		this.userDaoService = userDaoService;
		this.verificationService = verificationService;
		this.googleService = googleService;
	}

	@Override
	public void Register(User user) {
		
		if(userCheckService.checkUser(user)==true) {
			System.out.println("Kullanıcı kayıt edildi." + user.getFirstName());
			verificationService.sendVerifyEmail(user.getEmail());//doğrulama mesajı
			userDaoService.add(user);
			googleService.log("Kullanıcı eklendi."+ user.getFirstName());
		}
		
	}

	@Override
	public void Login(User user) {
		
		verificationService.verifyEmail(user.getEmail());
		
		if(userDaoService.getEmail(user.getEmail()) && userDaoService.getPassword(user.getPassword()) && 
				verificationService.checkVerifyUser(user.getEmail()) == true){
			System.out.println("Başarılı.");
			
			
		}else {
			System.out.println("Başarısız giriş.");
		}
		
	}

}
