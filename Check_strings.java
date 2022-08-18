package lab;
////Ques 2 Write a program to check if two strings are created with same character
//Write a program to accept two strings from the use and check if first contains second
//Write a program to swap two strings without using third variable
public class Check_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		same_char();
		firstContainSecond();
		swapString();

	}
	public static void same_char() {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("enter two words to check if they are created from same character");
		String w1= sc.nextLine();
		String w2=sc.nextLine();
		
		if(w1.charAt(0) == w2.charAt(0)  ) {
			System.out.println("created from same charater");
		}
		else
			System.out.println("not created from same character");
	}
	public static void firstContainSecond() {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("enter two words to check if the first word contains second");
		String w1= sc.nextLine();
		String w2=sc.nextLine();
		if(w1.contains(w2)) {
			System.out.println("first word contains the second");
		    System.out.println(w1.contains(w2));
		    }
		else
			System.out.println("first word does not contains the second");
		    System.out.println(w1.contains(w2));
		}
	public static void swapString() {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("enter two words to check to swap to strings");
		String w1= sc.nextLine(); //if 2
		String w2=sc.nextLine();  //3
		w1=w1+w2;  //5
		w2=w1.substring(0,w1.length()-w2.length()); //5-3=2
		w1=w1.substring(w2.length());  //3
		
		System.out.println("after swap :"+w1+" "+w2);
		
	}
	

}
