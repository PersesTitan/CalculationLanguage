package CalculationLanguage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Calculation {

    private String plus = "+";
    private String minus = "-";
    private String multiply = "\\*";

    public Calculation() {}

    /**
     * @param plus 더하기 설정
     * @param minus 빼기 설정
     * @param multiply 곱하기 설정
     */
    public Calculation (String plus, String minus, String multiply) throws IOException {
        boolean bool = plus.equals(minus) || plus.equals(multiply) || minus.equals(multiply);
        if (bool) throw new IOException("같은 값이 존재하면 안됩니다");
        this.plus = plus;
        this.minus = minus;
        this.multiply = multiply;
    }

    /**
     * @param texts 값을 받아욤
     * @return 계산하여 값을 반환
     */
    public long calculation(String texts) {
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
