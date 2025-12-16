package codewars.bitCounting;

/* CHALLENGE
Write a function that takes an integer as input,
and returns the number of bits that are equal to
one in the binary representation of that number.
You can guarantee that input is non-negative.

Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(countBits(-1234));
    }

    // BEST SOLUTION: return Integer.bitCount(n);
    // however, I'm doing it "no pelo"
    public static int countBits(int n) {
        String binary = Integer.toBinaryString(n < 0 ? n * -1 : n);
        int count = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }

        return count;
    }
}
