package operator;
import java.util.*;

public class alphabet {

	

	
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);

			
			System.out.println("enter the character:");
			char a=sc.next().charAt(0);
			if(a>=65&&a<=90 || a>=97&&a<122) {
				System.out.println("alphabet");
			}
			else {
				System.out.println("not a alphabet:");
			}

		}

	}



