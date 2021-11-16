package ecommerceSimulation.core.concrete;

import ecommerceSimulation.Google.GoogleManager;
import ecommerceSimulation.core.abstracts.GoogleService;


public class GoogleManagerAdapter implements GoogleService {

	@Override
	public void log(String email) {
		   GoogleManager manager = new GoogleManager();
		   manager.logs(email);
		
	}

}
