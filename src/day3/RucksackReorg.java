package day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RucksackReorg {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(new File("src/day3/input"));

        ArrayList<String> dup = new ArrayList<>();
        ArrayList<String> lines = new ArrayList<>();
        while (scan.hasNext()) {
            String next = scan.nextLine();
            lines.add(next);
            String first = next.substring(0, (next.length())/2);
            String second = next.substring((next.length()-1)/2+1);

            for(int i = 0; i<first.length(); i++){
                char current = first.charAt(i);
                if (second.contains(Character.toString(current))){
                    dup.add(Character.toString(current));
                    break;
                }
            }

        }

        ArrayList<String> dup2 = new ArrayList<>();
        for (int i=0; i < lines.size(); i++){
            if ((i+1)%3 == 0){
                String currentLine = lines.get(i);
                for (int j = 0; j < currentLine.length(); j++){
                    String current = Character.toString(currentLine.charAt(j));
                    if ((lines.get(i-1).contains(current) && (lines.get(i-2).contains(current)))){
                        dup2.add(current);
                        break;
                    }
                }

            }
        }

        String[] chars = new String[52];
        char currentChar = 'a';
        for (int i=0; i<26;i++){
            chars[i]=Character.toString(currentChar);
            currentChar++;
        }
        currentChar = 'A';
        for (int i=26; i<52;i++){
            chars[i]=Character.toString(currentChar);
            currentChar++;
        }

        int j =1;
        HashMap<String, Integer> map = new HashMap<>();
        for (String d :chars){
            map.put(d, j);
            j++;
        }

        int sum = 0;
        int sum2 = 0;

        for(String d : dup){
            sum+=map.get(d);
        }

        for (String d :dup2){
            sum2+=map.get(d);
        }

        System.out.println(sum);
        System.out.println(sum2);
    }
}
