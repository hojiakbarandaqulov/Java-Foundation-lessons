package ArrayScanner;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Arrayni uzunligini kiriting: ");
        int n = scanner.nextInt();
        int[] number = new int[n];

        System.out.println("Sonlerni kiriting");
        for (int i = 0; i < number.length; i++) {
            System.out.println("array[" + i + "]=");

            int a = scanner.nextInt();
            number[i] = a;
        }
        System.out.println("Array elementlari:");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }*/
       /* int[]numbers=new  int[5];
        numbers[0]=33;
        numbers[1]=32;
        numbers[2]=34;
        numbers[3]=35;
        numbers[4]=12;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/
        /*int n=6;
        int[]numbers=new int[n];
        int num=1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=num;
            num+=2;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

*/

        /*int n=6;
        int[]numbers=new int[n];
        int num=1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=num;
            num+=num;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
*/
       /* int n=5;
        int[]numbers=new int[n];
        int num=2;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=num;
            num+=3;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/
      /*  int n=5;
        int[]numbers=new int[n];
        int num=2;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=num;
            num*=3;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/

        /*int n=4;
        int[]numbers=new int[n];
        int num=2;
        for (int i = 0; i < numbers.length; i++) {
            num=num+numbers[0] + numbers[i];
            int t=numbers[i];

            numbers[0]=numbers[1];
            numbers[1]=numbers[1]+t;
        }
        System.out.println(num);*/
       /* int n = 7;
        int[] numbers = new int[n];
        int num = 2;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = num;
            if (n > num) {
                num += 2;
            }else {
                num += num;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/
        /*int[] numbers = {1,2,7,9};
        int num = 2;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]+=num;
//            num += 2;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/
      /*  int[] number = {7, 2, 8, 9};
        int n = 2;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                number[i] = n;
                n += 2;
            }
        }
        System.out.println(n);*/
       /* int[] number = {7, 2, 8, 9};
        int n = 2;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
               number[i]+=2;
            }
            System.out.println(number[i]);
        }*/
       /* int n[]={2,3,5,4,7,6};
        int m=n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i]>m) {
                m = n[i];
            }
        }
        System.out.println(m);*/
       /* int []n={2,3,5,4,7,6};
        int m=n[0];
        for (int i = 1; i < n.length; i++) {
           m=n[1];
           n[1]=m;
            System.out.println(n[i]);
        }*/
       /* int array[] = {5, 1, 91, 1, 59, 1, 45, 178};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
*/
       /* int array[] = {5, 1, 91, 1, 59, 1, 45, 178};
        int max=array[0];
        for (int i = 0; i <array.length ; i++) {
            if(max<array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);*/

      /*  int array[] = {5, 1, 91, 1, 59, 1, 45, 178};
        int n = 10;
        int max[] = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            max[i] = array[i];
        }
        max[array.length] = n;
        System.out.println(Arrays.toString(max));*/
        /*int array[] = {5, 1, 91, 1, 59, 1, 45, 178};
        int n = 10;
        int max[] = new int[array.length-1];
        for (int i = 0; i < array.length-1; i++) {
            max[i] = array[i];
        }
        System.out.println(Arrays.toString(max));*/

        int[] a = {3, 6, 8, 31, 7, 9, 2, 12, 13, 14};
        int[] b = new int[a.length/2];
        int aIndex = 1;
        for (int i = 0; i < b.length; i++) {
            b[i] = a[aIndex];
            aIndex+=2;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
       /* int []a={3,6,8,31,7,9,2};
        int[]b=new int[a.length];
        int aIndex=1;
        for (int i = 0; i < b.length; i++) {
            b[i]=a[aIndex];
            aIndex += 2;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }*/
        }
    }

