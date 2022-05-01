package CalculationLanguage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculation {

    public static String plus = "+";
    public static String minus = "-";
    public static String multiply = "\\*";

    public static void setSign(String plus, String minus, String multiply) {
        Calculation.plus = plus;
        Calculation.minus = minus;
        Calculation.multiply = multiply;
    }

    public static long calculation(String texts) {
        long total;
        String[] text = texts.split(multiply);
        List<Integer> list = new ArrayList<>();
        int count;
        for (String t : text) {
            count = 0;
            for (int i = 0; i<t.length(); i++) {
                if (Character.toString(t.charAt(i)).equals(plus)) count++;
                else if (Character.toString(t.charAt(i)).equals(minus)) count--;
            } list.add(count);
        }

        total = list.get(0);
        list.remove(0);
        for (int i : list) total *= i;
        return total;
    }
}
