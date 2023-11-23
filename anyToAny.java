import java.util.Scanner;
// do one thing we know how to go to any base to decimal and we know how to goto any base from deicmal...so we use both the porgam to go from any to deicmal and then decimal to the next base

public class anyToAny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int ans = getValue(n, b1, b2);
        System.out.println(ans);

        sc.close();
    }

    public static int getValue(int n, int b1, int b2) {
        int toDec = getValueInDecimal(n, b1);
        int toDesired = getValueInBase(toDec, b2);
        return toDesired;

    }

    public static int getValueInDecimal(int n, int b) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            rv += dig * p;
            p = p * b;
        }
        return rv;
    }

    public static int getValueInBase(int n, int b) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % b;
            n = n / b;
            rv += dig * p;
            p = p * 10;
        }
        return rv;
    }
}