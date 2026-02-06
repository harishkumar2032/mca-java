package operator;
import java.util.*;
public class posorneg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		String val=(num>0)?"positive":(num<0)?"Negative":"zero";
		System.out.println(val);
		
	}

}
