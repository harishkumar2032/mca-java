package addon;
import java.util.*;
public class butterfly {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<(n*2)-1;i++)
		{
			if(i<(n*2)/2)
			{
				for(int j=0;j<i+1;j++)
				{
					System.out.print("*");
				}
				for(int s=0;s<((n-1)*2)-(i*2);s++)
				{
					System.out.print(" ");
				}
				for(int k=0;k<i+1;k++)
				{
					System.out.print("*");
				}
			}
			else
			{
				for(int j=0;j<(n-i)-1;j++)
				{
					System.out.print("*");
				}
				for(int s=0;s<2*(i+1);s++)
				{
					System.out.print(" ");
				}
				for(int k=0;k<(n-i)-1;k++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}