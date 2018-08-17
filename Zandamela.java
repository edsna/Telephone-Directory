import java.util.Scanner; 
import java.io.*;
import java.util.*;

/**
 * File: Zandamela.java
 * Interactive telephone directory
 * @author Edson Zandamela
 */

 public class Zandamela{
 /**Iterable collection to help print all the elements*/
	public static <E> void print(Iterable<E> collection){
		//CHECK THIS ON THE BOOK RED TAG
		Iterator<E> iterColl = collection.iterator();
		//private boolean beginning = true;		
		boolean beg = true;
		System.out.println();
		while(iterColl.hasNext()){
			if(beg){
				System.out.println(iterColl.next());
				beg = false;
			}
			else
				System.out.println(iterColl.next());
		}
	}
	public static void main(String[] args){
		BinarySearchTreeMap<String, Integer> phoneDirectory = new BinarySearchTreeMap<String, Integer>();
		Scanner keyBoard = new Scanner(System.in);
		/*
			while(dir!= 6){
			System.out.println("\n**********Phone Directory Implementation***********");
			System.out.println("\n Select an option from the Menu below");
			System.out.println("\n**********Menu***********");
			System.out.println("\t0. Search Phone Directory");
			System.out.println("\n \t1. Add a New Entry to Directory");
			System.out.println("\n \t2. Remove an entry from Directory");
			System.out.println("\n \t3. List All Entries from Directory");
			System.out.println("\n \t4. List All Names from Directory");
			System.out.println("\n \t5. List All Telephone Numbers From Firectory");
			System.out.println("\n \t6. Terminate Session");
			System.out.println("Select an option from the Menu");
		*/
		//private int dir = 0;
		//private String Name;
		int dir = 0;
		String Name;
		//for (int i=0; dir< 6; dir++)
		while(dir!= 6){
			System.out.println("\n**********Phone Directory Implementation***********");
			System.out.println("\n Select an option from the Menu below");
			System.out.println("\n**********Menu***********");
			System.out.println("\t0. Search Phone Directory");
			System.out.println("\n \t1. Add a New Entry to Directory");
			System.out.println("\n \t2. Remove an entry from Directory");
			System.out.println("\n \t3. List All Entries from Directory");
			System.out.println("\n \t4. List All Names from Directory");
			System.out.println("\n \t5. List All Telephone Numbers From Firectory");
			System.out.println("\n \t6. Terminate Session");
			System.out.println("Select an option from the Menu");

			dir = keyBoard.nextInt();
			keyBoard.nextLine();
			if(dir == 0){
				System.out.println("Testing Iplementation of Directory....");
				System.out.println("Type the Name: ");
				Name = keyBoard.nextLine();
				if(phoneDirectory.get(Name) == null){ 
					System.out.println("Error!! Name not available in Directory"); 
				}
				else
					System.out.println("Number is: "+ phoneDirectory.get(Name)); 
			}
			/* *********Adding new Entries to the Directory***************/ 
			else if(dir == 1){ 
				System.out.print("Type the Name: "); 
				Name = keyBoard.nextLine();
				int phoneNum = 0; 
				while (phoneNum < 10000||phoneNum > 99999){
					System.out.print("Error!! Type a Valid Telephone Number: "); 
					phoneNum = keyBoard.nextInt(); 
				} 
				phoneDirectory.put(Name,phoneNum); 
				System.out.println("Successfully added new phone number"); 
			}
			//THIS IF STATEMENTS ARE ACTING WEIRD-TA SESSION
			/* **********Removing a given Entry from the Directory***********/
			else if(dir == 2){ 
				System.out.print("Type the Name: "); 
				Name = keyBoard.nextLine(); 
				if(phoneDirectory.get(Name) == null)
					System.out.println("Sorry! Not available in this Directory"); 
				else{
					phoneDirectory.remove(Name); 
					System.out.println("Phone/Entry  Removed!"); 
				}
			}
			/************Printing All Entries from the Directory************/ 
			else if(dir == 3){ 
				for(Entry<String,Integer> tempDir: phoneDirectory.entrySet())
        			System.out.print(tempDir.getKey()+" , "+ tempDir.getValue()+"\n"); 
			}
				/************* All Names from Directory**************/ 
			else if(dir == 4){ 
				System.out.println("All Names from Directory"); 
				System.out.print(phoneDirectory.keySet()); 
			}
				/***********All numbers from the Directory***********/ 
			else if(dir == 5){  
				System.out.println("All Numbers of the Directory are as follows: "); 
				System.out.print(phoneDirectory.values()); 
			}

			/************ Terminating Phone Directory Session***********/ 	
			else if(dir == 6){
			}
			/********** Error Message In case of Invalid input.************/
			else{
				System.out.println("Error!! Enter a Valid Option"); 
			}
			//SHOULD I PRINT EVERYTHING HERE AGAIN??-TA SESSION
			System.out.println(); 
		}	 
			}//End of Main class
 }//End of Zandamela class
