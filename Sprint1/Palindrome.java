package Sprint1;

public class Palindrome {
    public static void main(String[] args) {
        String name = "Vivek";
        boolean pal = true;
        int length = name.length();

        for (int i = 0; i < length / 2; i++) {
            if (name.charAt(i) != name.charAt(length - i - 1)) {
                pal = false;
                break;
            }
        }

        if (!pal) {
            System.out.println("The String is not a Palindrome");
        } else {
            System.out.println("The String is a Palindrome");
        }
    }
}
