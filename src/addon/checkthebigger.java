package addon;

import java.util.Scanner;

public class checkthebigger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n=sc.nextInt();
		int b=n;
		int a=0;
		while(n>0)
		{
			a=(a*10)+(n%10);
			n=n/10;
		}
		System.out.println((b>a)?b:a);
		

	}

}