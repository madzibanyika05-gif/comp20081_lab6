/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

/**
 *
 * @author ntu-user
 */
// Example 1
// Java Program to illustrate Output Without sleep() Method
 
// Class 1
// Helper Class 1
class Shot extends Thread {
 
    // Method 1
    public void show() {
 
        // Iterating to print more number of times
        for (int i = 0; i < 5; i++) {
 
            // Print statement whenever method
            // of this class is called
            System.out.println("Shot");
 
        }
    }
}
 
// Class 2
// Helper Class 2
class Miss extends Thread {
 
    // Method 2
    public void show() {
 
        // Iterating to print more number of times
        for (int i = 0; i < 5; i++) {
 
            // Print statement whenever method
            // of this class is called
            System.out.println("Miss");
 
        }
    }
 
}
 
// Class 3
// Main class
public class Ex3 {
 
    // Method 3
    // Main method
    public static void main(String[] args) {
 
        // TODO add code
 
    }
}
