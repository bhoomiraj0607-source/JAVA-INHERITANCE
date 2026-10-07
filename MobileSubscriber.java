package com.rljit;

 class MobileSubscriber extends Subscriber {

	    int roamingNoOfMinutes;
	    double roamingCostPerMinute;

	    void getSubscriberDetails() {

	        System.out.println("\n===== MOBILE SUBSCRIBER =====");

	        super.getSubscriberDetails();

	        System.out.println("Roaming Minutes   : " + roamingNoOfMinutes);
	        System.out.println("Roaming Cost/Min  : ₹" + roamingCostPerMinute);
	    }

	    void calculateBill() {

	        double extraCallCost =
	                subscriberExtraCallsInMinutes * subscriberExtraCallCostPerMinutes;

	        double roamingCost =
	                roamingNoOfMinutes * roamingCostPerMinute;

	        double subtotal =
	                subscriberPackageCost + extraCallCost + roamingCost;

	        double tax =
	               subtotal * subscriberTaxOnBill / 100;

	        double totalBill =
	                subtotal + tax;

	        System.out.println("\n----- Mobile Bill -----");
	        System.out.println("Package Cost   : ₹" + subscriberPackageCost);
	        System.out.println("Extra Call Cost: ₹" + extraCallCost);
	        System.out.println("Roaming Cost   : ₹" + roamingCost);
	        System.out.println("Tax (10%)      : ₹" + tax);
	        System.out.println("-------------------------");
	        System.out.println("Total Bill     : ₹" + totalBill);
	    }
	}

