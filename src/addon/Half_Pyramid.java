
package addon;
 
import java.util.Scanner;

public class Half_Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				for(int k=1;k>=n;k--)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
