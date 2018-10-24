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
        int tries = 0;
        while (Closeprogram) {
            
            RNG = (int)(Math.random()* 10)+ 1;
            
            String I;
            while (tries != 3){
            
                System.out.println("Guest the number");
                guest = in.nextInt();
                
                if (guest > RNG){
                 
                    System.out.println(guest+" was incorrect by "+(guest - RNG));
                    ++tries;
                }
                else if (guest < RNG){
                
                    System.out.println(guest+" was incorrect by "+(guest - RNG));
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
        
        
        
        
        
        /*  String n;
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to create a new name?");
        n = in.nextLine();
        if (n.contains("Yes")){
            System.out.println("Type in name");
            n = in.nextLine();
        }
        else if (n.contains("No")){
            n = null;
            String loadnamefromfile;
            System.out.println("Type Name fillname?");
            String filepath = in.nextLine();
            String loadedN = loadnamefromfile(filepath); 
    }
        String i;
        int RNG[];
        RNG = new int[100];
        int[] Guests;
        Guests = new int[100];
        int p;
        int o;


*/
    }//main
    
    
    // the two file reading/writing methods will go in here
    
    
    
}// class
