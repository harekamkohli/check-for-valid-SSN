// Harekam Kohli
// SBU ID- 115148763
// CSE-114

import java.util.*;
public class lab4_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter your SSN: ");
		String n = input.nextLine();
		String z= "Hi I'm Singh";
		
		//char ch1 = n.charAt(3);
		//char ch2 = n.charAt(6);
		
		if (n.charAt(3) == '-' && n.charAt(6) == '-') {
			
			for(int i =0; i<n.length();i++) {
				
				char ch = n.charAt(i);
				
				if (i==3 || i == 6) {}
				else
				{
					if (Character.isDigit(ch)) {
					}
				
					else {
					
						System.out.println(n + " is an invalid social security number");
						break;
					}
				}	
			}
			System.out.println("The ssn is valid.");
			System.out.println(z);
		}
		else
			System.out.println(n + " is an invalid social security number");	
		
	}
}

