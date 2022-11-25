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
 
class Shot extends Thread {
    public void show() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Shot");
 
        }
    }
}
 
class Miss extends Thread {
    public void show() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Miss");
 
        }
    }
 
}
 

public class Ex3 {
    public static void main(String[] args) {
 
        // TODO add code
 
    }
}
