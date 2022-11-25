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
 
class MyThread3 implements Runnable {
    public void run()
    {
        for (int i = 0; i < 5; i++) {

            System.out.println("Thread1");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
            }
        }
    }
}
 
class MyThread4 implements Runnable {
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread2");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
            }
        }
    }
}
 
public class Ex2 {
    public static void main(String[] args)
    {
 
        // TODO add your code here
    }
}
