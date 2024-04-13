package Array;

public class Array {
    public static void main(String[] args) {
/*
        int []numbers={11,4,31,55,23,44};
        int a=numbers[0];
        int b=numbers[1];
        System.out.println(a);
        System.out.println(b);*/
       /* int[] numbers = {2, 7, 6, 5, 8, 99, 12, 35, 62, 18};
        int n = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                System.out.println(numbers[n - i - 1]);
            }
        }*/
//        int[] numbers = {5, 9, 11, 4, 5};
//        int n=4;
//        boolean found=false;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i]==n) {
//                found = true;
//                break;
//            }
//        }
//      if (found){
//          System.out.println("Bor ekan");
//      }else {
//          System.out.println("Mazgi!");
//      }
       /* int[] numbers = {5, 9, 11, 4, 15};
        int max=numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println(max);*/
      /*  int[] n = {2, 7, 6, 5, 8, 99};
        int m = n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                m = n[i];
            }
        }
        System.out.println(m);*/
        /*int[] n = {2, 3, 4, 6};
        int m = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                m = n[i];
            }
            if (n[i] % 2 != 0) {
                System.out.println(n[i]);
            }
        }
        System.out.println(m);*/
        /*int[]n={2,3,5,4,6};
        int r=n[0];
        int m=0;
        for (int i = 1; i < n.length; i++) {
            if (n[i]>r){
                m=n[i];
            }
        }
        System.out.println(m);*/
       /* int[] n = {2, 3, 5, 4, 6,9,11};
        int m = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 != 0) {
                System.out.println(n[i]);
            }
        }*/
        /*int[] n = {2, 3, 5, 4, 6, 9, 11};
        System.out.println("Juftlari");
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                System.out.println(n[i]);
            }
        }
        System.out.println("Toqlari");
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 != 0) {
                System.out.println(n[i]-i-1);
            }
        }*/
       /* int  arr[]={2,6,8,1,2,9,12,5,81,90};
        int n=3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%n==0){
                System.out.println(arr[i]);
            }
        }*/
       /* int  arr[]={2,6,8,1,2,9};
        int n=arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(n-i-1);
            if (arr.length>arr[i]){
                System.out.println(arr[i]);
            }
        }*/
       /* int  []arr={2,6,8,1,2,9};
        int k=2,l=5;
        int m=0;
        for (int i = k; i < arr.length; i++) {
            if (k<l){
               m=m+arr[i];
            }
        }
        System.out.println(m);*/
       /* int  []arr={2,6,8,1,2,9};
        int k=2,l=5;
        int m=0;
        for (int i = k; i < arr.length; i++) {
            if (k<l){
                m=m+arr[i]/i;
            }
        }
        System.out.println(m);*/
        int  []arr={2,6,8,1,2,9};
        int m=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
               m=arr[i];
            }
        }
        System.out.println(m);
    }
}
