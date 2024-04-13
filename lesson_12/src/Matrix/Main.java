package Matrix;

public class Main {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,4,3},
                {6,8,7,9},
                {11,33,22}
        };
        int n=matrix[0][1];
        System.out.println(n);
        int[]arr={11,33,22,22,44};
        matrix[0]=arr;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
