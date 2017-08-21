package c1.t4_OneWay;

public class App {
    public static boolean run(String a, String b) {

        String small = a;
        String big = b;
        if (small.length() > big.length()){
            small = b;
            big = a;
        }

        int lengthDiff = big.length() - small.length();
        int i = 0;
        int j = 0;
        int errors = 0;

        while (i < small.length()
                && j < big.length()) {

            if (small.charAt(i) == big.charAt(j)) {
                i++;
            } else {
                errors++;
                if (lengthDiff == 0){
                    i++;
                }
            }
            j++;

        }

        if ((lengthDiff == 0 && errors <= 1) ||
                (lengthDiff == 1 && errors <= 1)) {
            return true;
        }
        return false;
    }


}

