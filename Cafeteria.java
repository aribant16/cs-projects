//Group6Assignment3
//CSCI 1301
//10.5.21
import java.util.Scanner;
public class Cafeteria{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
   String [] food = new String [5];
   double [] cost = new double [5];
   String [] day = {"Monday" , "Tuesday" , "Wednesday" , "Thursday", "Friday"};
   

for(int i = 0; i < 5; i++)
   {
   System.out.println("What course will be served on " +(day[i]) + "?");
   food[i]= input.nextLine();
   }
for(int i = 0; i < 5;i++)
 {
   System.out.println("What is the price for " + (food[i]) + "?");
   cost[i] = input.nextDouble();
 }
   
double max = cost [0];
int placeHolder = 0;
for(int i = 0; i < cost.length; i++) {
if(cost[i] > max) {
max = cost[i];
placeHolder = i;
 }
 }
 
System.out.println ("Enter an entree to search for: ");
String entry =input.nextLine();

String search = input.nextLine();
for(int i = 0; i < 5;i++){
   if(search.equals(food[i])) {
System.out.println(search + " is served on " + day[i] + ".");
}
}

System.out.println("The highest price entree is " + food[placeHolder] + ".");
   
}
}