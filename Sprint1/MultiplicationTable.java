package Sprint1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int Num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(Num * i);
        }
    }
}
