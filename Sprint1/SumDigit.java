package Sprint1;

public class SumDigit {
    public static void main(String[] args) {
        int num = 1234;
        int Sumdigit = 0;
        while (num != 0) {
            int rem = num % 10;
            Sumdigit += rem;
            num /= 10;
        }
        System.out.println("Sum of Digit is " + Sumdigit);
    }
}
