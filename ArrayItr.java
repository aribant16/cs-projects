/*updated code*/

abstract class Itr<E> {

public abstract boolean hasNext();

public abstract E next();

}

/**

* A specific iterator for dynamic array class

*/

class DArrayItr<E> extends Itr<E> {

private DArray<E> storage; // points at the data structure

private int curLoc; // points at the current location

// contructor

public DArrayItr(DArray<E> a) {

// deal with invalid object and range errors here

if (a == null) {

// simply initializing a to an empty DArray so that hasNext method

// won't crash.

try {

a = new DArray<E>(0);

} catch (Exception e) {

}

}

this.storage = a; // point at the same source

this.curLoc = 0; // point at the first index

}

/**

* @return true if and only if the curent location is in a valid indexing

* range

*/

public boolean hasNext() {

return this.curLoc < this.storage.length();

}

/**

* @return the element at the current index location and advance the

* currenet location to the next index slot

*/

public E next() {

return this.storage.elementAt(curLoc++);

}

}

/**

* ===================================== Please complete the remaining

* operations:

*

* //////////////////////////// To do a. implement the copy constructor b.

* implement the equals method and complete below if you have not done so

* ////////////////////////////

*

* 1. set an element to a given index, reset the size of the array as the user

* insert data pass the maxLength 2. Resize the array if the user explicitly

* invoke the operation 3. Modify the class so it can handle any kind of data

* type (generic data type class) 4. Make sure the code is fully documented and

* the file is fully described with appropriate information and algorithms

*

*

* ==================================

*

* @purpose: simple illustration of a dynamic array/vector

*/

class DArray<E> {

private final double GROW_FACTOR = 0.5;// array size growing rate

private final int DEFAULT_SIZE = 10;// default array size

public DArray() {

this.size = 10;

}

// attributes

private int size; // the array size that the user is aware of

private E[] buffer; // the actual array

// constructors

/**

* create an array with the capacity larger than the request size by the

* defined grow factor constant

*

* @param size

* - the initial user requested size of the array

*/

public DArray(int size) throws Exception {

if (size < 0) {

throw new Exception("Not a valid range");

}

this.size = size;// the user's requested array size

// capactity is user's requested size plus equivalent grow portion

int bufferSize = (int) Math.ceil(this.size + this.size * GROW_FACTOR);

// create the actual array buffer

this.buffer = (E[]) new Object[bufferSize];

}

/**

* ========+++ NEWLY ADDED METHOD FOR ITERATOR +++======= return an iterator

* for traversal

*/

public Itr<E> iterator() {

return new DArrayItr(this);

}

/**

* ========+++ NEWLY ADDED METHOD FOR ITERATOR +++======

*

*

* /**

*

* @return the user's aware size of the array

*/

public int length() {

return this.size;

}

/**

*

* @return the max length/ the capacity of the dynamic array

*/

public int maxLength() {

return this.buffer.length;

}

/**

*

* @param index

* - the location of the element in the array

* @return the element at the given location/index

*/

public E elementAt(int index) {

// handle invalid index, throwing IndexOutOfBoundsException if index is

// out of range.

if (index < 0 || index >= this.size) {

throw new IndexOutOfBoundsException("Index out of bound");

}

return this.buffer[index];

}

/**

* @return: the content of the dynamic array as a string

*/

public String toString() {

String output = "[";

for (int i = 0; i < this.size; i++)

output += " " + this.buffer[i];

return output + " ]";

}

/***

* YOUR CODE SHOULD STARTS FROM HERE NOTE: this.length() and this.size is

* the same this.maxLength() and this.buffer.length is the same the main

* difference is efficiency - we don't call the methods in the class to gain

* speed; the methods should be called from the instance of the class

****/

/**

* copy constructor - return a new instance of this class with the same

* content as the given DArray - make sure to copy the content over

*

* @param from

* - a DArray object to be copied from

*/

public DArray(DArray<E> a) {

// throwing exception of a is null

if (a == null) {

throw new NullPointerException("parameter given is null!");

}

// else, initializing buffer with a.buffer's capacity

buffer = (E[]) new Object[a.buffer.length];

// copying size

size = a.size;

// copying elements

for (int i = 0; i < size; i++) {

buffer[i] = a.buffer[i];

}

}

/**

* equal method - return true if the content of the given DArray is the same

* as this content; otherwise, return false

*/

public boolean equals(DArray<E> other) {

// checking if sizes match

if (this.size == other.size) {

// looping and comparing element by element

for (int i = 0; i < size; i++) {

if (!buffer[i].equals(other.buffer[i])) {

// mismatch found, not equal

return false;

}

}

// all elements are same in both DArrays

return true;

}

return false; // size mismatch

}

/**

* put the value into the dynamic array at the given index the array should

* grow if the given index exceed the current size

*

* @param index

* - the index in the array the value should be placed

* @param value

* - the value to be stored at the given index

*/

public void set(int index, E value) throws Exception {

if (index < 0) {// invalid index, get out and thow an exception

throw new Exception("Index out of bound");

}

if (index >= this.size) { // expand the dynamic array

// resizing the array only if size reached the end of current array

if (size >= buffer.length) {

// finding new capacity

int newCapacity = (int) (buffer.length + (buffer.length * GROW_FACTOR));

// resizing

resize(newCapacity);

}

// adding element to index=size and incrementing size

buffer[size++] = value;

// how this works: suppose we have a DArray: [12 24 36 48], if we

// try to add 100 to index 50, first, the array is resized ONLY if

// it is currently full (else not). and then add new value to the

// end of the array instead of index=50, because if we add it to

// index 50, we will need to set the values between current last

// index and this new index-1 to null, which is terrible.

} else {

// put the value into the given index, replacing old value, not

// incrementing size.

buffer[index] = value;

}

}

/**

* resize method - resize the array to the newly requested size, expansion

* is needed when the new size exceeds the buffer size, i.e the maxLength()

*/

public void resize(int newCapacity) {

// creating a new array

E[] newArr = (E[]) new Object[newCapacity];

// adjusting size if new capacity is less than size

if (size > newCapacity) {

size = newCapacity;

}

// copying elements

for (int i = 0; i < size; i++) {

newArr[i] = buffer[i];

}

// replacing old array with new

buffer = newArr;

}

}// end of DArray class

// ////////////////////////////////////////////////////////

// driver to test the dynamic array implementation

public class ArrayItr {

public static void main(String[] args) throws Exception {

// create a dynamic array

DArray<Integer> a = new DArray(5);

System.out.println(a.length());

System.out.println(a.maxLength());

// give it some values

a.set(0, 5);

a.set(1, 4);

a.set(2, 3);

a.set(3, 2);

a.set(4, 1);

System.out.println("Original content of a: " + a);

// Illustration of iterator

Itr itr = a.iterator();

System.out.println("Iterator usage:");

while (itr.hasNext()) {

System.out.println(itr.next());

}

// create a new array from a

DArray<Integer> b = new DArray(a);

System.out.println("Content of b: " + b);

// testing equals method

// check to see if the two arrays are equal

if (a.equals(b)) {

System.out.println("Array a is same as array b");

} else {

System.out.println("Array a is same as array b");

}

a.set(1, 9); // change the content of array a

// print the content of both arrays

System.out.println("Content of a: " + a);

System.out.println("Content of b: " + b);

// check to see if the two arrays are equal

if (a.equals(b)) {

System.out.println("Array a is same as array b");

} else {

System.out.println("Array a is NOT same as array b");

}

}// end of main

}