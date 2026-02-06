package operator;
import java.util.*;

public class greater{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int check=((a>b)&&(a>c)&&(a>d))?a:
			      (b>a&&b>c&&b>d)?b:
			    	  (c>a&&c>b&&c>d)?c:d;
		System.out.println(check);
		
	}
}