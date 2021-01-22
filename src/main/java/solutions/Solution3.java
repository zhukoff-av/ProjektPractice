package solutions;

import java.io.*;
import java.util.Scanner;

/**
 * Path
 * /Users/antonzhukov/DEV/file.txt
 */

/**
 * BufferedWriter example
 * String str = "Hello";
 * BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
 * writer.write(str);
 * writer.close();
 */

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFile = reader.readLine();
        Scanner scanner = new Scanner(sourceFile);

        BufferedWriter writer = new BufferedWriter(new FileWriter(scanner.nextLine()));

        StringBuilder builder = new StringBuilder();
        String s = "";

        while (!s.equals("exit")) {
            s = reader.readLine();
            builder.append(s).append("\n");
        }
        writer.write(builder.toString());
        writer.close();
    }
}
