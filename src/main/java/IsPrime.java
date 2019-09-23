
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baileyanderson
 */
public class IsPrime {
     public static void main(String args[]) 
    { 
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        int num = keyboard.nextInt();
        
        if (isPrime(num)) 
            System.out.println("Is " + num + " a prime number? \n Yes"); 
        else
            System.out.println("Is " + num + " a prime number? \n No"); 
    } 

     static boolean isPrime(int n) 
    { 
        // Corner case 
        if (n <= 1) 
            return false; 
  
        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
    } 
  
   
    
}
