package codewars.disemvowel;

import java.util.Set;

/* CHALLENGE
Trolls are attacking your comment section!

A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

Your task is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.
*/


public class Main {
    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }

    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u');

    public static String disemvowel(String str) {

        StringBuilder result = new StringBuilder(str.length());

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(!VOWELS.contains(Character.toLowerCase(c))) {
                result.append(c);
            }

        }

        return result.toString();
    }

    /* BEST SOLUTION
    public static String disemvowel(String str) {
        return str.replaceAll("(?i)[aeiou]", "");
    }
    */

}
