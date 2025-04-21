package com.plurasight;

import java.util.Scanner;

public class AddressBuilder {

    public static void main(String[] args) {

        StringBuilder addresses = new StringBuilder();
        // append strings to the StringBuilder object

        // Create a Scanner object to read input from the console

        Scanner input = new Scanner(System.in);

        System.out.println("Please provide the following information: ");

        System.out.print("Full Name: ");
        String fullName = input.nextLine();

        System.out.print("Billing Street: ");
        String billingStreet = input.nextLine();

        System.out.print("Billing City: ");
        String billingCity = input.nextLine();

        System.out.print("Billing State: ");
        String billingState = input.nextLine();

        System.out.print("Billing Zip");
        String billingZip = input.nextLine();

        System.out.print("Shipping Street ");
        String shippingStreet = input.nextLine();

        System.out.print("Shipping City ");
        String shippingCity = input.nextLine();

        System.out.print("Shipping State ");
        String shippingState = input.nextLine();

        System.out.print("Shipping Zip ");
        String shippingZip = input.nextLine();

        // append strings to the StringBuilder object

        addresses.append(fullName).append("\n");
        addresses.append("Billing Address: ").append("\n");
        addresses.append(billingStreet).append("\n");
        addresses.append(billingCity).append(", ").append(billingState).append(billingZip).append("\n");

        addresses.append("Shipping Address: ").append("\n");
        addresses.append(shippingStreet).append("\n");
        addresses.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip);

        System.out.println(addresses);

    }
