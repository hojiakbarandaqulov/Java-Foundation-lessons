package Matrix;

import java.util.Scanner;

public class Amaliyot {
    public static void main(String[] args) {
       /* int m = 5;
        int n = 3;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 10 * i;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }*/
      /*  int m = 5;
        int n = 3;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 5 * j;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/
       /* int m = 5;
        int n = 5;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 5 * j;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("m ni kiriting: ");
        int m = scanner.nextInt();
        System.out.print("n ni kiriting: ");
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int startValue = n * i + 1;
            for (int j = 0; j < n; j++) {
                System.out.print(startValue + j + " ");
            }
            System.out.println();
        }*/
       /* int m = 5;
        int n = 3;
        int[][] matrix = new int[m][n];
        int k = 3;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 5 * j;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == k) {
                    continue;
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }*/
      /*  int m = 5;
        int n = 4;
        int[][] matrix = new int[m][n];
        int k = 3;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = j * 1;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0){
                    System.out.print(matrix[i][j] + " ");
                }else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }*/
      /*  int m = 5;
        int n = 4;
        int[][] matrix = new int[m][n];
        int k = 3;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = j * 1;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == k) {
                    System.out.print(matrix[k][j] + " ");
                }
            }
                System.out.println();
        }*/
      /*  int m = 5;
        int n = 4;
        int[][] matrix = new int[m][n];
        int k = 3;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = j * 1;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == k) {
                    System.out.print(matrix[i][k] + " ");
                }
            }
            System.out.println();
        }*/
       /* int m = 5;
        int n = 4;
        int[][] matrix = new int[m][n];
        int k = 3;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = j * 1;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i%2==0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }*/
       /* int k=3;
        int m=5,n=3;
        int[][]matrix=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]=j+i;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }*/
        int m=3,n=2;
        int[][]matrix=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]=j;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
