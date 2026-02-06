package string;

import java.util.Scanner;

public class pro3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char search = 'c';
		int f=0;
		
		for(int i=0; i<s.length(); i++) {
			if(search==s.charAt(i)) {
				f=1;
				break;
			}
		}
		if(f==1)
		{
			System.out.println("Found");
		}
		else 
		{
			System.out.println("Not Found");
		}
	}

}