
import java.util.Scanner;

public class autoRepairShop
   {
//method to display
 public static void display(String name)
      {
      System.out.println("\nHello! We will be happy to service your "+ name + " automobile today!");
      }
  
//method to calculate price as per services
public  static double carMaintenance(String name)
      {
      Scanner sc= new Scanner(System.in);
   // array of string services and double prices
      String[] services = {"Oil Change", "Tire Rotation", "Air Filter", "Check Fluids"};
      double[] prices = {39.99, 49.99, 19.99, 10.99};
   
   //total
      double total = 0;
   
   //loop in arrays and ask if user want service
      for(int i=0; i<4; i++)
         {
         System.out.println("\nDo you want this service for your " + name +" : ");
         System.out.println("service : " + services[i] + "\nand price : " + prices[i]);
         System.out.print("Enter 1 for yes otherwise 0 ==> ");
         int x = sc.nextInt();
      //if want services // add prices to total from array
         if(x == 1)
            {
            total = total + prices[i];
            }
         }
   //return
      return total;
      }
  
//method to calculatefinal price after tax and labor charge, takes price
   static void finalPrice(double price)
      {
   // totalPrice
      double totalPrice;
   
   //add 30% of price to totalPrice
      totalPrice = price + (price*0.30);
   
   //ask in car is import
      Scanner sc= new Scanner(System.in);
      System.out.print("\nIs your car imported, enter 1 for yes, otherwise 0 ==> ");
      int y = sc.nextInt();
   //if yes add 5% of the price to totalPrice
      if(y == 1)
         {
         totalPrice = totalPrice + totalPrice*0.05;
         }
   
   //last add sales tax 7% of totalPrice to totalPrice
      totalPrice = totalPrice + totalPrice*0.07;
   
   //display
      System.out.format("your total bill : $%.2f " , totalPrice);
      }   
    
        //main method
   public static void main(String[] args)
      {
      String name;
      Scanner sc= new Scanner(System.in);
   //input string name/name
      System.out.print("What make of automobile do you own : ");
      name = sc.nextLine();
   
   //call methodto display
      display(name);
   
   //call carMaintenance
      double price = carMaintenance(name);
   // call method to finalPrice
      finalPrice(price);
      }
   }
//end