package hello;

import java.util.HashMap;   

public class RomanNumberConverter {

    private static final HashMap<String, Integer> romanNumberList = new HashMap<String, Integer>();
    static {
        romanNumberList.put("I", 1);
        romanNumberList.put("V", 5);
        romanNumberList.put("X", 10);
        romanNumberList.put("L", 50);
        romanNumberList.put("C", 100);
        romanNumberList.put("D", 500);
        romanNumberList.put("M", 1000);
    }

    public int convert(String romanNumber) {
        return romanNumberList.get(romanNumber);
    }

    public int convert2(String romanNumber) {
        int res = 0;
        char[] c_arr = romanNumber.toCharArray();

        for (char c : c_arr) {
            res += romanNumberList.get(c);
        }
        return res;
    }
}