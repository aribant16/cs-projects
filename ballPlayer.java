import java.util.Scanner;

public class ballPlayer
{
   public static void main(String[] args)
   {
   //Create Scanner object
   Scanner bb = new Scanner(System.in);
   
   // Create 3 Arrays called name, team and city
   // Initialize team and city, but get input for name
   String[] team = {"Hawks", "Lakers", "Bucks"};
   String[] city = {"Atlanta", "Los Angeles", "Milwaukee"};
   String[] name = new String[3];
   
   //Get Players from User Input
   for(int num = 0; num < name.length; num++)
   {
   System.out.println("Enter Player"+(num+1)+" Name: ");
   name[num] = bb.nextLine();
   System.out.println("You entered Player: "+name[num]);
   }
   
   
   //Output Chart of all Arrays
   System.out.println("***********************************************");
   System.out.println("NAME\t\t\t\t\t\tTEAM\t\t\t\t\t\tCITY");
   System.out.println("***********************************************");
   
   
   for(int num = 0; num < name.length; num++)
   {
   System.out.println(name[num]+"\t\t\t\t"+team[num]+"\t\t\t\t\t\t"+city[num]);
   }
   }
}