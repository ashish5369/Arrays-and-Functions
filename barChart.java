//create a vertical bar of height given in the array

import java.util.Scanner;

public class barChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int l = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > l) {
                l = arr[i];
            }
        }

        while (l > 0) {
            for (int i = 0; i < n; i++) {
                if (arr[i] == l) {
                    System.out.print(".");
                    arr[i] = l - 1;
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println("");

            l = l - 1;
        }

        sc.close();
    }
}
