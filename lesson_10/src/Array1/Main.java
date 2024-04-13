package Array1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int []a={3,-6,-8,31,0,-10};

        int []b=new int[a.length];
        int index=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>=0){
                b[index]=a[i];
                index++;
            }
        }
        int[]c=new int[index];
        for (int i=0;i<index;i++){
           c[i]=b[i];
        }
        System.out.println("C arrayning uzunligi: "+c.length);

        for (int i=0;i<c.length;i++){
            System.out.println(b[i]);
        }
*/
        /*int [] array = {1,3,2,5,4,13};
        int n = 2;

        int[] mas = new int[array.length];
        int subIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i%2!=0) {
                subIndex++;
            }
           *//* mas[i] = array[subIndex];*//*
            subIndex++;
        }

        System.out.println(Arrays.toString(mas));*/
       /* int[] array = {1, 3, 2, 5, 4, 13};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[0] % 2 == 0 || i % 2 == 0) {
                count=array[i];
            }
        }
        System.out.println(count);
*/
       /* int[] array = {1, 3, 2, 5, 4, 13};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[0] % 2 != 0 ||array.length % 2 != 0) {
                count=array[i];
            }
        }
        System.out.println(count);*/
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Arrayni kiriting: ");
        int uzunlik = scanner.nextInt();
        int element[] = new int[uzunlik];
        System.out.println("Elementlarni kiritish: ");
        for (int i = 0; i < uzunlik; i++) {
            System.out.println("Element " + (i + 1) + ":");
            element[i] = scanner.nextInt();
        }
        for (int i = 0; i < element.length; i++) {
            if (element[i] % 2 != 0){
                element[i] *=2;
            }
        }
        for (int i = 0; i < element.length; i++) {
            System.out.print(element[i]+" ");
        }*/
       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Arrayni Uzunligini kiriting: ");
        int uzunlik = scanner.nextInt();
        int element[] = new int[uzunlik];
        System.out.println("Elementlarni kiritish: ");
        for (int i = 0; i < uzunlik; i++) {
            System.out.print("Element " + (i + 1) + ":");
            element[i] = scanner.nextInt();
        }
        for (int i = 0; i < element.length; i++) {
            if (element[i] % 2 == 0){
                element[i] +=2;
            }
        }
        for (int i = 0; i < element.length; i++) {
            System.out.print(element[i]+" ");
        }*/
     /*   int []array={2,3,6,4,2};
        int []a=new int[array[0]];
        for (int i = 0; i < array.length; i++) {
            if (a[i]!=array[i]){
              break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/
            int[] arr = new int[]{1, -2, 3, -4, 5};

            int positiveCount = 0;
            for (int i : arr) {
                if (i < 0) {
                    positiveCount++;
                }
            }

            int[] res = new int[arr.length + positiveCount];
            int resIndex = 0;

            for (int i : arr) {
                if (i < 0) {
                    res[resIndex++] = 0;
                }
                res[resIndex++] = i;
            }

            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(res));
    }
}
