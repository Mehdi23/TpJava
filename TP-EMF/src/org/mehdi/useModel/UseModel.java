package org.mehdi.useModel;

import org.mehdi.model.Location;
import org.mehdi.model.User;
import org.mehdi.model.WebappFactory;
import org.mehdi.model.impl.WebappPackageImpl;

public class UseModel {
	
	public static void main(String[] args) {
	    WebappPackageImpl.init();
	    // Retrieve the default factory singleton
	    WebappFactory factory = WebappFactory.eINSTANCE;
	    // Create an instance of Location
	    Location myLocation = factory.createLocation();
	    myLocation.setName("Brest");
	    myLocation.setId("29000");
	    
	    // Create an instance of Location
	    User mehdi = factory.createUser();
	    mehdi.setName("Mehdi");
	    mehdi.setId("J44726726");
	    mehdi.setLocation(myLocation);
	    
	    System.out.println(mehdi.toString());


	  }

}
