// here for example we have an array with lenght of 5, so possible inoputs canbe either more than 5 or neagtive as well so in tat case: if the number is greater than the lenght then we'll do moudulus of lenght and if the number is negative then well add it to the lenght, so -1 is moving the last letter forward which is equal to moving 4 letter backward 

// and for rotation the concept is reversal

// so rotate by 3 
// array length 5
// then divide the array in two parts 
// 1st part---2 elements
// 2nd part the last 3 elements(as we have to rotate 3 elements)

// now reverse the 1st part and reverse the 2nd part

// and reverse the whole array---this will be our rotated array
import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        rotate(arr, k);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }

    public static void reverse(int[] a, int i, int j) {
        int li = i;
        int ri = j;
        while (li < ri) {
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;
            li++;
            ri--;
        }
    }

    public static void rotate(int[] a, int k) {

        k = k % a.length;
        if (k < 0) {
            k = k + a.length;
        }
        // rev part1
        reverse(a, 0, a.length - k - 1);
        // rev part2
        reverse(a, a.length - k, a.length - 1);

        // rev whole array
        reverse(a, 0, a.length - 1);
    }
}
