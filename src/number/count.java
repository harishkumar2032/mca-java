package number;



import java.util.*;

public class count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n=sc.nextInt();
		int count=0;
		System.out.print("The Number of Digits is : ");
		while(n>0)
		{
			n=n/10;
			count+=1;
		}
		
		System.out.println(count);

	}

}