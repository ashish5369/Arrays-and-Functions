
//it is goijng to be the difference of the largest - the smallest of the array
import java.util.*;

public class span {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int l = arr[0];
        int s = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > l) {
                l = arr[i];
            }

            if (arr[i] < s) {
                s = arr[i];
            }

        }

        System.out.println(l - s);

        sc.close();
    }
}
