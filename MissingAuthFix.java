/**
* File: MissingAuthFix.java
* Author: Zachary N. Brown
* Purpose: Demonstrates a mitigation for CWE-306: Missing 
* Authentication for Critical Function that prompts the user 
* for a valid code before inputting credentials.
* 
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MissingAuthExample {
		
	public static void main(String[] args) {
	
	File file = new File("path to validcode.txt");
    	BufferedReader br = new BufferedReader(new FileReader(file));
    	String validation = br.readLine();
	
        InputStreamReader isReader = new InputStreamReader(System.in);
	BufferedReader stdin = new BufferedReader(isReader);
		
		try {	
			
		System.out.println("Enter Employee Code:");
		int ecode = Integer.parseInt(stdin.readLine());
			
			if (ecode == validation) {
			
			System.out.println("Enter Name:");
			String name = (stdin.readLine());
			System.out.println("Enter Access Level:");
			int access = Integer.parseInt(stdin.readLine());
			System.out.println("Enter SSN:");
			int ssn = Integer.parseInt(stdin.readLine());
			
			System.out.println("Your credentials:" + "\n");
			System.out.println("Name: " + name);
			System.out.println("Access Level: " + access);
			System.out.println("SSN:" + ssn);
			}
			
			else System.out.println("Invalid code");
			
        	} catch (IOException e) {
			e.printStackTrace();
			}
			
	}
}
