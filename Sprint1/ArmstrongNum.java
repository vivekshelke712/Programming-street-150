package Sprint1;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int originalNum = num;
        int res = 0;

        while (num > 0) {
            int rem = num % 10;
            res += (int) Math.pow(rem, 3); // Add the cube of the digit
            num /= 10; // Reduce the number
        }

        if (originalNum == res) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
    }
}
