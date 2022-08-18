//Ques 1  Write a program to prove that string is immutable .
package lab;

public class String_immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Rahul";
		str.concat("patel");
		System.out.println(str); //value of string does not change after appending
		
		str=str.concat(" is a jobseeker");
		System.out.println(str);

	}

}
