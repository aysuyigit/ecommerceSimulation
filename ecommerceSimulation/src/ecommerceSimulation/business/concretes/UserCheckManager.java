package ecommerceSimulation.business.concretes;

import java.util.regex.Pattern;

import ecommerceSimulation.business.abstracts.UserCheckService;
import ecommerceSimulation.entities.concretes.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean checkFirstName(User user) {
		if(user.getFirstName().length()>3) {
			return true;
			
		}
		System.out.println("İsim en az 2 karakterden oluşmalı.");
		return false;
	}

	@Override
	public boolean checkLastName(User user) {
		if(user.getLastName().length()>3) {
			return true;
		}
		System.out.println("Soyisim en az 2 karakterden oluşmalı.");
		return false;
	}

	@Override
	public boolean checkEmail(User user) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		
		if(pattern.matcher(user.getEmail()).find()==false){
			System.out.println("Girilen mail adresi geçersiz.");
			return false;
		}else {
			if(user.getEmail().isEmpty()) {
				System.out.println("Mail giriniz.");
			}
		}
		return true;
		
	}

	@Override
	public boolean uniqueEmail(User user) {
		
		return false;
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().length()<5) {
			return false;
		}
		else if(user.getPassword().length()==0) {
			System.out.println("Gerçersiz parola!");
			 return false;
		}
			 return true;
}
		
	

	@Override
	public boolean checkUser(User user) {
		if(checkFirstName(user)&& checkLastName(user)&&checkEmail(user)&& checkPassword(user)==true) {
			return true;
		}
		return false;
	}

}
