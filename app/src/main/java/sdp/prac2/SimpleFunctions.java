package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    /*A method that accepts two lists of integers a and b, and adds up the elements from a 
    whose indexes are specified by b. If any index in b is out-of-range for a, it then ignores that index.*/

	//TASK 1 

    public static int task1 (List<Integer> a, List<Integer> b){
        int sum =0;
        for (int i = 0; i < b.size(); i++) {
            int index = b.get(i); //gets the index stored in b at position i
            if (index >= 0 && index < a.size()) {
                sum += a.get(index); //Adds the value from a at the given index to hte sum
            }
        }
        return sum;
        
    public static int Task1(List<Integer> a, List<Integer> b) {
        int sum = 0;
        for (int index : b) {
            if (index >= 0 && index < a.size()) {
                sum += a.get(index);
            }
        }
        return sum;
    }
	    //task 6 
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

	    //task 2 
    public static List<String> Task2 (List<String> lst){
        List<String> result = new ArrayList<>();

        for(String s: lst){
            if(s.length()>0){
                result.add(s.substring(1));
            }
        }
        return result;
    }
	    //task 4
    public static ArrayList<Integer> Task4(ArrayList<Integer> a , ArrayList<Integer> b) {
		ArrayList<Integer> c = new ArrayList<Integer>();
		if (a.size() != b.size() ){
			return null;
		}else {
			for(int i = 0 ; i < a.size() ; i++ ){
				c.add(a.get(i) * b.get( b.size() - 1 - i) );
			}
			return c;
		}

	    //task 5
    public static boolean Task5(List<Integer> list) {
        if (list == null || list.size() <= 1) {
            return true;
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
