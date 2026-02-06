package string;
import java.util.*;
public class newpro {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in );
		StringBuffer sb=new StringBuffer("hello");
		sb.append(" world");
		System.out.println(sb);
		
		StringBuffer a=new StringBuffer("new ");
		a.insert(3, "world");
		System.out.println(a);
		
		StringBuffer b = new StringBuffer("Hello World");
		System.out.println(b.substring(6));    
		System.out.println(b.substring(0, 5));  
		
		StringBuffer s = new StringBuffer("Java");
		s.reverse();
		System.out.println(s);   
		
		StringBuffer v = new StringBuffer("Hello World");
		v.replace(6, 12, "Java");
		System.out.println(v);   

		
		
		
		
	}
	

}
