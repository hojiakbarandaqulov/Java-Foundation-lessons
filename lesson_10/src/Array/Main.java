package Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     /* String arr[]={"Ali","Vali","Toshmat","Eshmat"};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        String name=arr[3];
        System.out.println(name);

        arr[2]="Qo'yojon";
        System.out.println(arr[2]);*/
//        String arr[]={"Ali","Vali","Toshmat","Eshmat"};
       /* String arr[]=new String[3];
        int numbers[]={1,2,3,4,5,6,7};
        boolean n[]=new boolean[4];
        n[1]=true;*/
        /*System.out.println(arr.length);
        System.out.println(numbers.length);*/
       /* for (int i = 0; i < 3; i++) {
            System.out.println(n[i]);
        }*/
     /*   int numbers[]={12, 21, 36, 71, 24, 85, 1, 30, 25};
        int max = numbers[0];
        for (int i = 1; i <numbers.length; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println(max);*/
      /*  int numbers[]={12, 18};
        int count=0;
        int sum=0;
        int arr=numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            count=arr+numbers[i];
            sum=count/numbers.length;
        }
        System.out.println(count);
        System.out.println(sum);*/
      /*  int n=23;
        int arr[]={6, 25, 91, 23, 72, 9, 18, 6};
        boolean found=false;
        for (int i = 0; i < arr.length; i++) {
            if (n==arr[i]){
                found=true;
                break;
            }
        }
        System.out.println(found);*/
       /* int n = 3;
        int arr[] = {6, 25, 91, 23, 72, 9, 18, 6};
        if (n < 0 ||n>=arr.length) {
            System.out.println(0);
        } else {
            System.out.println(arr[n]);
        }*/
       /* int arr[] = {6, 25, 91, 23, 72, 9, 18, 6};
        int n=13;
        int arrays[]=new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            arrays[i]=arr[i];
        }
        arrays[arr.length]=n;
        System.out.println(Arrays.toString(arrays));*/
       /* int arr[] = {6, 25, 91, 23, 72, 9, 18, 6};
        int n=13;
        int arrays[]=new int[arr.length+1];
        arrays[0]=n;
        for (int i = 1; i < arr.length+1; i++) {
            arrays[i]=arr[i-1];
        }
        System.out.println(Arrays.toString(arrays));*/
      /*  int arr[] = {4, 5, 6, 7};
        int a = 1, b = 9;
        int subIndex = 0;
        int mas[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length + 1; i++) {
            if (i == a) {
                mas[i] = b;
            } else {
                mas[i] = arr[subIndex];
                subIndex++;
            }
        }
        System.out.println(Arrays.toString(mas));*/
        /*int[] arr = {4, 5, 6, 7};
        int a = 2;
        int subIndex = 0;
        int[] mas = new int[arr.length - 1];
        for (int i = 0; i < arr.length-1; i++) {
            if (i==a) {
                subIndex++;
            }else {
                mas[i]=arr[subIndex];
                subIndex++;
            }
        }
        System.out.println(Arrays.toString(mas));*/
      /*  int[] arr = {4, 5, 6, 7};
        int[] mas = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            mas[arr.length-1-i]=arr[i];
        }
        System.out.println(Arrays.toString(mas));*/
      /*  int[] arr = {4, 5, 6, 4};
        int n=4;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==n){
                count++;
            }
        }
        System.out.println(count);*/
      /*  int[] arr = {4, 5, 6, 4};
        int[] array = {4, 5, 6, 4};
        for (int i = 0; i < array.length; i++) {
            if (arr[i]==array[i]){
                System.out.println("teng");
            }else {
                System.out.println("teng emas");
            }
        }*/

    }
}
