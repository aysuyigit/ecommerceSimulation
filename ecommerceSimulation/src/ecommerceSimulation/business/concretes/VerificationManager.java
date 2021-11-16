package ecommerceSimulation.business.concretes;

import java.util.ArrayList;
import java.util.List;

import ecommerceSimulation.business.abstracts.VerificationService;

public class VerificationManager implements VerificationService {
	
	List<String> verification = new ArrayList<>();

	@Override
	public void sendVerifyEmail(String email) {
		verification.add(email);
		System.out.println("Doğrulandı" + email);
		
	
	}

	@Override
	public void verifyEmail(String email) {
		System.out.println("Doğrulama gönderildi" + email);
	}

	@Override
	public boolean checkVerifyUser(String email) {
		if(verification.contains(email)) {
			return true;
		}
		return false;
		


		
	}

}
