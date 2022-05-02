package simpleproject;
import java.util.Scanner;

import java.util.List;

public class Ticketbooking {
	public enum SeatStatus{
		SEAT_BOOKED,
		SEAT_NOT_BOOKED;
	}
	public enum MovieStatus{
		Movie_Available,
		Movie_NotAvailable;
	}
	public enum MovieType{
		ENGLISH,
		HINDHI;
	}
	public enum SeatType{
		NORMAL,
		EXECUTIVE,
		PREMIUM,
		VIP;
	}
	public enum paymentsStatus{
		PAID,
		UNPAID;
	}
	class User{
		int userID;
		String name;
		int dateofBirth;
		String mobNo;
		String emailId;
		String sex;
	}
	class Movie{
		int movieId;
		int theaterId;
		MovieType movieType;
		MovieStatus movieStatus;
	}
	class Theater{
		int theaterId;
		String theaterName;
		String address;
		
		List<Movie>movies;
		float rating;
	}
	class Booking<paymentStatus, Date, Time>{
		int bookingId;
		int userId;
		int movieId;
		List<Movie> bookedSeats;
		int amount;
		paymentStatus Status_of_payment;
		Date booked_date;
		Time movie_timing;
	}
	class Address{
		String city;
		String pinCode;
		String streetNo;
		String landmark;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println(":: Welcome to ticket booking::");
		
		
		while(true) {
			System.out.println("To get the details for ticket booking , Enter value 1");
			System.out.println("To get the details for users , Enter value 2 ");
			System.out.println("To get the details for movies , Enter value 3 ");
			System.out.println("To get the details for theaters , Enter value 4 ");
			System.out.println("To get the details for address , Enter value 5 ");
			
			System.out.println("To Exit, Enter value 6");
			
			System.out.println("Enter your choice ::");
			int choice = sc.nextInt();
			
			
			switch(choice) {
			case 1: System.out.println("ticket booking details are: ");
			booking();
			break;
			
			case 2: System.out.println(" details of an user: ");
			users();
			break;
			
			case 3: System.out.println("details of an movies: ");
			movies();
			break;
			
			case 4: System.out.println("details of an Theaters: ");
			Theaters();
			break;
			
			case 5: System.out.println("details of an Address: ");
			Address();
			break;
			
			case 9: System.out.println(" Exiting the application");
			System.exit(0);
			
			default:System.out.println("Incorrect input !!!!! please re enter choice from our menu");
			}
		}
				
	}

	private static void Address() {
		System.out.println("you will get city name :");
		System.out.println("you will get city pincode:");
		System.out.println("you will get street no.:");
		System.out.println("you will get LANDMARK:");
		
		
	}

	private static void Theaters() {
		System.out.println("you wil get theater ID :");
		System.out.println("you will get theater name :");
		System.out.println("you will get theater address :");
	
		
	}

	private static void movies() {
		System.out.println("you will get movie id :");
		System.out.println("you will get theater id :");
		System.out.println("you will get movie type :");
		System.out.println("you will get movie status :");
		
	}

	private static void users() {
		System.out.println("Emter the user ID:");
		System.out.println("Enter the user name:");
		System.out.println("Enter the user DOB:");
		System.out.println("Enter the user mobile no.:");
		System.out.println("Enter the user email id:");
		System.out.println("enter the user sex:");
		
		
		
	}

	private static void booking() {
		System.out.println("the seat status");
		System.out.println("the movie status");
		System.out.println("the movie type");
		System.out.println("the seat type");
		System.out.println("the payment status");
		
		
		
	}

	}


		
		
		
	
	