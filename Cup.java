
/**
 Date: 8/30/2022
 Illustration of classes and methods
 Arianna Banton 
 CSCI 2302
 Ken Nguyen

  //============================ To Do: ==================
  //1. default constructor
  //2. override the toString method
  //3. come up with your own application for these classes
  //======================================================
*/

import java.util.*;

public class Cup{
  //attributes
  private double maxVol;  //maximum volume
  private double actVol;  //current volume

  //functionalities

  /*defualt constructor*/
  public Cup(){
    this.maxVol = 32.0; //default cup max vol
    this.actVol = 0.0; // default cup actual vol
  }

  /*constructor*/
  public Cup(double maxVol, double curVol){
    this.maxVol = maxVol; // max 
    this.actVol = curVol;
  }

  /*tosting method */
  public String toString(){
    return "Max volume: " + this.maxVol +
           "\nActual Volume: " + this.actVol; 
  }

  /** driver */
  
   public static void main(String[] args){
     Cup x = new Cup(6.5, 3.5);
    
     // printing out max and actual vol
      System.out.println(x);
    
      //scanner for user input 
        Scanner scan = new Scanner(System.in);
        
         // user input asking for weight of mug 
System.out.print("what is the weight of your mug ");

//store information of user cup weight 
double w = scan.nextDouble();

//user input for max volume
System.out.print(" what is your cup/mug  volume in oz ");

//store information of user max  volume 
double m = scan.nextDouble();

 // user input for actual volume   
 System.out.print(" what is your actual volume in oz ");
 
//store user input for actual volume 
double n = scan.nextDouble();
    
    //testing derived class
    Mug y = new Mug(w,m,n);
    // output to user
    System.out.println(" here is you mug/ cup measurements : ");
    // output to user 
    System.out.println(" weight : " + w +" \n max volume : " + m
                       + "\n actual volume : " + n);
   System.out.println(" when using your mug to not exceed " + m + " it will leak over ");
  }  
  
}

  //extending the class
  /* extension class*/
class Mug extends Cup{
  //attribute
  private double dryWeight;

  // constructor
  public Mug(double weight, double maxVol, double actVol){
  
  // calling super clas
    super(maxVol, actVol);
    this.dryWeight = weight; 
    }  
  // default consturctor
 public Mug(){
 
  // calling super class 
  super();
  
  // default wieght
 this.dryWeight= 2.0;
 } 
   //overriding tostring method 
 @Override
 
 public String toString(){                    
 String temp = super.toString();
  
   // temp plus dryWeight 
 temp += dryWeight;
   
   // returning temp
    return temp;  }

}













