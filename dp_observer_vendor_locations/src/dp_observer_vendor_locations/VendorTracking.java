package dp_observer_vendor_locations;

import java.util.HashMap;
import java.util.LinkedList;

public class VendorTracking implements Subject {
	
	public HashMap<Integer, String> vendorLocations = new HashMap<Integer, String>();
	public LinkedList<Observer> observers = new LinkedList<Observer>();

	public void registerObserver(Observer o) {
		observers.add(o);
		System.out.println(o.toString() + " registered to observe Vendor Tracking");
	}

	public void removeObserver(Observer o) {
		int observerIndex = observers.indexOf(0);
		observers.remove(observerIndex);
		
		System.out.println("Observer " + (observerIndex + 1) + " has been removed from Vendor Tracking");
	}

	public void notifyObservers() {
		for(Observer o : observers){
			o.update(vendorLocations);
		}
	}
	
	public void setVendorLocation(Integer vendorNum, String vendorLoc){
		vendorLocations.put(vendorNum, vendorLoc);
		
		System.out.println("Vendor number " + vendorNum + " has location set to " + vendorLoc);
	}
}
