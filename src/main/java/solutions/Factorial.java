package solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.LongStream;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
        System.out.println(factorialUsingRecursion(input));
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
}