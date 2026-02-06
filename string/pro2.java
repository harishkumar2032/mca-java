package string;
import java.util.*;
public class pro2 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	

	char[] b=a.toCharArray();
	int count=0;
	for( char c:b){
		count++;
	}
	System.out.print(count);
	count=0;
	}
}
