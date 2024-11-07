//Name: Banton Arianna
//CSCI1301-01 
//Final Grade project

import java.util.Scanner;
   public class FinalGrade
{
      public static void main(String[] args) {
Scanner stdin = new Scanner(System.in);
           System.out.println("Enter program / lab average : ");
            double g1 = stdin.nextDouble();
           System.out.println("Enter test 1 grade : ");
            double g2 = stdin.nextDouble();
           System.out.println("Enter test 2 grade : ");
            double g3 = stdin.nextDouble();
           System.out.println("Enter final exam grade : ");
            double g4 = stdin.nextDouble();
double answer; 
answer = ((.4 * g1) + (.15 * g2) + (.15 * g3) + (.3 * g4));
System.out.printf("The average final grade is : %.2f" , answer);
            }
 }




