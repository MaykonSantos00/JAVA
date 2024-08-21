package JavaCore.Arrays;

public class ForeachComArrayMultidimensional {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] arrayBase : arr) {
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
