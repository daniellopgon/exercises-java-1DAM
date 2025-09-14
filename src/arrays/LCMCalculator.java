package arrays;

/**
 * Problem: Find the smallest positive number that is evenly divisible
 * by all numbers from 1 to 20.
 *
 * Note: 2520 is the smallest number that can be divided by each of the
 * numbers from 1 to 10 without remainder.
 */
public class LCMCalculator {

    private static final int UPPER_LIMIT = 20;

    public static void main(String[] args) {
        long result = findSmallestCommonMultiple(UPPER_LIMIT);
        System.out.println("The smallest positive number divisible by all numbers from 1 to "
                + UPPER_LIMIT + " is: " + result);
    }

    /**
     * Finds the smallest common multiple for all numbers from 1 to the given limit.
     *
     * @param limit the upper bound (inclusive) for the range
     * @return the least common multiple of all numbers from 1 to limit
     */
    public static long findSmallestCommonMultiple(int limit) {
        if (limit < 1) {
            throw new IllegalArgumentException("Limit must be positive");
        }

        long result = 1;

        for (int i = 2; i <= limit; i++) {
            result = calculateLCM(result, i);
        }

        return result;
    }

    /**
     * Calculates the Least Common Multiple (LCM) of two numbers.
     * Formula: LCM(a, b) = (a * b) / GCD(a, b)
     *
     * @param a first number
     * @param b second number
     * @return the least common multiple of a and b
     */
    public static long calculateLCM(long a, long b) {
        if (a == 0 || b == 0) {
            return 0;
        }

        // Use absolute values to handle negative numbers
        a = Math.abs(a);
        b = Math.abs(b);

        return (a / calculateGCD(a, b)) * b; // Rearranged to prevent overflow
    }

    /**
     * Calculates the Greatest Common Divisor (GCD) using Euclidean algorithm.
     *
     * @param a first number
     * @param b second number
     * @return the greatest common divisor of a and b
     */
    public static long calculateGCD(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}