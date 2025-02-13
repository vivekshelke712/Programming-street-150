package Sprint1;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        // Take String as Input and Reverse IT
        System.out.println("Enter A String ");
        Scanner inp = new Scanner(System.in);
        String str = inp.next();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
