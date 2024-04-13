package NestedLoop;

public class Amaliyot {
    public static void main(String[] args) {
      /*  int n=7,x=2;
        int sum=1;
        for (int i = 1; i <=n ; i++) {
            int pow=1;
            for (int j = 1; j <=i ; j++) {
                pow *=x;
            }
            sum=sum+pow;
        }
        System.out.println(sum);*/
    /*    long a=2,b=5,c=3;
        int sum=0;
        for (long i = a; i <= b; i++) {
            long num=0;
            for (int j = 1; j <= i; j++) {
                num=num*10+i;
            }
            sum+=num;
            System.out.print(i+" * "+c+" = "+(i*c)+" ");
            if (i!=b){
                System.out.print(" + ");
            }
        }
        System.out.println(" = "+sum);*/
       /* for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 0 || i == 9 || j == 0 || j == 9) {
                    System.out.print("("+i+ "," + j+")");
                }
            }
            System.out.println();
        }
*/
     /*   int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == 9 || j % 2 == 0) {
                    System.out.print(" (" + i + "," + j + ") ");
                } else {
                    System.out.print("       ");
                }
            }
            System.out.println();
        }*/
        /*int n=10;
        int counter=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(counter+"  ");
               counter++;

            }
            System.out.println();
        }*/
        /*int a = 12, b = 50;
        for (int i = a; i <= b; i++) {
            int reversNum = 0;
            int j = i;
            while ( j != 0) {
                reversNum = reversNum * 10 + j % 10;
                j = j / 10;
            }
            if (i == reversNum) {
                System.out.println(i);
            }
        }*/
       /* int a = 2;
        int b = 10;
        int c = 3;

        int sum = 0;
        for (int i = a; i <= b; i++) {
            int power = 1;

            for (int j = 0; j < c; j++) {
                power = power * i;
            }
            sum += power;
        }
        System.out.println(sum);*/
      /*  int a=2,x=7;
        int sum=1;
        for (int i = 1; i <= x; i++) {
            int pow=1;
            for (int j = 1; j <= i; j++) {
               pow*=a;
            }
            sum=sum+pow;
        }
        System.out.println(sum);
*/
//        int n=5;
//        int sum=0;
//        for (int i = 1; i <=n ; i++) {
//            sum=sum+i;
//        }
//        System.out.println(sum);
       /* int n = 7;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("tub son");
        } else {
            System.out.println("tub emas");
        }*/
        /*int a = 12;
        int b = 50;

        for (int i = a; i <= b; i++) {
            int temp = i;
            int reverseNum = 0;
            while (temp != 0) {
                reverseNum++;
            }
            if (reverseNum == 2) {
                System.out.println("tub son");
            } else {
                System.out.println("tub emas");
            }
        }
*/
        /*int n=5;
        int sum=1;
        for (int i = 1; i <=n; i++) {
            sum=sum/i+i;
        }
        System.out.println(sum);*/
      /*  int n = 5;
        int x = 2;
        int sum=0;
        for (int i = 1; i <=n; i++) {
            sum=sum+i+x*x/i;
        }
        System.out.println(sum);
*/
      /*  int n = 5;
        int x = 2;
        int sum=0;
        for (int i = 1; i <=n; i++) {
            sum=sum+i+x*x*x/i;
        }
        System.out.println(sum);
*/
       /* int n = 4;
        int x = 2;
        int sum=0;
        for (int i = 2; i <=n; i++) {
            sum=sum+i-x*x/i-x*x*x/i-x*x*x*x/i;
        }
        System.out.println(sum);*/
       /* int n = 5;
        int x = 2;
        int sum=0;
        for (int i = 2; i <=n; i++) {
            sum=sum+i-x*x*x/i-x*x*x*x*x/i;
        }
        System.out.println(sum);*/
       /* int n=2;
        int a=4,b=5;
        int sum=1,sum1=1;
        for (int i = 1; i <=n ; i++) {
            sum=sum+a/n;
            sum1=sum1+b/n;
        }
        System.out.println(sum);
        System.out.println(sum1);*/
       /* int n=2;
        int a=4,b=5;
        int sum=1,sum1=1;
        for (int i = 1; i <=n ; i++) {
            sum=sum+a/n;
            sum1=sum1+b/n;
        }
        System.out.println(sum);
        System.out.println(sum1);*/
   /*     int n = 153;
        int temp = n;
        int sum = 0;
        int m;
        int numberLenght = 0;

        for( ;temp != 0; temp = temp / 10){
            m = temp % 10;
            if(m > 0){
                numberLenght ++;
            }

        }

        temp = n;
        for ( ; temp != 0;  temp = temp / 10) {
            m = temp % 10;

            int pow = 1;

            for(int j=0; j< numberLenght; j++){
                pow = pow * m;
            }

            sum = sum + pow;
        }

        if (sum == n) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }*/
      }
    }


