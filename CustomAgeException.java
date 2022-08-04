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
