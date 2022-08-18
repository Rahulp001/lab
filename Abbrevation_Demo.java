//Write a program to accept full name form the user and display the abbreviations of the first and middle names except the last name which is displayed 
//as it is. EG: Name:Manoj Rakesh Gupta  . (M.R.Gupta)
package lab;

public class Abbrevation_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abbrevation_Demo obj= new Abbrevation_Demo();
		obj.accept();
	}
	
	public void accept() {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("enter first name: ");
		String FN=sc.next();
		System.out.println("enter middle name: ");
		String MN=sc.next();
		System.out.println("enter last name: ");
		String LN=sc.next();
		char first = FN.charAt(0);
		char middle= MN.charAt(0);
		
	   System.out.println("Name = "+Character.toUpperCase(first)+"."+Character.toUpperCase(middle)+"."+" "+LN.toUpperCase());
	}

}
