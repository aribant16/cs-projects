import java.util.Scanner;
public class CalcFinalPrice { 

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
double prePrice= getOrderPrice();
System.out.println("prePrice =" + prePrice);
System.out.println("Do you get the 25% of discount");
boolean discount = scan.nextBoolean();
double finalPrice =calcFinal(prePrice, discount);
System.out.println("Your final total price is: " + finalPrice);
}

public static double getOrderPrice(){
Scanner scan2= new Scanner(System.in);
double price = 0; 
System.out.println("Do you want Printer Paper? true or false");
boolean printPaper =scan2.nextBoolean();

System.out.println("Do you want Printer Ink? true or false");
boolean printInk =scan2.nextBoolean();

System.out.println("Do you want a Printer? true or false");
boolean printer =scan2.nextBoolean();

System.out.println("Do you want Ink Pens? true or false");
boolean inkPens =scan2.nextBoolean();

double paperCost = 0.0;
double inkCost = 0.0;
double printerCost= 0.0;
double pensCost = 0.0;
if (printPaper == true)
{
paperCost=5.0;
}

if (printInk == true)
{
inkCost=20.0;
}
if (printer == true)
{
printerCost=100.0;
}
if (inkPens == true)
{
pensCost=3.99;
}

price = paperCost + inkCost+ printerCost + pensCost;

return price;
}


public static double calcFinal(double price, boolean disc){
      double total = 0.0;
      double tax = 8.4;
      double discount = .25;
      double subtotal = 0.0;
      
      //1) Accepts subPrice amount and whether discount applies as parameters.
      if (disc == true)
      {
         subtotal = price * discount;
     
      } 
      else
      {
         subtotal = price;
         
      }
  
     
     total = subtotal + (subtotal * tax);
      return total;
   }
} 
