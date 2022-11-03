/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

/**
 *
 * @author ntu-user
 */

class Shot2 extends Thread {
 
    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++) {
 
            // Print statement
            System.out.println("Shot");
 
            // TODO create a delay of 100 ms
        }
    }
}
 
class Miss2 extends Thread {
 
    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++) {
 
            System.out.println("Miss");
 
            // TODO create a delay of 100 ms
        }
    }
}
 
public class Ex4 {
 
    public static void main(String[] args)
    {
 
        // TODO add code here!
    }
}
