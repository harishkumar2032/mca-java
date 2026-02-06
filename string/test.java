package string;
import java.util.*;
public class test {
public  static void main(String[] args) {
	String a="abcbde";
	
	String tem=a;
	for(int i=0;i<a.length();i++) {
		
	  
		for(int j=i+2;j<a.length();j++) {
			String sub=a.substring(i,j);
			if(new StringBuilder (sub).reverse().toString().equals(sub)) {
				tem = tem.replace(sub,"hi");
			}
			
		}
		
		
	}
	System.out.println(a);
	System.out.print(tem);
}
}
