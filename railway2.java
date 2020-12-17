import java.util.*;  

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//import concatString.*;
class AgeException extends Exception {
	 
	 public AgeException(String str) {
	  System.out.println(str);
	 }
	}
abstract class Registration  //abstract class
{
   abstract void registerUser(); // abstract method
   
}

class Main_User extends Registration 
{
        
//------------------------------------------Registration Module----------------------------------
String first_Name;
String last_Name;
String User_Name;
String pass;
int user_Age;
Vector<String> v=new Vector<String>(); //collection class with genric 
public void registerUser() 
{
		
        Scanner register_input = new Scanner(System.in);
        System.out.println("Please Provide Your Registartion Details");
        System.out.print("FirstName: ");
        first_Name = register_input.nextLine();
        System.out.print("LastName: ");
        last_Name = register_input.nextLine();
        System.out.print("UserName: ");
        User_Name = register_input.nextLine();
        System.out.print("PassWord: ");
        pass = register_input.nextLine();
        v.add(first_Name);
        v.add(last_Name);
        v.add(User_Name);
        v.add(pass);
        
        


        
        
	
	    while(first_Name.length()!=0 || last_Name.length()!=0)
        {
        	
            System.out.print("Age: ");	
            user_Age = register_input.nextInt();
            
            
        	
            if (user_Age > 0)
            {
            	
                System.out.println("------------------------------------------------");
    	        System.out.println("Welcome to "+first_Name+" "+last_Name+" Thank you for registering");
    	        login_User();
            }
            else
            {
            	
                System.out.println("Oops!! , You Are Not Eligible Please Check Your Age");
                System.out.println("-------------------------------------------------");
                registerUser();
                
            }
            break;
        }
 
    
}


public void login_User()
{
	if(v.contains(null))
	{
		System.out.println("No User Avilable");
	}
	else
	{
String fixed_userName=v.get(2);
String fixed_password=v.get(3);	
String username,password;	
System.out.println("Please Provide Login Details");
Scanner login_scan =new Scanner(System.in);
System.out.println("Give UserName:");
username=login_scan.nextLine();
System.out.println("Give PassWord:");
password=login_scan.nextLine();

if(fixed_userName.equals(username) && fixed_password.equals(password))
{
System.out.println("Login Done Welcome To railway Management System");


}
else 
{
	System.out.println("UserName & Password Incorrect Please Check!!");	
	login_User();
}

	}
}



}

abstract class getBooking //abstract class
{ 
abstract void getbookingid();	
}

interface concatString //interface
{ 
	void concatwithstring();	
}
public class railway extends Thread	//Railway class
{
	String name;
	int age;
	String phno;
	public int bookingid[]=new int[2];
	manager Manager; //AGGREGATION 
	protected String customername;

	railway(String custname) 	//constructor overloading
	{
		customername=custname;
	}
	railway(String name,int age,String phno,int b1,int b2,manager Manager)
	{
			this.name=name;
			this.phno=phno;
			this.age=age;
			bookingid[0]=b1;
			bookingid[1]=b2;
			this.Manager=Manager;
	}

	public void run(){  
		  for(int i=1;i<5;i++){  
		    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(i);  
		  }  
		 }  
	public void getbookingid()
	{try
	{
		if(bookingid[0]==1)
		{
			System.out.println("reserved seat booked");
		}
		else
		{
			System.out.println("local seat booked");
		}
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	}
	

	public static void main(String args[])		//main
	{
		String name;
		int age;
		String phno;
		int b1;
		
		manager Manager = new manager("suraj","su67");
		Scanner sc=new Scanner(System.in);
		Main_User obj_User = new Main_User(); 
		obj_User.registerUser();              
		//obj_User.login_User();
		/* obj[0]=new register(args[0],1988); */	//command line argument
		
		System.out.println("Enter 1 for reserved seat booked && Enter 2 for local seat booked");
		b1=sc.nextInt();
		if(b1 != 1 && b1 != 2)
		{
			System.out.println("Wrong Input! ");
			System.out.println("Enter 1 for reserved seat booked && Enter 2 for local seat booked");
			b1=sc.nextInt();
		 }
		
		
	
		/* obj[1].display("online"); */
		
		System.out.println("Rajdhani Express");
		long startTime = System.currentTimeMillis();

		System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms"); //string time
		startTime = System.currentTimeMillis();
		System.out.println("Time taken by Concating with StringBuffer class: "+(System.currentTimeMillis()-startTime)+"ms"); //string buffer time
		System.out.println("your Ticket Booked...");
	}
	
	
}


class manager  //Aggregation
{
  
  String manname;
  String managerID;
  
  manager(String manname, String managerID) {
    this.manname = manname;
    this.managerID = managerID;
  }
}
