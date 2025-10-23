package conditionl_statement;
import java.util.*;
public class alphabet {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(Character.isAlphabetic(a)) {
			System.out.println("Alphabet");
		}
		else if(Character.isDigit(a)) {
			System.out.println("number");
		}
		else {
			System.out.println("Special character");
		}
	}

}
