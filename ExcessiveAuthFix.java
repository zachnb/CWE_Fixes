/**
* File: ExcessiveAuthFix.java
* Author: Zachary N. Brown
* Purpose: Demonstrates a mitigation for CWE-307: 
* Improper Restriction of Excessive Authentication 
* Attempts which uses a counter to limit the attempts
* and stop a user from conducting a brute force attack.
*/

import java.io.*;

public class ExcessiveAuthFix {

    public static void main(String[] args) throws IOException {
 
        InputStreamReader isReader = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(isReader);
	    
        // include starting value for counter
        int login_attempts = 1;

		while (true) {
			
		// condition for max login attempts
			if (login_attempts <= 3) {
			
			System.out.println("What would you like to do?");
			System.out.println("1. Login");
			System.out.println("2. Exit");
				
			int input = Integer.parseInt(stdin.readLine());
	            
	           if (input == 1) {
	        	   System.out.println("Enter your username:");
	        	   String loginUsername = (stdin.readLine());
	        	   System.out.println("Enter your password:");
	        	   String loginPassword = (stdin.readLine());
                    
                   if(args[0].equals(loginPassword)) {
                	   System.out.println("Welcome back!");
                	   break;

                    } else {
	                   System.out.println("Invalid");
	                   // increment counter
	                   login_attempts++;
	                   continue;
                    }
                   
	            } else if (input == 2) {
	            	System.out.println("Exiting....");
	            	break;
	            	
	            } else {
	                System.out.println("Invalid input");
	            }
	           
            } else {
            	// display error when max attempts are met
                System.out.println("Contact your administrator.");
                break;
            }
        } 
    }
}
