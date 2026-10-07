package com.rljit;

public class LandLineSubscriber extends Subscriber {

	    int noOfSTDCallMinutes;
	    double costPerEachSTDMinute;

	 
	    void getSubscriberDetails() {

	        System.out.println("\n===== LANDLINE SUBSCRIBER =====");

	        super.getSubscriberDetails();

	        System.out.println("STD Call Minutes : " + noOfSTDCallMinutes);
	        System.out.println("STD Cost/Minute  : ₹" + costPerEachSTDMinute);
	    }

	    void calculateBill() {

	        double extraCallCost =
	                subscriberExtraCallsInMinutes * subscriberExtraCallCostPerMinutes;

	        double stdCallCost =
	                noOfSTDCallMinutes * costPerEachSTDMinute;

	        double subtotal =
	                subscriberPackageCost + extraCallCost + stdCallCost;

	        double tax =
	                subtotal * subscriberTaxOnBill / 100;

	        double totalBill =
	                subtotal + tax;

	        System.out.println("\n----- Landline Bill -----");
	        System.out.println("Package Cost   : ₹" + subscriberPackageCost);
	        System.out.println("Extra Call Cost: ₹" + extraCallCost);
	        System.out.println("STD Call Cost   : ₹" + stdCallCost);
	        System.out.println("Tax (10%)       : ₹" + tax);
	        System.out.println("--------------------------");
	        System.out.println("Total Bill      : ₹" + totalBill);
	    }
	}

