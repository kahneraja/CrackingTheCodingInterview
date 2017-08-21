package c1_t9_StringRotation;

public class App {
    public static boolean run(String a, String b) {
        if (a.length() != b.length()){
            return false;
        }
        return (b + b).contains(a);
    }
}
