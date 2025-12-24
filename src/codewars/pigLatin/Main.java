package codewars.pigLatin;

import java.util.Set;

/* CHALLENGE
Move the first letter of each word to the end of it,
then add "ay" to the end of the word. Leave punctuation marks untouched.

Examples
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway !
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
    }


    public static String pigIt(String str) {
        Set<Character> PUNCT_MARK = Set.of('!', '?', '.', ';', ':', '-');
        StringBuilder result = new StringBuilder();

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            boolean hasPunctuation = word.chars()
                    .mapToObj(c -> (char) c)
                    .anyMatch(PUNCT_MARK::contains);

            if (hasPunctuation) {
                result.append(word);
            } else {
                result.append(word.substring(1))
                        .append(word.charAt(0))
                        .append("ay");
            }

            if (i < words.length - 1) result.append(" ");
        }

        return result.toString();
    }

    /* BEST SOLUTION: return pin.matches("\\d{4}|\\d{6}");
    public class PigLatin {
        public static String pigIt(String str) {
            return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
        }
    }
    */
}
