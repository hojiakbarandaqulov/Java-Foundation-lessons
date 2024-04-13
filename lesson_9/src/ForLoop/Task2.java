package ForLoop;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
       /* int n=5;
        int k=4;
        for (int i=1;i<=n;i++){
            System.out.println(i+") "+k);
        }*/
       /* int a=4,b=10;
        int count=0;
        for (int i=a;i<=b;i++){
            count++;
            System.out.println(count+")"+i);
        }*/
       /* int a=10,b=4;
        int count=0;
        for (int i=a;i>b;i--){
            count++;
            System.out.println(count+") "+i);
        }*/
//        int a = 0;
//        for (int i = 10; i>a; i--) {
//            System.out.println(i);
//        }
       /* int sum=5;
        int count=0;
        for (int i = 1; i <= 10; i++) {
            count=sum*i;
            System.out.println(count);
        }*/
       /* double sum=5;
        double count=0;
        for (double i = 0.1; i < 1; i++) {
            count=sum*i;
        }
        System.out.println(count);*/
        /*int a=4,b=10;
        int sum=0;
        for (int i = a; i <= b; i++) {
            sum=sum+i;
        }
        System.out.println(sum);*/
       /* int a=2,b=6;
        int sum=1;
        for (int i = a; i < b; i++) {
            sum=sum*i;
            System.out.println(sum);
        }*/
       /* int a=2,b=6;
        int sum=0;int temp=0;
        for (int i = a; i < b; i++) {
            sum=i*i;
            temp=sum+sum;
        }
        System.out.println(temp);*/
        /*int n = 4;
        int count = 0;
        for (int i = 0; i < n; i++) {
            count=count+1;
            System.out.println(count);
        }*/
//        int n=4;
//        int sum=0;
//        for (int i = 0; i < n; i++) {
//            sum=n*n+(n+1)*(n+1)+(n+2)*(n+2)+(2*n)*(2*n);
//        }
        /*int n=4;
        int sum=0;
        sum=n*n+(n+1)*(n+1)+(n+2)*(n+2)+(2*n)*(2*n);
        System.out.println(sum);*/
       /* int n=4;
        int sum=1;
        for (int i = 1; i < n; i++) {
            sum=sum*i;
            System.out.println(sum);
        }*/
      /*  int n=4;
        int sum=1;
        for (int i = 1; i < n; i++) {
            sum=sum-i;
            System.out.println(sum);
        }*/


       /* int n=5;
        for (int i = 1; i < n; i++) {
            if (i %2==1){
                System.out.println(i+i*(2*i-1));
            }
        }*/
      /*  int n=6;
        for (int i = 1; i < n; i++) {
            if (i==n&&i>n){
                System.out.println(i-n);
            }else {
                System.out.println(i+n);
            }
        }*/
       /* int n=4;
        int a=2,sum=0;
        for (int i = a; i < n; i++) {
            sum=a*a*a*a;
        }
        System.out.println(sum);*/
        /*int n = 6;
        int a = 2;
        int sum = 0;
        for (int i = a; i <= n; i++) {
            sum = i*i;
            System.out.println(sum);
        }*/
        /*int n=4;
        int sum=0;
        for (int i = 1; i <=n; i++) {
            sum=i*i;
            System.out.println(sum);
        }
*/
//        int n=4;
//        int k=2;
//        int sum=0,count=0;
//        for (int i = k; i <=n; i++) {
//            count++;
//            sum=count+i;
//            System.out.println(sum);
//        }
      /*  int n=11;
        int sum=0;
        for (int i = 1; i < n;i++ ) {
            sum=sum+n;
            System.out.println(sum);
        }*/
       /* int n=4;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum=i+2*(n-1)+3*(n-3)+n*(n-1);
            System.out.println(sum);
        }*/
//        int n = 6;
//        int sum = 0;
//        for (int i = 1; i < n; i++) {
//            if (n % i == 0) {
//                sum = sum + i;
//            }
//        }
//            if (n==sum){
//                System.out.println(true);
//            }else {
//                System.out.println(false);
//        }
      /*  int n=6;
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum=i*i;
            System.out.println(sum);
        }*/
       /* int n = 7;
        for (int i = 1; i <= n; i++) {
        }
            if (n % n == 0 && n % 1 == 0){
                System.out.println(true);
            }else {
                System.out.println(false);
            }*/
    /*    int n=121;
        int sum=0;
        for (int temp = n; temp !=0; temp=temp/10) {
            sum++;
        }
        System.out.println(sum);*/
       /* int n = 21;
        int sum = 0;
        int temp = 0;
        for (; n != 0; ) {
            sum = n % 10;
            temp = temp * 10 +sum;
            n=n/10;
        }
        System.out.println(temp);*/
      /*  int n = 42;
        int sum = 0;int temp=0;
        for (int i = 1; i <= n; i++) {
            sum=i%10;
            temp=i/10;
        }
        System.out.println(temp+sum);*/
     /*   int n = 12321;
        int num=n;
        int sum;
        int temp = 0;
        for (; num != 0; ) {
            sum = num % 10;
            temp = temp * 10 + sum;
            num=num/10;
        }
        if (n==temp){
            System.out.println("Teng");
        }else {
            System.out.println("Teng emas");
        }*/
        int n = 35;
        int sum = 0;
        for (int i = n; i % 10 != 0; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
