package simpleproject;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;


public class Crudeoperations {
static Connection conn=null;
static Statement st=null;
static Scanner sc;
private static String sno;

public static void selectRecord() throws SQLException {
	
	try {
		conn=ConnectionUtilityClass.getConnection();
		st=conn.createStatement();
		
		//select
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	finally {
	conn.close();
	}
}
public static void updateRecord() {
	try {
		conn=ConnectionUtilityClass.getConnection();
		st=conn.createStatement();
		
		//update
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
public static void deleteRecord()  {
	try {
		conn=ConnectionUtilityClass.getConnection();
		st=conn.createStatement();
		System.out.println("Enter sno");
		String id=sc.next();
		String s="delete from department where beachsno="+ sno;
		st.executeUpdate(s);
		//delete
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
}
}
/**
 * 
 */
public static void insertRecord() {
	 sc= new Scanner(System.in);
	try {
		conn=ConnectionUtilityClass.getConnection();
		st=conn.createStatement();
		System.out.println("Enter sno");
		String sno=sc.next();
		System.out.println("Enter sname");
		String vegname=sc.next();
		System.out.println("Enter  sname2");
		String nonvegname = sc.next();
		System.out.println("Enter  rate");
		String rate = sc.next();
		String sname = null;
		String sname2=null;
		String s="insert into hotels values(" +sno+","+ ","+sname+ "'"+ ","+  "'"+sname2+","+rate+");";
				
		//st.executeUpdate(s);
		
//int i=0;
//if(i>0) {
//			System.out.println("Record is inserted successfully");
//		}
//		else {
//			System.out.println("Not inserted");
//		}
		
		//insert  
	} catch (Exception e) {
		
		e.printStackTrace();
		
	
	}
}
public static void main(String[] args) throws SQLException {
	
	while(true) {
	System.out.println("**MENU***");
	System.out.println("1.Add Record");
	System.out.println("2.Delete Record");
	System.out.println("3.Update Record");
	System.out.println("4.Display Record");
	sc=new Scanner(System.in);
	System.out.println("Enter your option");
	int ch=sc.nextInt();
	
	switch(ch) {
	case 1:  Crudeoperations.insertRecord();
	         break;
	case 2: Crudeoperations.deleteRecord();
    		break;
	case 3: Crudeoperations.updateRecord();
			break;
	case 4: Crudeoperations.selectRecord();
			break;
	         
	}
	System.out.println("Do you want to continue Y/N");
char choice=sc.next().charAt(0);
	if(ch=='N' || ch=='n') {
		break;
	}
	}
}
}




