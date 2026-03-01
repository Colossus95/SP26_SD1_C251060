import java.util.*;

public class Cwork9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        String lower = str.toLowerCase();

        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < lower.length(); i++) {

            char ch = lower.charAt(i);

            if (ch >= 'a' && ch <= 'z') {  
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }

        System.out.println("Vowels : " + vowel);
        System.out.println("Consonants : " + consonant);

        input.close();
    }
}
