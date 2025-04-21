package com.plurasight;

public class CellPhoneApplication {

    public static void main(String[] args) {
        // You can create CellPhone objects here and perform operations
        // For example:
        CellPhone myPhone = new CellPhone(1234567, "iPhone 15", "Verizon", "987-654-3210", "John Doe");
        System.out.println("Created Phone: " + myPhone.getModel() + " with serial number: " + myPhone.getSerialNumber());

        // Example of using the parameterless constructor:
        CellPhone defaultPhone = new CellPhone();
        System.out.println("Default Phone Serial Number: " + defaultPhone.getSerialNumber()); // Should print 0

        // Example of using setters:
        defaultPhone.setModel("Samsung Galaxy S24");
        defaultPhone.setOwner("Jane Smith");
        System.out.println("Modified Phone Model: " + defaultPhone.getModel() + ", Owner: " + defaultPhone.getOwner());
    }
}

class CellPhone {
    int serialNumber;
    String model;
    String carrier;
    String phoneNumber;
    String owner;


    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}