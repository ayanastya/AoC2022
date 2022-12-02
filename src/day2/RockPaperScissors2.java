package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RockPaperScissors2 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(new File("src/day2/input"));

        int totalScore = 0;
        while (scan.hasNext()) {
            String next = String.valueOf(scan.nextLine().toCharArray());
            char first = next.charAt(0);
            char second = next.charAt(2);

            if (second == 'X') { //lose
                if (first == 'A') {  //scissors
                    totalScore += 3;
                } else if (first == 'B') {
                    totalScore += 1; //rock
                } else {
                    totalScore += 2; // paper
                }
            } else if (second == 'Y') {
                totalScore += 3;
                //draw
                if (first == 'A') {  //scissors
                    totalScore += 1;
                } else if (first == 'B') {
                    totalScore += 2; //rock
                } else {
                    totalScore += 3; // paper
                }
            } else { //win
                totalScore += 6;
                //draw
                if (first == 'A') {  //scissors
                    totalScore += 2;
                } else if (first == 'B') {
                    totalScore += 3; //rock
                } else {
                    totalScore += 1; // paper
                }
            }
        }
        System.out.println(totalScore);
        scan.close();
    }
}
