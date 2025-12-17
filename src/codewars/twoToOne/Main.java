package codewars.twoToOne;

import java.util.*;
import java.util.stream.Collectors;

/* CHALLENGE
Take 2 strings s1 and s2 including only letters from a to z.
Return a new sorted string (alphabetical ascending), the longest
possible, containing distinct letters - each taken only once - coming from s1 or s2.

        Examples:
a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"
longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz"
longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
*/
public class Main {
    public static void main(String[] args) {
        String a = "xyaabbbccccdefww";
        String b = "xxxxyyyyabklmopq";
        System.out.println(longest(a, b));
    }

    public static String longest (String s1, String s2) {
        String fullStr = s1 + s2;
        Set<Character> strSet = new HashSet<>();

        for (int i = 0; i < fullStr.length(); i++) {
            strSet.add(fullStr.charAt(i));
        }

        return strSet.stream()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining());

    }
}
