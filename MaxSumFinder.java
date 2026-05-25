package MaxSumFinder;

import java.util.Scanner;

public class MaxSumFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        int result = (a + b + c) - min;

        System.out.println("The sum of the two largest numbers is: " + result);
    }
}