package org.mehdi.model.webapp.usemodel;

import org.mehdi.model.webapp.*;
import org.mehdi.model.webapp.impl.webappPackageImpl;

public class UseModel {
	
	  public static void main(String[] args) {
		    webappPackageImpl.init();
		    // Retrieve the default factory singleton
		    webappFactory factory = webappFactory.eINSTANCE;
		    // Create a Location
		    Location brest = factory.createLocation();
		    brest.setName("Brest");
		    brest.setId("29200");
		    // Create a PrivateUser
		    PrivateUser mehdi = factory.createPrivateUser();
		    mehdi.setName("Mehdi");
		    mehdi.setId("J440734");
		    mehdi.setPassword(1234);
		    mehdi.setLocation(brest);   
		    
		    System.out.println(mehdi.toString());
		  }

}
