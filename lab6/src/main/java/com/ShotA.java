/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

/**
 *
 * @author ntu-user
 */
class ShotA extends Thread {
 
    // Method 1
    // public void show() {
    @Override
    public void run()
    {
 
        // Iterating to print more number of times
        for (int i = 0; i < 5; i++) {
            try {
                int Min=50;
                int Max=200;
                int value = (int) (Math.random() * (Max - Min + 1)) + Min;
                System.out.println("Shot sleeping for "+value+" ms");
                Thread.sleep(value);
            }
            catch (Exception e) {
            }
        }
    }
}
 
// Class 2
// Helper Class 2 Hello
class MissB extends Thread {
 
    // Method 2
    // public void show() {
    @Override
    public void run()
    {
 
        // Iterating to print more number of times
        for (int i = 0; i < 5; i++) {
            try {
                int Min=50;
                int Max=200;
                int value = (int) (Math.random() * (Max - Min + 1)) + Min;
                System.out.println("Miss sleeping for "+value+" ms");
                Thread.sleep(value);
            }
            catch (Exception e) {
            }
        }
    }
}
 
// Class 3
// Main class
public class Ex5 {
 
    // Method 3
    // Main method
    public static void main(String[] args)
    {
 
        // Creating objects in the main() method
        ShotA obj1 = new ShotA();
        MissB obj2 = new MissB();
 
        // Starting the thread objects
        // using start() method
 
        // start() method calls the run() method
        // automatically
        obj1.start();
        obj2.start();
    }
}
