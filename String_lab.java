//Write a program to do the following process 
//-Number of Duplicate Words in String
//-Number of Words in Given String
//-Occurrences of Each Character in String
//-Remove Duplicate Words from String 
//-Count of Vowels
package lab;

public class String_lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      prog();
      String a="abs";
      a="hgd";
      System.out.println(a);
	}
	
	public static void prog() {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("enter one line of sentence :");
		String line=sc.nextLine();
		int count;
		String words[]=line.split(" ");
//		for(String s:words) {
//			System.out.println(s);
//		
		System.out.println("duplicate words with value");
		for(int i=0;i<words.length;i++) {
			count=1;
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
				words[j]="0";
				}
				
			}
			if(count>1 && words[i]!="0")
			System.out.println(words[i]+" "+count);
		}
		
	}

}

