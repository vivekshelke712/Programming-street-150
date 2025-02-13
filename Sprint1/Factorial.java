package Sprint1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter A Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        while (num != 1) {
            fact = fact * num;
            num--;
        }
        System.out.println("facroial is " + fact);

    }
}
