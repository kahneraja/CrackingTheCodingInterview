package c1_t1_IsUnique;

import java.util.HashSet;

/**
 * Created by kahneraja on 8/12/17.
 */
public class App {
    public static boolean run(String a) {
        HashSet<String> map = new HashSet();
        for(String c: a.split("")) {
            if (map.contains(c)){
                return false;
            }
            map.add(c);
        }
        return true;
    }

    public static boolean runBitWise(String s) {
        int checker = 0;
        for(char c: s.toCharArray()){
            int shift = c - 'a';
            if ((checker & (1 << shift)) > 0)
                return false;
            checker = checker | (1 << shift);
        }
        return true;
    }
}
