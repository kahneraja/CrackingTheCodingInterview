package c1_t8_ZeroMatrix;

public class App {
    public static void run(int[][] m) {
        int h = m.length;
        int w = m[0].length;
        for(int y = 0; y < h; y++){
            for(int x = 0; x < w; x++){
                int current = m[y][x];
                if (current == 0){
                    m[0][x] = 0;
                    m[y][0] = 0;
                }
            }
        }

        for(int y = 1; y < h; y++) {
            if (m[y][0] == 0){
                for(int x = 1; x < w; x++){
                    m[y][x] = 0;
                }
            }
        }

        for(int x = 1; x < w; x++){
            if (m[0][x] == 0){
                for(int y = 1; y < h; y++){
                    m[y][x] = 0;
                }
            }
        }

        if (m[0][0] == 0){
            for(int x = 0; x < w; x++){
                m[0][x] = 0;
            }
            for(int y = 0; y < h; y++){
                m[y][0] = 0;
            }
        }

    }
}
