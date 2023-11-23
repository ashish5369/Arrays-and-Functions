import java.util.Scanner;

public class subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int limit = (int) Math.pow(2, arr.length);

        for (int i = 0; i < limit; i++) {
            String set = "";
            int temp = i;

            for (int j = arr.length-1; j >= 0; j--) {
                // here we are tryoing to break each element i.e.0 1 2 3 4 5 7 , into theier
                // binary which is 000 001 010, so whereever their is 0 we wont print and if 1
                // we'll print and if the 1st bit is 1 then print a and if 2nd bit is 1 then
                // print b and similarly if third bit is 1 then print c
                int r = temp % 2;
                temp = temp / 2;
                if (r == 0) {
                    set = "-\t" + set;
                } else {
                    set = arr[j] + "\t" + set;
                }
            }
            System.out.println(set);

        }

        sc.close();
    }
}
