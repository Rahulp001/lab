package lab;
//Ques 3 Write a program to reverse each word of the string
//Write a program to accept string from user and find all permutations of the string
//Write a program to accept string from the user and check it is palindrome or not without using function of string builder       
//and string buffer
public class StringBuilder_lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // rev();
		palindome();
	}
	
	public static void rev() {
		String a="rajendra";
		String v="";
		StringBuilder obj=new StringBuilder(a);
		System.out.println(a+ " reverse = "+obj.reverse());
		//without string builder
		int len=a.length();
		for(int i=len-1;i>=0;i--) {
			v+=a.charAt(i);
		}
		System.out.println("rev = "+v);
	}
	public static void permutaions() {
		// i tried but dont know the logic 
		java.util.Scanner sc= new java.util.Scanner(System.in);
    	System.out.println("enter the string value");
    	String str=sc.nextLine();
    	recur(str,"");
    	
	}
    	public static void recur(String str, String nud) {
    	int i;
    	if(str.length()==0) {
    		System.out.println(nud);
    	}
		for(i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			//System.out.println("ch "+ch);
			String ls=str.substring(0, i);
			//System.out.println("ls"+ls);
			String rs=str.substring(i+1);
			String Newud=ls+rs;
			//System.out.println("New="+Newud);
			recur(Newud,nud+ch);

		}
	}
		
	}
    public static void palindome() {
    	java.util.Scanner sc= new java.util.Scanner(System.in);
    	System.out.println("enter the string value");
    	String str=sc.nextLine();
    	String temp=str;
    	String sum="";
    	int len=temp.length();
		for(int i=len-1;i>=0;i--) {
			sum+=temp.charAt(i);
		}
		System.out.println("rev= "+sum);
		if(str.equals(sum)) {
			System.out.println("given string is palindrome");
		}
		else
			System.out.println("given string is not palindrome");
    	
		
	}
	

}
