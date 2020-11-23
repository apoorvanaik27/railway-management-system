package concatString;

public class concatString {
	public String concatwithstringbuffer()  //string buffer class
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
}
