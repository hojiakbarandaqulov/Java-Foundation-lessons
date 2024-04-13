package NestedLoop;

public class Amaliyot_1 {
    public static void main(String[] args) {
       /* int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
               if (i>j){
                   System.out.print(" ");
               }else {
                   System.out.print("*");
               }
            }
            System.out.println();
        }
*/


       /* int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                if (j<i) {
                    System.out.print("  ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }*/
       /* int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=i; j++) {
                if (j<i) {
                    System.out.print("  ");
                }else {
                    System.out.print("("+i+","+j+")");
                }
            }
            System.out.println();
        }*/
     /*   int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
       /* int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j ==n-i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
       /* int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <=j) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }*/
       /* int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >=j) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }*/
       /* int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0) {
                    System.out.print("*");
                } else if (j==0) {
                    System.out.print("*");
                }else if (i==4){
                    System.out.print("*");
                }else if (j==4){
                    System.out.print("   *");
                }
            }
            System.out.println();*//*
        }*/
       /* int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    System.out.print(" ");
                } else if (i == 0 || i == j|| j == n - 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*//*int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j==i){
                    System.out.print(" *");
                }else if (i<j){
                    System.out.print("+");
                }else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }*/
       /* int n = 5;
        int column = 1;

        for (int i = 0; i < 2 * n - 1; i++) {

            for (int j = 0; j < n - column; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < column; j++) {
                System.out.print("* ");
            }

            if (i < n - 1) {
                column++;
            } else {
                column--;
            }

            System.out.println();
        }*/
/*
        int n=5;
        int column=1;
        for (int i = 0; i < 2*n; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i<n-1){
                column++;
            }else {
                column--;
            }
        }
*/
        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    }
