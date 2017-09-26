package tasks.part1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    BufferedReader in;

    public Calculator(InputStreamReader isr) {
        System.out.println("Enter values");
        in = new BufferedReader(isr);
    }

    public void run() {
        double firstValue;
        double secondValue;
        char op;
        String str;
        try {
            while ((str = in.readLine()) != null && !str.equals("")) {
                Pattern pattern = Pattern.compile("(\\d{1,})(.)(\\d{1,})");
                Matcher matcher = pattern.matcher(str);
                matcher.matches();
                op = matcher.group(2).charAt(0);
                firstValue = Double.parseDouble(matcher.group(1));
                secondValue = Double.parseDouble(matcher.group(3));
                switch (op) {
                    case '+':
                        System.out.println(firstValue + secondValue);
                        break;
                    case '-':
                        System.out.println(firstValue - secondValue);
                        break;
                    case '*':
                        System.out.println(firstValue * secondValue);
                        break;
                    case '/':
                        System.out.println(firstValue / secondValue);
                        break;
                    default:
                        System.out.println("Wrong values");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Calculator(new InputStreamReader(System.in)).run();
    }
}