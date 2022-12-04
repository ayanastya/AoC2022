package day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CampCleanup {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(new File("src/day4/input"));

        check(scan);

    }

    private static void check(Scanner scan) {
        int countIncluded = 0;
        int countOverlap = 0;

        while (scan.hasNext()) {
            String currentLine = scan.nextLine();

            String[] elfs = currentLine.split(",");
            String[] elf1 = elfs[0].split("-");
            String[] elf2 = elfs[1].split("-");

            int[] first = {Integer.parseInt(elf1[0]), Integer.parseInt(elf1[1])};
            int[] second = {Integer.parseInt(elf2[0]), Integer.parseInt(elf2[1])};

            int firstBegin = first[0];
            int secondBegin = second[0];
            int firstEnd = first[1];
            int secondEnd = second[1];
            if (((firstBegin <= secondBegin) && (firstEnd >= secondEnd)) || ((secondBegin <= firstBegin) && (secondEnd >= firstEnd)))
                countIncluded++;

            if (((firstEnd >= secondBegin) && (firstBegin <= secondBegin)) || ((firstBegin <= secondEnd) && (secondBegin <= firstBegin)))
                countOverlap++;
        }

        System.out.println(countIncluded);
        System.out.println(countOverlap);
    }
}
