/**
 @name Arianna Banton
 @class CSCI 2305 
 @Professor Ken 
 @date March 6 2023 
 Using the given SList as a template (or any of code posted written in class) to implement a doubly linked list with the following functionalities

   Extend the SList class from a based class similar to Java Collection abstract 
      class with the following functionalities: add, clear, isEmpty, size, contains, remove, and toString.  
      =======Note: The followings operations could have similar functionality as the one listed for the abstract 
              based class ====
   Add first: add an element to the head of the list
   Add last: add an element to the end of the list
   Print: print the content of the list starting from the head
   Find: a private method that will return a reference 
    to a node if it contains the same value of a given argument
  - you may want to implement the Comparable interface, java.lang.Comparable, with compareTo method to compare all type of data
   Insert after: a method that takes a key and a value and then insert the value after the node containing the same value as the given key. 
      If there is no node matching the given key, add the new node to the end of the list.
   Implement a copy constructor for the list
   Implement a list iterator for the your 
      doubly-linked list following the standard Java ADT usage of
      iterator, and demonstrate its usage in a driver code.
*/
import java.util.*;

public class SingListDriver{
  public static void main(String[] args){
   SingList<Double> sl = new SingList();
	sl.removeLast();
	
	System.out.println(sl);
	
	sl.addFront(3.0);
	System.out.println(sl);
	sl.removeLast();
	System.out.println("After remove: " + sl);

	
	sl.addFront(5.0);
	sl.addBack(13.0);
	System.out.println(sl);
	
	sl.addFront(9.0);
	
	sl.addBack(77.0);
	System.out.println(sl);
	
	sl.removeLast();
	System.out.println("After remove: " + sl);

	System.out.println("List size: " + sl.size());
	
   // testing copy constructor 
   SingList<Double> s2 = new SingList();
   
   System.out.println(s2);
   
   s2.addFront(24.0);
   
   System.out.println(" List 1: " + sl);
   System.out.print(" List 2: "+ s2);
	
   //testing the new iterator
	Iterator itr = sl.iterator();
	while(itr.hasNext())
	  System.out.print (itr.next() + ",");
  }
}
