/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import  java.util.Scanner;
// import java.io;

public class GuessingGame {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean Closeprogram = true;
        int guest;
        int RNG;
        String name;
        String I;
        int tries = 0;
        while (Closeprogram) {
            

            
            System.out.println("Name Options");
            System.out.println("New name");
            System.out.println("Load name");
            I = in.nextLine();
            
            if (I.contains("New name")){
                System.out.println("Enter name");
                    name = in.nextLine();
            }
            if else (I.contains("Load name")){
                System.out.println("Type in the filename");
                    name = in.nextLine();
        }
                    
                            
            RNG = (int)(Math.random()* 10)+ 1;
      
            while (tries != 3){
                System.out.println("Name: "+name);
                System.out.println("Guest the number");
                guest = in.nextInt();
                
                if (guest > RNG){
                 
                    System.out.println(guest+" was below the generate Number");
                    ++tries;
                }
                else if (guest < RNG){
                
                    System.out.println(guest+" was below the generate Number");
                    ++tries; 
                }
                else if (guest == RNG){
                        
                    System.out.println("Correct, the number was "+RNG);
                    tries = 3;    
                        
                        }
                }
            System.out.println("Do you want to play again?");
                I = in.nextLine();
                if (I.contains("Yes"))
                    tries = 0;
                else if (I.contains("No"))
                    Closeprogram = false;
            }
        }
