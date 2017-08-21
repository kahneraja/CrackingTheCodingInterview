package c1.t7_MatrixRotation;

public class App {
    public static void run(int[][] nbyn) {
        int zoom = 0;
        for (int j = 0; j < nbyn.length / 2; j++) {
            for (int i = 0; i < nbyn.length - 1 - (zoom * 2); i++) {
                rotatePoint(nbyn, new Point(i, 0), zoom);
            }
            zoom++;
        }
    }

    private static void rotatePoint(int[][] nbyn, Point p, int zoom) {
        int n = nbyn.length - 1;
        Point a = new Point(p.x + zoom, p.y + zoom);
        Point b = new Point(n - zoom, p.x + zoom);
        Point c = new Point(n - p.x - zoom, n - zoom);
        Point d = new Point(p.y + zoom, n - p.x - zoom);

        int aTemp = nbyn[a.y][a.x];
        nbyn[a.y][a.x] = nbyn[d.y][d.x];
        nbyn[d.y][d.x] = nbyn[c.y][c.x];
        nbyn[c.y][c.x] = nbyn[b.y][b.x];
        nbyn[b.y][b.x] = aTemp;
    }


    private static class Point {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
