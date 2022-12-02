package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(new File("src/day2/input"));

        int totalScore = 0;
        while (scan.hasNext()) {
            String next = String.valueOf(scan.nextLine().toCharArray());
            char first = next.charAt(0);
            char second = next.charAt(2);

            if (first == 'A') {
                if (second == 'X') {
                    totalScore += 4; // for draw
                    totalScore += 1; // for rock
                } else if (second == 'Y') {
                    totalScore += 7;
                    totalScore += 2;
                } else {
                    totalScore += 3;
                    totalScore += 1;
                }
            } else if (first == 'B') {
                if (second == 'X') {
                    totalScore += 1;
                    totalScore += 1;
                } else if (second == 'Y') {
                    totalScore += 4;
                    totalScore += 2;
                } else {
                    totalScore += 7;
                    totalScore += 3;
                }
            } else if (first == 'C') {
                if (second == 'X') {
                    totalScore += 7;
                    totalScore += 1;
                } else if (second == 'Y') {
                    totalScore += 1;
                    totalScore += 2;
                } else {
                    totalScore += 4;
                    totalScore += 3;
                }
            }
        }
        System.out.println(totalScore);
        scan.close();
    }
}
