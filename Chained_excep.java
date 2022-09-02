//Q1: Write a program to create the chained exception where one exception describes the cause of another exception.
package lab;

import java.io.IOException;

public class Chained_excep {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		    { 

		      NumberFormatException a = new NumberFormatException("--> Exception"); 

		      a.initCause(new NullPointerException("--> Actual cause of the exception")); 

		      throw a; 
		    } 

		    catch(NumberFormatException a) 
		    { 

		      System.out.println(a); 
		      System.out.println(a.getCause()); 
		    } 
		  
	}

}
