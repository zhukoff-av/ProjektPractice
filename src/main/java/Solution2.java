import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
File Reader with Buffer Reader
*/

public class Solution2 {
    public static void main(String[] args) throws IOException {
//        /Users/antonzhukov/DEV/file.txt
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);

        Scanner scanner = new Scanner(fileInputStream);
        StringBuilder builder = new StringBuilder();

        while (scanner.hasNextLine()) {
            builder.append(scanner.nextLine()).append("\n");
        }

        System.out.print(builder.toString());

        scanner.close();
        reader.close();
//

    }
}