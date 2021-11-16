package ecommerceSimulation.business.abstracts;

public interface VerificationService {
	
	void sendVerifyEmail(String email);
	void verifyEmail(String email);
	boolean checkVerifyUser(String email);

}
