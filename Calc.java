/* @author Arianna Banton
   @ Dr.Nguyen 
   @Data Structures 
   The problem to to create a code that works like a calculator 
   Uses: Enter two numbers and an operation andn the code will solve the 
   the porblem for you
   Algorithim: 
   1. Import scanner 
   2. Prompt user to enter first and second number 
   3. Prompt user to enter operation
   4. Create case and break scenario to tell code what to di in certain situations
   5. Print final results 
   */
   
import java.util.*;

public class Calc {
   public static void main(String[]args){
    Scanner c = new Scanner(System.in);
         System.out.println("Enter first number: ");
         // to store input 1
         double n1 = c.nextDouble();
         System.out.println("Enter second number: ");
         // to store input two
         double n2 = c.nextDouble();
         System.out.println("Enter the operations (+,-,*,/)");
         // to create the option to select an operation
         char opp = c.next().charAt(0);
         double h = 0;
            switch (opp){
         // to add two number
               case '+': 
               h = n1 + n2; 
               break; 
         // to subtact two numbers
               case '-': 
               h = n1 - n2; 
               break; 
         // to multiply two number      
               case '*': 
               h = n1 * n2;
               break;
         // to subtract two numbers    
               case '/': 
               h = n1 / n2; 
               break;
          // incorrect input
               default:    
               System.out.println("Wrong input please try again.");
               break;
               }  
         // to display reults      
            System.out.println("Results: ");
            System.out.println(n1 + " " + opp+ " " + n2 + " = " + h);
            }
        
 }