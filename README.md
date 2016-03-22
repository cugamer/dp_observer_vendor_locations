Vendor Locations observer design pattern
========================================

An implementation of the observer pattern as applied to an application which track food vendor locations at an event.  The Subject and
Observer interfaces provide the necessary methods to register, remove and notify observers.  Subject is implemented by the 
VendorTracking class which includes a hash map.  The hash map stores each vendor cart number, as well as a string which describes
it's location.  VendorTracking sets the locations in the hash map and when it does so it calls the notifyObservers method to update
the observer classes.  The respective data in each registered observer is updated automatically in this way.  This is basic practice with
the observer pattern.

![UML diagram of project](https://github.com/cugamer/dp_observer_vendor_locations/blob/master/dp_observer_vendor_locations/dp_observer_vendor_locations.png)
