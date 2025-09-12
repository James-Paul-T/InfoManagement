/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.marviemiranda1;

/**
 *
 * @author CL2~PC12
 */
import java.util.Scanner;
public class CafeteriaCLI {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        System.out.println("MY CAFETERIA");
        System.out.println("[1] Snacks");
        System.out.println("[2] Drinks");
        System.out.println("Enter your choice:");
        int choi = input.nextInt();
        
        if(choi == 1) {
            System.out.println("Snacks");
            System.out.println("[1] Hotdog - 25");
            System.out.println("[2] Burger - 35");
            System.out.println("Enter your choice of snacks:");
            int snacks = input.nextInt();
            
            if(snacks == 1) {
                int hot = 25;
                System.out.println("You choose hotdog");
                System.out.println("Enter QUANTITY:");
                int quan = input.nextInt();
                int qual = quan * hot;
                System.out.println("Subtotal: " + qual);
                
                double tax = 0.12;
                double vat = qual * tax;
                double total = vat + qual;
                System.out.println("Total: " + total);
                
                double csh;
                do {
                    System.out.println("Enter your cash:");
                    csh = input.nextDouble();
                    if(csh < total) {
                        System.out.println("Insufficient cash. Please enter more money.");
                    }
                } while(csh < total);
                
                double change = csh - total;
                System.out.println("Change is: " + change);
            }
            else if(snacks == 2) {
                int burger = 35;
                System.out.println("You choose burger");
                System.out.println("Enter QUANTITY:");
                int quan = input.nextInt();
                int qual = quan * burger;
                System.out.println("Subtotal: " + qual);
                
                double tax = 0.12;
                double vat = qual * tax;
                double total = vat + qual;
                System.out.println("Total: " + total);
                
                double csh;
                do {
                    System.out.println("Enter your cash:");
                    csh = input.nextDouble();
                    if(csh < total) {
                        System.out.println("Insufficient cash. Please enter more money.");
                    }
                } while(csh < total);
                
                double change = csh - total;
                System.out.println("Change is: " + change);
            }
            else {
                System.out.println("Invalid choice for snacks!");
            }
        }
        else if(choi == 2) {
            System.out.println("Drinks");
            System.out.println("[1] Coffee - 15");
            System.out.println("[2] Tea - 12");
            System.out.println("Enter your choice of drinks:");
            int drinks = input.nextInt();
            
            if(drinks == 1) {
                int coffee = 15;
                System.out.println("You choose coffee");
                System.out.println("Enter QUANTITY:");
                int quan = input.nextInt();
                int qual = quan * coffee;
                System.out.println("Subtotal: " + qual);
                
                double tax = 0.12;
                double vat = qual * tax;
                double total = vat + qual;
                System.out.println("Total: " + total);
                
                double csh;
                do {
                    System.out.println("Enter your cash:");
                    csh = input.nextDouble();
                    if(csh < total) {
                        System.out.println("Insufficient cash. Please enter more money.");
                    }
                } while(csh < total);
                
                double change = csh - total;
                System.out.println("Change is: " + change);
            }
            else if(drinks == 2) {
                int tea = 12;
                System.out.println("You choose tea");
                System.out.println("Enter QUANTITY:");
                int quan = input.nextInt();
                int qual = quan * tea;
                System.out.println("Subtotal: " + qual);
                
                double tax = 0.12;
                double vat = qual * tax;
                double total = vat + qual;
                System.out.println("Total: " + total);
                
                double csh;
                do {
                    System.out.println("Enter your cash:");
                    csh = input.nextDouble();
                    if(csh < total) {
                        System.out.println("Insufficient cash. Please enter more money.");
                    }
                } while(csh < total);
                
                double change = csh - total;
                System.out.println("Change is: " + change);
            }
            else {
                System.out.println("Invalid choice for drinks!");
            }
        }
        else {
            System.out.println("Invalid main choice! Please select 1 or 2.");
        }
        
        input.close();
    }
}
