package com.plurasight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
// use loop to countdown from 10 to 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            Thread.sleep(1000); // pause for 1 second
        }

        // display "Launch!" after the countdown
    }
}
