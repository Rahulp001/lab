package collection;

import java.util.*;

//)write a program to accept name, Email, Phone Number, Percentage from the user and store the data using arraylist.
//Accept name from the user and remove all the data from the list and display the output.
//and also perform the searching operation with the help of the name.
public class Arraylist_lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al2 = new ArrayList<>();
		String str="";
		
	    Scanner sc2= new Scanner(System.in);
		char ch;
		char s;
		do {
		System.out.println("what do u want to do 1. enter detail \t2.delete name \n\t\t 3. sort list");
		int v=sc2.nextInt();
		switch(v) {
		
			case 1:
				acc();
	         break;	
	         
		    case 2: al2=name();
		    al2.clear();
		    System.out.println("clear list ");
		    System.out.println(al2);  
	        break;
		    case 3:al2=name();
		    Collections.sort(al2);
		    System.out.println(al2);
		    
		}
		System.out.println("do want to continue");
		 ch=sc2.next().charAt(0);
		}while(ch=='Y'||ch=='y');
		

	}
	public static void acc() {
		ArrayList<String> ala = new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=sc.next();
		System.out.println("Enter email: ");
		String email=sc.next();
		System.out.println("Enter phone No: ");
		String phone=sc.next();
		System.out.println("Enter percentage: ");
		String per=sc.next();
		ala.add(name);
		ala.add(email);
		ala.add(phone);
		ala.add(per);
		System.out.println(ala);			
	}
	
	public static ArrayList name() {
		ArrayList<String> al = new ArrayList<>();
        String name;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter how names you want to enter");
		int sixze=sc.nextInt();
		System.out.println("Enter name: ");
		for(int i=0;i<sixze;i++) {
			name=sc.next();
			al.add(name);
		
		}
		System.out.println(al);
		return al;
		
	}

}
