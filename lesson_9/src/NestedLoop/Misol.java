package NestedLoop;

public class Misol {
    public static void main(String[] args) {
       /* int n = 7;
        int x = 2;
        int sum=1;
        for (int i = 1; i <= n; i++) {
            int pow = 1;
            for (int j =1; j <= i; j++) {
                pow *= x;
            }
            sum=sum+pow;
        }
        System.out.println(sum);*/
        int a = 10;
        int b = 1_000;
        for (int i = a; i <= b; i++) {
            int reverseNum = 0;
            int n = i;
            while (n != 0) {
                reverseNum = reverseNum * 10 + n % 10;
                n = n / 10;
            }
            if (i == reverseNum) {
                System.out.println(i);
            }
        }
    }
}
