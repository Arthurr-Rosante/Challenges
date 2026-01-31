package codewars.pangram;

import java.util.HashSet;
import java.util.Set;

/* CHALLENGE
A codewars.pangram is a sentence that contains every single letter of the alphabet at least once.
For example, the sentence "The quick brown fox jumps over the lazy dog" is a codewars.pangram,
because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a codewars.pangram.
Return True if it is, False if not. Ignore numbers and punctuation.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(check("You shall not pass!")); // false
        System.out.println(check("The quick brown fox jumps over the lazy dog")); // true
    }

    public static boolean check(String sentence){
        Set<Character> letters = new HashSet<>();

        for(char ch : sentence.toLowerCase().toCharArray()) {
            if(ch >= 'a' && ch <= 'z') {
                letters.add(ch);
            }
        }

        return letters.size() == 26;
    }
}
