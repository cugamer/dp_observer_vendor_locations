package dp_observer_vendor_locations;

public class UpdateVendorLocations {

	public static void main(String[] args) {
		VendorTracking vendorTracker = new VendorTracking();
		Dispatch dispatch = new Dispatch();
		Security security = new Security();
		Scheduling scheduling = new Scheduling();
		
		vendorTracker.setVendorLocation(1, "Entrance");
		vendorTracker.setVendorLocation(2, "DJ booth");
		vendorTracker.setVendorLocation(3, "Food court");
		System.out.println(vendorTracker.vendorLocations);
		System.out.println("\n");
		
		vendorTracker.registerObserver(dispatch);
		vendorTracker.registerObserver(security);
		
		System.out.println("Dispatch and security registered but notification not sent");
		System.out.println("Dispatch vendor locations: " + dispatch.vendorLocations);
		System.out.println("Security vendor locations " + security.vendorLocations);
		System.out.println("\n");
		
		vendorTracker.notifyObservers();
		System.out.println("VendorTracking has sent notifications");
		System.out.println("Dispatch vendor locations: " + dispatch.vendorLocations);
		System.out.println("Security vendor locations " + security.vendorLocations);
		System.out.println("\n");
		
		vendorTracker.registerObserver(scheduling);
		System.out.println("Scheduling registered but notification not sent");
		System.out.println("Dispatch vendor locations: " + dispatch.vendorLocations);
		System.out.println("Security vendor locations " + security.vendorLocations);
		System.out.println("Scheduling vendor locations " + scheduling.vendorLocations);
		System.out.println("\n");
		
		vendorTracker.notifyObservers();
		System.out.println("VendorTracking has sent notifications");
		System.out.println("Dispatch vendor locations: " + dispatch.vendorLocations);
		System.out.println("Security vendor locations " + security.vendorLocations);
		System.out.println("Scheduling vendor locations " + scheduling.vendorLocations);
		System.out.println("\n");
		
		vendorTracker.setVendorLocation(1, "First aid station");
		System.out.println("Vendor one moved to the first aid station");
		System.out.println("Dispatch vendor locations: " + dispatch.vendorLocations);
		System.out.println("Security vendor locations " + security.vendorLocations);
		System.out.println("Scheduling vendor locations " + scheduling.vendorLocations);
		System.out.println("\n");
		
		vendorTracker.setVendorLocation(3, "Stage two");
		System.out.println("Vendor three moved next to state two");
		System.out.println("Dispatch vendor locations: " + dispatch.vendorLocations);
		System.out.println("Security vendor locations " + security.vendorLocations);
		System.out.println("Scheduling vendor locations " + scheduling.vendorLocations);
		System.out.println("\n");
	}

}
