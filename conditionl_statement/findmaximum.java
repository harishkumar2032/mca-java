package conditionl_statement;
import java.util.*;
public class findmaximum {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  int c=sc.nextInt();
	  int d=sc.nextInt();
	if(a>b) 
	{
		if(a>c) 
		{
			if(a>d) 
			{
		     System.out.println("Maximun:"+a);
		     }		
		}	
	}
	if(b>c) 
	{   
		if(b>d) {
		System.out.println("Maximun:"+b);
		}
		}
	if(c>d) {
		System.out.println("Maximun:"+c);
	}
	else {
		System.out.println("Maximun:"+d);
	}
	
	  
  }
}
