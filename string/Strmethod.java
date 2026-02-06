package string;
import java.util.*;

public class Strmethod
{
    //parameters/arguments==>void add(int a,int b)
    //A method without return type and parameter/argument
    //A method without return type and with parameter/argument
    //A method with return type and parameter/argument
    //A method with return type and without parameter/argument
     
     
     void print()
     {
         System.out.println("This is Method");
     }
     
     static void print2()
     {
         System.out.println("This is Ststic Method");
     }
     
     static int val(){
         System.out.println("Print Statement");
         return 5;
     }
     static int sum(int x,int y) {
    	 System.out.println("the value is :");
    	 return  x+y;
     }
     
     
	public static void main(String[] args) {
	    Strmethod m = new Strmethod();
		m.print();
		Strmethod.print2();
		System.out.println(Strmethod.val());
		Strmethod.sum(5, 5);
	
		System.out.println(Strmethod.sum(5, 5));
	}
}
