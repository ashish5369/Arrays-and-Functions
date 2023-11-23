import java.util.*;

public class searchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int find = sc.nextInt();
        int count = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == find) {
                System.out.println(i);
                count++;
            }
        }

        if (count == -1) {
            System.out.println(count);
        }

        sc.close();

    }
}
