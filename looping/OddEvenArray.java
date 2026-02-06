package looping;
import java.util.*;

public class OddEvenArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] odd = new int[n];
        int[] even = new int[n];

        int oddCount = 0, evenCount = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even[evenCount++] = i;
            } else {
                odd[oddCount++] = i;
            }
        }

        System.out.print("Odd: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.print(", Even: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(even[i] + " ");
        }

        sc.close();
    }
}
