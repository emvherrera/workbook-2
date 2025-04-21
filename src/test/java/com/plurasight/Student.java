package com.plurasight;

public class Student {
    //field members
    private String firstName;
    private String lastName;


    //constructor
    public Student(){
        this.firstName = "";
        this.lastName = "";
    }

    //this constructor not needed for exercise
    //   public Student(String firstName, String lastName){
    //      this.firstName = firstName;
    //      this.lastName = lastName;
    //   }

    //getter
    public String getFirstName(){
        return this.firstName;
    }

    //setter
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    //getter
    public String getLastName(){
        return this.lastName;
    }

    //setter
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

