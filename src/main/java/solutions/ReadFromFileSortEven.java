package solutions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Read numbers from file, Sort even numbers
*/

public class ReadFromFileSortEven {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        FileInputStream fis = new FileInputStream(sourceFileName);
        Scanner scanner = new Scanner(fis);
        ArrayList<Integer> list = new ArrayList<>();

        while (scanner.hasNext()) {
            Integer foo = Integer.parseInt(scanner.nextLine());
            if (foo % 2 == 0) {
                list.add(foo);
            }
        }

        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i);
        }

        fis.close();
        reader.close();
    }
}

