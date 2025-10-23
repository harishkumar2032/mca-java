package number;

import java.util.Scanner;

public class digitsadd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n=sc.nextInt();
		int count=0;
		System.out.print("The Sum of Digits is : ");
		while(n>0)
		{
			int a=n%10;
			count+=a;
			n=n/10;
			
		}
		
		System.out.println(count);

	}

}