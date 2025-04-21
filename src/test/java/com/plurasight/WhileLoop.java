package com.plurasight;

public class WhileLoop {
    public static void main(String[] args) {
        // Initializw a counter variable
        int count = 0;

        // Use a while loop to repeat the code 5 times
        while (count < 5) {
            System.out.println("I love Java");
            count++; //Increment the counter to avoid an infinite loop
        }
    }
}
