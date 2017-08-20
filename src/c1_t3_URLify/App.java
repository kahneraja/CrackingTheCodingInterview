package c1_t3_URLify;

/**
 * Created by kahneraja on 8/12/17.
 */
public class App {
    public static String run(String s) {
        char[] urlItems = new char[s.length()];
        int index = 0;
        for(char c: s.toCharArray()){
            if (index > urlItems.length - 1) {
                break;
            }
            if (c == ' '){
                applySpace(urlItems, index);
                index += 3;
            } else {
                urlItems[index] = c;
                index++;
            }
        }
        return new String(urlItems);
    }

    private static void applySpace(char[] urlItems, int index) {
        urlItems[index] = '%';
        urlItems[index+1] = '2';
        urlItems[index+2] = '0';
    }
}
