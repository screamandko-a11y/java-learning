package MaxSumFinder;

import java.util.Scanner;

public class MaxSumFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int [3];

        System.out.println("Enter three numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > max2) {
                max2=max1;
                max1=num;

            } else if (num > max2) {
                max2=num;

            }
        }
        int result = max1 + max2;
        System.out.println("The sum of the two largest numbers is: " + result);

    }
}