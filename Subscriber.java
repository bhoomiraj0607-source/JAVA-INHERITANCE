package com.rljit;

public class Subscriber {

	    String subscriberName;
	    long subscriberId;
	    long subscriberPhoneNumber;
	    String subscriberPlanName;
	    int subscriberFreeCalls;
	    double subscriberPackageCost;
	    int subscriberExtraCallsInMinutes;
	    double subscriberExtraCallCostPerMinutes;
	    double subscriberTaxOnBill = 10;

	    void getSubscriberDetails() {

	        System.out.println("\n----- Subscriber Details -----");
	        System.out.println("Name              : " + subscriberName);
	        System.out.println("ID                : " + subscriberId);
	        System.out.println("Phone Number      : " + subscriberPhoneNumber);
	        System.out.println("Plan              : " + subscriberPlanName);
	        System.out.println("Free Calls        : " + subscriberFreeCalls);
	        System.out.println("Package Cost      : ₹" + subscriberPackageCost);
	        System.out.println("Extra Call Minutes: " + subscriberExtraCallsInMinutes);
	        System.out.println("Extra Call Cost   : ₹" + subscriberExtraCallCostPerMinutes);
	    }
	}

