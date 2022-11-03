/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.io.*;
import java.util.*;
/**
 *
 * @author ntu-user
 */
 
// Class 1
// Helper class implementing Runnable interface
class MyThread1 implements Runnable {
 
    // run() method inside this class
    public void run()
    {
        // Iterating to get more execution of threads
        for (int i = 0; i < 5; i++) {
 
            // Print statement whenever run() method
            // of this class is called
            System.out.println("Thread1");
 
            // Getting sleep method in try block to
            // check for any exceptions
            try {
                // Making the thread pause for a certain
                // time using sleep() method
                Thread.sleep(1000);
            }
 
            // Catch block to handle the exceptions
            catch (Exception e) {
            }
        }
    }
}
 
// Class 2
// Helper class implementing Runnable interface
class MyThread2 implements Runnable {
 
    // run() method inside this class
    public void run()
    {
        for (int i = 0; i < 5; i++) {
 
            // Print statement whenever run() method
            // of this class is called
            System.out.println("Thread2");
 
            // Getting sleep method in try block to
            // check for any exceptions
            try {
 
                // Making the thread pause for a certain
                // time
                // using sleep() method
                Thread.sleep(1000);
            }
 
            // Catch block to handle the exceptions
            catch (Exception e) {
            }
        }
    }
}
 
// Class 3
// Main class
public class Ex2 {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // TODO add your code here
    }
}
