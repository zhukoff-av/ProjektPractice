package solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.stream.LongStream;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
        System.out.println(factorialUsingRecursion(input));
        System.out.println(factorialUsingFori(input));
    }

    /**
     * Factorial using Stream
     */
    public static String factorial(int n) {
        if (n > 0) {
            long result = LongStream.rangeClosed(1, n)
                    .reduce(1, (long x, long y) -> x * y);

            return String.valueOf(result);
        }
        return "0";
    }

    /**
     * Factorial using Recursion
     */
    public static long factorialUsingRecursion(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorialUsingRecursion(n - 1);
    }

    /**
     * Factorial using for i
     */
    public static String factorialUsingFori(int n) {
        if (n < 0) return "0";
        if (n == 0) return "1";
        BigDecimal result = new BigDecimal(1);
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigDecimal(i));
        }
        return result.toString();
    }
}