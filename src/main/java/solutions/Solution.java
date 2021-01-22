package solutions;

import java.io.*;
import java.util.Scanner;

/*
File Reader without Buffer Reader
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        /Users/antonzhukov/DEV/file.txt
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        int countByte = 0;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filePath);

            while ((countByte = fis.read()) != -1) {
                System.out.print((char) countByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}