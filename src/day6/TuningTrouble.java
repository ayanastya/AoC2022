package day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TuningTrouble {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/day6/input"));
        char[] signal = scan.nextLine().toCharArray();

        find(signal, 4);
        find(signal, 14);
        scan.close();
    }

    private static void find(char[] signal, int n) {
        for (int i = 0; i < signal.length - n; i++){
            Set<Character> s = new HashSet<>();

            char[] a = new char[n];
            for (int j = 0; j < n; j++){
                a[j] = signal[i+j];
            }

            for (char e : a){
                s.add(e);
            }

            if (s.size() == n){
                System.out.println(i+n);
                break;
            }
        }
    }

}
