package dp_observer_vendor_locations;

import java.util.HashMap;

public class Dispatch implements Observer {
	
	private String department = "Dispatch";
	public HashMap<Integer, String> vendorLocations;
	
	public String toString(){
		return department;
	}

	public void update(HashMap<Integer, String> vendorLocations) {
		this.vendorLocations = vendorLocations;
	}

}
