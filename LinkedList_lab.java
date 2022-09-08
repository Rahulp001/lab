package collection;
//Write a program to accept product name, ID, Price . Arrange the data in Descending order and display the output. (Using Linked List)

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  decending();
	}

	
	public static LinkedList decending() {
		LinkedList<String> al = new LinkedList<>();
        String name,id;
        
		Scanner sc= new Scanner(System.in);
		System.out.println("enter how product you want to enter");
		int sixze=sc.nextInt();
		System.out.println("Enter name: ");
		for(int i=0;i<sixze;i++) {
			System.out.println("enter product name ");
			name=sc.next();
		   System.out.println("enter product id");
		   id=sc.next();
		   al.add(name);
		   al.add(id);
		
		}
		Collections.sort(al, Collections.reverseOrder());
		
		System.out.println(al);
		return al;
	}
}
