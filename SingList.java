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
 /**  a class to encapsulate given data to add into a list */
import java.util.*;

/** a simple singly-linked list */
class SingList<T>{
   class Node<T> {
      protected T data;
      protected Node<T> next;
      protected Node<T> prev;
  
      public Node(T data){
      this.data = data;
	   this.next = null;
      this.prev = null;
      }
  } //end of node class
  protected Node<T> head;
  protected int size;
    
  // default construtor 
  public SingList(){
    this.head = null;       
  }
  // if node contains same given value
 private Node find(T data){
   Node y=head; 
   while (y!= null){
      if(y.data.equals(data)){
          return y;
      }
       y = y.next;
    }
      return null;
 }
 // insert value after node with same value as key 
public Node<T> insertAfter(T k, T v){
    Node y = find(k);
    if (y == null) {
      return addBack(v); 
    }else{
    Node s2 = new Node(v);
      s2.next = y.next;
      y.next = s2; 
      size++;
      return s2;
   }
 }

 // copy constructor
 public SingList(SingList<T> a){
   Node y = a.head;
   while(y != null){
    y = y.next;
   }
  }
    /** 
    this getter is used in the SL_Iterator class. 
	We won't need it if SL_Iterator is a derive class of this class
  */
  /* dont need this anymore or make it protected/private 
  public Node<T> getHead(){
    return this.head;	  
  }
  */
  public Iterator<T> iterator(){
	return new SL_Iterator(this);  
  }
  
  // add front
    public Node addFront(T data){
      Node tmp = new Node(data); //create a node with the given data
         if (this.head != null){ //not an empty list 
	         tmp.next= this.head; //curent head will be the next node
            this.head.prev = tmp; 
	      }		
	      this.head = tmp;//tmp is now the first node
          return tmp;
  }
  // add to back 
  public Node addBack(T x){
    Node tmp = new Node(x);
      if(this.head == null){ //empty list
         this.head = tmp;	
	      return tmp; //get out
	     }
	Node itr = this.head;
	   while(itr.next != null){
	      itr = itr.next; //advance to the next node	
	     }
	   itr.next= tmp; //next of the last node is the new node
      return tmp;
  }
  
  /** toString */
  public String toString(){
    String output = "";
    Node tmp = this.head;
	   while(tmp != null){
	      output += tmp.data + ",";
         tmp = tmp.next; //advance to the next node	  
	   }
      return output;	
  }
  // size method 
  public int size(){
    Node tmp = this.head;
    int count = 0;
      while(tmp != null){
	      count++;
	      tmp = tmp.next;
	   }
      return count;	
  }
 // remove last
  public void removeLast(){
    if(this.head != null){
      if(this.head.next == null){
	    this.head = null; //remove the only element
		return;
	  }
    }
  }
 /* remove front 
 public void deleteFront(T y){
   Node tmp = new Node(y);
   if(this.head == null){
      return  null ;
   tmp = head;
   head = head.Next();
   return head;
  }
  }
*/
// print list start from head 
public void print(){
   Node <T> itr = head; // start from head
      for(int i = 0; i < size; i++){
      System.out.print(itr.data); // print out data
      itr = itr.next; // move to the next
     }
}
  
  //find the last element
  public void lastFind(){
	  Node tmp = this.head;
	  while(tmp.next.next != null){                                           
	    tmp = tmp.next; //advance	  
	  }
     tmp.prev.next = null; // remove the link to the last node
	  tmp.prev = null;//drop the last element		
  }
  
}//end of singly linked list class


/** singly linked list iterator class */

class SL_Iterator<T> extends SingList<T> implements Iterator{
  private Node<T> cur;	
  private SingList<T> storage; //the singly-linked list
  
  public SL_Iterator(SingList<T> sl){
    this.storage = sl; 
    this.cur  = this.storage.head;	
  }
 @Override 
  public boolean hasNext(){
    return this.cur != null;
  }	
  @Override  
  public T next(){
	T data  = this.cur.data;
	this.cur = this.cur.next;//advance to the next node
    return data;	  
  }
}
