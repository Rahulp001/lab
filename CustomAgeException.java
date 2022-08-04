package lab;

public class CustomAgeException extends Throwable {
           
	String str;
	CustomAgeException (String arr1)
	   {
		   this.str=arr1;
	   }
	 public String toString()
		{
			return (str);
			
		}
}
-------------------------------------------------------------
	package lab;

public class CheckAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("enter the age ");
		int age=sc.nextInt();
		try {
			if(age<=18) {
				throw new CustomAgeException ("not a valid age");
			}
			else {
				throw new CustomAgeException ("valid age");
			}
			
		}
		catch(CustomAgeException e) {
			System.out.println(e);
		}
		

	}

}
