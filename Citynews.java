package simpleproject;

import java.util.Scanner;

public class Citynews {
	
	public static void News(){
		Scanner sc = new Scanner(System.in);
		System.out.println(":: Welcome to City news ::");
		
		
		
		while(true) {
			System.out.println("To display channel news 1 , Enter value 1");
			System.out.println("To display channel news 2 , Enter value 2");
			System.out.println("To Exit, Enter value 9");
			
			System.out.println("Enter your choice ::");
			int choice = sc.nextInt();
			
			
			switch(choice) {
			case 1: System.out.println(" Welcome to public city news ");
			break;
			case 2: System.out.println(" Welcome to Star city news ");
			break;
			case 9: System.out.println(" Exiting the application");
			System.exit(0);
			
			default:System.out.println("Incorrect input !!!!! please re enter choice from our menu");
			}
		}
				
	}

	}

		
	
