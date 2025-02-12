// Finding the Greatest Common Divisor (GCD)
// Difficulty: Easy
// Topics: Basic Programming, Number Theory
// Description: Write a program to find the GCD of two numbers.
// Example:
// Input: a = 48, b = 18
// Output: 6
// Explanation: The GCD of 48 and 18 is 6.
public class FindGCD {
    public static void main(String[] args) {
        int Num1 = 15;
        int Num2 = 12;
        int GCD = 0;
        for (int i = 0; i < 1000; i++) {
            if ((Num1 * i) == (Num2 * i)) {
                GCD = i;
                break;
            }
        }
        System.out.println("the Greatest Common Divisor is " + GCD);
    }
}
