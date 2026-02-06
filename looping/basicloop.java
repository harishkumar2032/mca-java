package looping;
import java.util.*;

import java.util.Scanner;

public class basicloop {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ente rthe n");
        int a =sc.nextInt();
        
        for(int i=0;i<a;i++) 
        {
        	System.out.print(i+1 + " ");
        }
    }
}

