package Sprint1;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonnaciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Limit ");
        int limit = sc.nextInt();
        sc.close();
        ArrayList<Integer> fiblList = new ArrayList<>();
        if (limit >= 0)
            fiblList.add(0);
        if (limit >= 1)
            fiblList.add(1);

        int a = 0, b = 1;
        while (true) {
            int next = a + b;
            if (next > limit) {
                break;
            }
            fiblList.add(next);
            a = b;
            b = next;
        }
        System.out.println("The Series upto the Limit" + limit + " Is " + fiblList);

    }
}