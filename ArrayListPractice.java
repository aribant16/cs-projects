import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListPractice{
    public static void main(String[] args){


//create an arraylist to store vowels
ArrayList<Character>vowel = new ArrayList<>();


//add 2 vowels to end of list
vowel.add('A');
vowel.add('E');


//insert 2 in the front
vowel.add(0,'I');
vowel.add(0,'U');
System.out.println(vowel);


//print number of elements in list
System.out.println("The number is " + vowel.size() + " elements");


//print list 
System.out.println(vowel);


// retrieve an element in index 1 (and print it)
System.out.println(vowel.get(1));


// remove an element
vowel.remove(1);
System.out.println(vowel);


// remove the last element
vowel.remove(vowel.size() - 1);
System.out.println(vowel);


//how to not get gibberish when printing arraylist 
int [] nums = {1,2,3,4};
System.out.println(nums);// this doesnt work the way we want 

//main component to that (run with our this to see) 
System.out.println(Arrays.toString(nums));//this one does work the way we want
}
}
