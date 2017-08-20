package c1_t7_MatrixRotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {


    /**
     * Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
     * write a method to rotate the image by 90 degrees. can you do this in place?
     * Hints: #51, #100
     * - Try thinking about it layer by layer. Can you rotate a specific layer?
     * - Rotating a specific layer would just mean swapping the values in four arrays.
     * If you were asked to swap the values in two arrays, could you do this?
     * Can you then extend it to four arrays?
     */

    @Test
    public void testA(){
        int[][] original = new int[][]{
                { 0, 1, 2 },
                { 3, 4, 5 },
                { 6, 7, 8 },
        };
        int[][] rotated = new int[][]{
                { 6, 3, 0 },
                { 7, 4, 1 },
                { 8, 5, 2 },
        };
        App.run(original);
        assertArrayEquals(rotated, original);
    }

    @Test
    public void testB(){
        int[][] original = new int[][]{
                { 0, 1, 2, 3 },
                { 4, 5, 6, 7 },
                { 8, 9, 10, 11 },
                { 12, 13, 14, 15}
        };
        int[][] rotated = new int[][]{
                { 12, 8, 4, 0 },
                { 13, 9, 5, 1 },
                { 14, 10, 6, 2 },
                { 15, 11, 7, 3}
        };
        App.run(original);
        assertArrayEquals(rotated, original);
    }

    @Test
    public void testC() {
        int a = 3/2;
        assertEquals(1, a);
    }

    @Test
    public void testD(){
        int[][] original = new int[][]{
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
                { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 },
                { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 },
                { 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 },
                { 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 },
                { 50, 51, 52, 53, 54, 55, 56, 57, 58, 59 },
                { 60, 61, 62, 63, 64, 65, 66, 67, 68, 69 },
                { 70, 71, 72, 73, 74, 75, 76, 77, 78, 79 },
                { 80, 81, 82, 83, 84, 85, 86, 87, 88, 89 },
                { 90, 91, 92, 93, 94, 95, 96, 97, 98, 99 }
        };
        int[][] rotated = new int[][]{
                { 90, 80, 70, 60, 50, 40, 30, 20, 10, 0 },
                { 91, 81, 71, 61, 51, 41, 31, 21, 11, 1 },
                { 92, 82, 72, 62, 52, 42, 32, 22, 12, 2 },
                { 93, 83, 73, 63, 53, 43, 33, 23, 13, 3 },
                { 94, 84, 74, 64, 54, 44, 34, 24, 14, 4 },
                { 95, 85, 75, 65, 55, 45, 35, 25, 15, 5 },
                { 96, 86, 76, 66, 56, 46, 36, 26, 16, 6 },
                { 97, 87, 77, 67, 57, 47, 37, 27, 17, 7 },
                { 98, 88, 78, 68, 58, 48, 38, 28, 18, 8 },
                { 99, 89, 79, 69, 59, 49, 39, 29, 19, 9 }
        };
        App.run(original);
        assertArrayEquals(rotated, original);
    }

    @Test
    public void testE(){
        int[][] original = new int[][]{
                { 0, 1, 2, 3, 4, 5, 6, 7, 8 },
                { 10, 11, 12, 13, 14, 15, 16, 17, 18 },
                { 20, 21, 22, 23, 24, 25, 26, 27, 28 },
                { 30, 31, 32, 33, 34, 35, 36, 37, 38 },
                { 40, 41, 42, 43, 44, 45, 46, 47, 48 },
                { 50, 51, 52, 53, 54, 55, 56, 57, 58 },
                { 60, 61, 62, 63, 64, 65, 66, 67, 68 },
                { 70, 71, 72, 73, 74, 75, 76, 77, 78 },
                { 80, 81, 82, 83, 84, 85, 86, 87, 88 },
        };
        int[][] rotated = new int[][]{
                { 80, 70, 60, 50, 40, 30, 20, 10, 0 },
                { 81, 71, 61, 51, 41, 31, 21, 11, 1 },
                { 82, 72, 62, 52, 42, 32, 22, 12, 2 },
                { 83, 73, 63, 53, 43, 33, 23, 13, 3 },
                { 84, 74, 64, 54, 44, 34, 24, 14, 4 },
                { 85, 75, 65, 55, 45, 35, 25, 15, 5 },
                { 86, 76, 66, 56, 46, 36, 26, 16, 6 },
                { 87, 77, 67, 57, 47, 37, 27, 17, 7 },
                { 88, 78, 68, 58, 48, 38, 28, 18, 8 },
        };
        App.run(original);
        assertArrayEquals(rotated, original);
    }

}
