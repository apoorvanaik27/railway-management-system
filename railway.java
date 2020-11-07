import java.util.*;  
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;   

public class railway	//Railway class
{
	String name;
	String age;
	String phno;
	int bookingid[]=new int[2];
	manager Manager; //AGGREGATION 
	protected String customername;

	railway(String custname) 	//constructor overloading
	{
		customername=custname;
	}
	railway(String name,String age,String phno,int b1,int b2,manager Manager)
	 {
			this.name=name;
			this.phno=phno;
			this.age=age;
			bookingid[0]=b1;
			bookingid[1]=b2;
			this.Manager=Manager;
	}

	public void getbookingid()
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

	public static String concatwithstring() 	//string class
	{
		String bookingappid="A1234";
		System.out.println("Booking APP ID : " + bookingappid);
		for(int i=0;i<1000;i++)
		{
			bookingappid=bookingappid+"bookingappid";
		}
		return bookingappid;
	}

	public static String concatwithstringbuffer()  //string buffer class
	{
		StringBuffer sb=new StringBuffer("A1234");
		int p = sb.length();
		System.out.println("Length of string Booking App  id =" + p);
		for (int i=0;i<1000;i++)
		{
			sb.append("bookingappid");
		}
		return sb.toString();
	}


	public static void main(String args[])		//main
	{
		String name;
		String age;
		String phno;
		int b1,b2;
		
		manager Manager = new manager("suraj","su67");
		Scanner sc=new Scanner(System.in);
		register.intro s1 = new register.intro();    
		register obj[] = new register[1];
		register.change();                
		s1.show();
		obj[0]=new register(args[0],1988); 	//command line argument
		System.out.println("****************");
		System.out.println("Enter ur name");
		name=sc.nextLine();
		System.out.println("Enter ur age");
		age=sc.nextLine();
		System.out.println("Enter ur phno");
		phno=sc.nextLine();
		System.out.println("Enter 1 for reserved seat booked && Enter 2 for local seat booked");
		b1=sc.nextInt();
		b2=sc.nextInt();
		System.out.println("****************");
		railway br= new railway(name,age,phno,b1,b2,Manager);
		br.getbookingid();
		obj[0].display("online");
		System.out.println("Manager Name: "+br.Manager.manname);
		System.out.println("Manager ID: "+br.Manager.managerID);
		System.out.println("****Rajdhani Express****");
		long startTime = System.currentTimeMillis();
		concatwithstring();
		System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms"); //string time
		startTime = System.currentTimeMillis();
		concatwithstringbuffer();
		System.out.println("Time taken by Concating with StringBuffer class: "+(System.currentTimeMillis()-startTime)+"ms"); //string buffer time
	}
}

class register extends railway      //Register class
{
	static String registerman = "joy";     //static variable  
	static void change()              //static function
	{
		registerman="jack";
	}
	static 
	{ 
		System.out.println("Hello");
	}     
	register(String custname, int registerid)
	{
		super(custname);
		int regid=registerid;
	}
	register(String custname, int registerid, int password)    
	{
		super(custname);
		int p=password;
		int regid= registerid;
	}
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();
	void display()
	{
		System.out.println(customername);
		System.out.println(dtf.format(now));
	}
	void display(String mode)  //function overloading          
	{
		System.out.println("\n"+"Registerman in charge : "+registerman+"\n"+"Customer Name : "+customername);
		System.out.println(dtf.format(now));
		System.out.println("Booked by : "+mode);
	}
	static class intro     //static class
	{
		void show()
		{
			System.out.println("Welcome to railway booking system");
		}
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
