package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CalorieCounting {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/day1/input"));

        ArrayList<Integer> elfs = new ArrayList<>();

        int currentSum = 0;
        while (scan.hasNextLine()) {
            String next = scan.nextLine();
            if (!next.equals("")) {
                currentSum += Integer.parseInt(next);
            } else {
                elfs.add(currentSum);
                System.out.println(currentSum);
                currentSum = 0;
            }
        }
        Collections.sort(elfs);
        int length = elfs.size();
        int max3 = elfs.get(length-1) + elfs.get(length-2) + elfs.get(length-3);
        System.out.println(max3);
    }
}
