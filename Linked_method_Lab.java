package lab;

import java.util.LinkedList;
import java.util.List;

public class Linked_method_Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=new LinkedList<String>();
		l1.add("Rahul");
		l1.add("Raj");
		l1.add("simran");
		l1.add("alecxander");
		List<String> l2=new LinkedList<String>();
		l2.add("Rahul");
		l2.add("Robin");
		l2.add("batman");
		l2.add("alecxander");
        union(l1,l2);
        intersection(l1,l2);
	}
	
	public static void union(List<String> l1,List<String> l2) {
		
		
		System.out.println(l1);
		System.out.println(l2);
		List<String> l3=new LinkedList<String>();
		l3.addAll(l1);
		l3.addAll(l2);
		System.out.println("union = "+l3);
		System.out.println();
		
	}
public static void intersection(List<String> l1,List<String> l2) {
		
		
		System.out.println(l1);
		System.out.println(l2);
		l1.retainAll(l2);
		System.out.println("intersection = "+l1);
		
	}

}
