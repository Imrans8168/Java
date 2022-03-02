//string functions concat, indexof..

import java.util.Scanner;
class stringfunctions
{
	public static void main(String args[])
	{
		String s1= new String();
		String s2 = new String();
		String s3= new String();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first  string:");
		s1=sc.nextLine();
		System.out.println("Enter second string : ");		
		s2=sc.nextLine();
		
		s3=s1.concat(s2);
		System.out.println(s3);

		System.out.println(s1.substring(2));
		System.out.println(s3.substring(3,7));

		System.out.println(s3.indexOf('a'));
		System.out.println(s3.indexOf('a',3));
	}
}
		
