package lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//Q3: Write a program to accept N User details Name, No , Address, email , UserID , Password .Store user ID and
//password in the file .Accept  a  userID from the user and delete that record from the file.
public class File_lab {
	public void accept() throws IOException {
		Scanner sc= new Scanner(System.in);
		System.out.println ("enter your name");
		String name=sc.nextLine();
		System.out.println("enter your no");
		int no=sc.nextInt();
		System.out.println("enter your address");
		String ad=sc.next();
		System.out.println("enter your email");
		String email=sc.next();
		System.out.println("enter your userId only numbers not more than 5");
		String userId=sc.next();
		System.out.println("enter your password");
		String pass=sc.next();
		FileWriter write= new FileWriter("abc.txt");
		write.append(userId);
		write.write(pass);
		write.close();
	}
	public void del() throws IOException {
		File obj=new File("abc.txt");
		FileWriter write= new FileWriter("abc.txt");
		new FileWriter(obj, false).close();
		System.out.println("done");
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File_lab obj =new File_lab();
		obj.accept();
		//obj.del();
		

	}

}
