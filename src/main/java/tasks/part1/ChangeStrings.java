package tasks.part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChangeStrings {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> listAllStrings = new ArrayList<String>();
        List<String> everySecondString = new ArrayList<String>();
        List<String> modifiedStrings = new ArrayList<String>();

        Scanner in = new Scanner(new File("C:\\Users\\Katsiaryna_Skarzhyns\\Desktop\\testStrings.txt"));

        while (in.hasNextLine()) {
            listAllStrings.add(in.nextLine());
        }
        for (int i = 0; i < listAllStrings.size(); i++) {
            if (i % 2 == 0) {
                everySecondString.add(listAllStrings.get(i));
            }
        }
        for (String s : everySecondString) {
            String regEx = "(\\w{1})(.{1,})(\\w{1})";
            Pattern pattern = Pattern.compile(regEx);
            Matcher matcher = pattern.matcher(s);
            matcher.matches();
            modifiedStrings.add(matcher.group(3) + matcher.group(2) + matcher.group(1));
        }

        for (String s : modifiedStrings) {
            System.out.println(s);
        }
    }
}