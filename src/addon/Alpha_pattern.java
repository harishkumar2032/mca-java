package addon;
import java.util.*;

public class Alpha_pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0; j<n;j++)
			{
				char ch = (char) (i+65);
				System.out.print(ch+" ");
			}
			System.out.println();
		}

	}

}