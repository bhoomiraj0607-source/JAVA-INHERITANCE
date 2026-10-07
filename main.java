package com.rljit;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);

		        System.out.println("=================================");
		        System.out.println("   TELECOM BILLING SYSTEM");
		        System.out.println("=================================");

		        System.out.println("\n1. Mobile Subscriber");
		        System.out.println("2. Landline Subscriber");

		        System.out.print("\nEnter your choice: ");
		        int choice = sc.nextInt();

		        if (choice == 1) {

		            MobileSubscriber mobile = new MobileSubscriber();

		            System.out.println("\nEnter Mobile Subscriber Details");

		            System.out.print("Name: ");
		            mobile.subscriberName = sc.next();

		            System.out.print("Subscriber ID: ");
		            mobile.subscriberId = sc.nextLong();

		            System.out.print("Phone Number: ");
		            mobile.subscriberPhoneNumber = sc.nextLong();

		            System.out.print("Plan Name: ");
		            mobile.subscriberPlanName = sc.next();

		            System.out.print("Free Calls: ");
		            mobile.subscriberFreeCalls = sc.nextInt();

		            System.out.print("Package Cost: ");
		            mobile.subscriberPackageCost = sc.nextDouble();

		            System.out.print("Extra Call Minutes: ");
		            mobile.subscriberExtraCallsInMinutes = sc.nextInt();

		            System.out.print("Extra Call Cost Per Minute: ");
		            mobile.subscriberExtraCallCostPerMinutes = sc.nextDouble();

		            System.out.print("Roaming Minutes: ");
		            mobile.roamingNoOfMinutes = sc.nextInt();

		            System.out.print("Roaming Cost Per Minute: ");
		            mobile.roamingCostPerMinute = sc.nextDouble();

		            mobile.getSubscriberDetails();
		            mobile.calculateBill();

		        } else if (choice == 2) {

		            LandLineSubscriber landline = new LandLineSubscriber();

		            System.out.println("\nEnter Landline Subscriber Details");

		            System.out.print("Name: ");
		            landline.subscriberName = sc.next();

		            System.out.print("Subscriber ID: ");
		            landline.subscriberId = sc.nextLong();

		            System.out.print("Phone Number: ");
		            landline.subscriberPhoneNumber = sc.nextLong();

		            System.out.print("Plan Name: ");
		            landline.subscriberPlanName = sc.next();

		            System.out.print("Free Calls: ");
		            landline.subscriberFreeCalls = sc.nextInt();

		            System.out.print("Package Cost: ");
		            landline.subscriberPackageCost = sc.nextDouble();

		            System.out.print("Extra Call Minutes: ");
		            landline.subscriberExtraCallsInMinutes = sc.nextInt();

		            System.out.print("Extra Call Cost Per Minute: ");
		            landline.subscriberExtraCallCostPerMinutes = sc.nextDouble();

		            System.out.print("STD Call Minutes: ");
		            landline.noOfSTDCallMinutes = sc.nextInt();

		            System.out.print("STD Cost Per Minute: ");
		            landline.costPerEachSTDMinute = sc.nextDouble();

		            landline.getSubscriberDetails();
		            landline.calculateBill();

		        } else {

		            System.out.println("Invalid choice!");

		        }

		        sc.close();
		    }
	}

