package codewars.validatePin;

import java.util.regex.*;

/* CHALLENGE
ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but
exactly 4 digits or exactly 6 digits.

If the function is passed a valid PIN string, return true, else return false.

Examples (Input --> Output)
"1234"   -->  true
"12345"  -->  false
"a234"   -->  false
"123456" -->  true
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("12345"));
        System.out.println(validatePin("a234"));
        System.out.println(validatePin("123456"));
    }

    public static boolean validatePin(String pin) {
        int length = pin.length();

        if(length != 4 && length != 6) {
            return false;
        };

        for (int i = 0; i < length; i++) {
            char ch = pin.charAt(i);
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    // BEST SOLUTION: return pin.matches("\\d{4}|\\d{6}");
}
