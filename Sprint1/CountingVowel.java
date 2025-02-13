package Sprint1;

import java.util.Scanner;

public class CountingVowel {
    public static void main(String[] args) {
        // Counting Vowel
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int vowel = 0;
        int cons = 0;
        for (int i = 0; i < str.length(); i++) {
            if ("aeiouAEIOU".indexOf(str.charAt(i)) != -1) {
                vowel++;
            } else {
                cons++;
            }
        }
        System.out.println("Total Vowels are" + vowel + " Total Consonants are " + cons);
    }
}
