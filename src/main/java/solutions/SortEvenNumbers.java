package solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Sort even numbers
*/

public class SortEvenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        int count = 0;
        while (count < 10) {
            String str = reader.readLine();
            list.add(str);
            count++;
        }
        List<Integer> result = new ArrayList<Integer>();

        for (String c : list) {
            int foo;
            try {
                foo = Integer.parseInt(c);
            } catch (NumberFormatException e) {
                foo = 0;
            }
            if (foo != 0 && foo % 2 == 0) {
                result.add(foo);
            } else {
                System.out.println("Number " + foo + " is not valid");
            }
        }

        Collections.sort(result);

        System.out.println("List contains: ");
        for (Integer s : result) {
            System.out.println(s);
        }
    }
}
