import java.io.*;
import java.util.*;

/**
 * File: Tester.java
 *@author Edson Zandamela
 *
 * This is a simple test driver application to test your BinarySearchTreeMap 
 * class. It should perform the following operations.
 * 1. Insert all strings contained in the array S into the binary search 
 *    tree bst using the strings as keys and arbitrary integers as values.
 * 2. Print all entries as legible key-value pairs using the method 
 *    entrySet().
 * 3. Test the methods get(), put() and remove().
 * 4. Print all values using the method values().
 * 5. Print all keys using the method keySet().
 */

public class Tester {

/**Trying to use an iterable collection can help*/
   public static <E> void println(Iterable<E> collection) {
    Iterator<E> IterColl = collection.iterator();
    System.out.print("[");
    boolean first = true;
    while (IterColl.hasNext()) {
      if (first) {
        System.out.print(IterColl.next());
        first = false;
      }
      else
        System.out.print(", " + IterColl.next());
    }
    System.out.println("]");
  }
  
/**Main should be after the iterator like here*/
  public static void main(String args[]) {
    BinarySearchTreeMap<String, Integer> myBst 
      = new BinarySearchTreeMap<String, Integer>();
    String S[] = {"gamma", "phi", "delta", "beta", "alpha", "lambda", "epsilon", "zeta" };

    //Perfoorming 1 Inserting entries in the array 
        for(int j=0; j<S.length; j++)
          myBst.put(S[j],new Integer(j));
      
      //Performing 2 printing entries using the method value
    	for(Entry<String,Integer> tempBst: myBst.entrySet())
        System.out.print(tempBst.getKey()+" , "+ tempBst.getValue()+"\n"); 
      
      //Performing 3 testing method get, put and remove 
      /**************Testing get()***************/
        System.out.println("Testing get....");
    	System.out.println(myBst.get("delta"));
    	System.out.println( myBst.get("zeta"));		//testing get
    	System.out.println(myBst.keySet()); 
    	System.out.println(myBst.values());
    	
    	/**************Testing put()***************/
	System.out.println("\n Puting theta....");
    	myBst.put("Theta", 9);//testing put
    	System.out.println(myBst.keySet()); 
    	System.out.println(myBst.values()); 
    	System.out.println("Puting Sigma....");
    	myBst.put("Sigma", 10);//testing put
    	System.out.println(myBst.keySet()); 
    	System.out.println(myBst.values());

    	/**************Testing remove()***************/
	System.out.println("\n Removing lambda....");
    	myBst.remove("lambda");				//testing remove
    	System.out.println(myBst.keySet()); 
    	System.out.println(myBst.values()); 
    	System.out.println("Removing phi....");
    	myBst.remove("phi");				//testing remove
    	System.out.println(myBst.keySet()); 
    	System.out.println(myBst.values());

      //Performing 4 testing the methods
      System.out.println("\n Testing all methods....");
      System.out.println(myBst.values()); 
      
      //Performing 5 testing keySet method
  	System.out.println(myBst.keySet()); 
  }
}
