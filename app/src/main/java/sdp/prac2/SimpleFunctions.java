package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    public static int Task1(List<Integer> a, List<Integer> b) {
        int sum = 0;
        for (int index : b) {
            if (index >= 0 && index < a.size()) {
                sum += a.get(index);
            }
        }
        return sum;
    }
    public List<Integer> Task6(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int n : numbers) {
            if (n % 100 == 0) {
                result.add(n);
            } else {
                result.add(((n / 100) + 1) * 100);
            }
        }
        return result;
    }
    public static List<String> Task2 (List<String> lst){
        List<String> result = new ArrayList<>();

        for(String s: lst){
            if(s.length()>0){
                result.add(s.substring(1));
            }
        }
        return result;
    }

    
}
