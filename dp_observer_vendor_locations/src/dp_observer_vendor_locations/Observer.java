package dp_observer_vendor_locations;

import java.util.HashMap;

public interface Observer {
	public void update(HashMap<Integer, String> vendorLocations);
}
