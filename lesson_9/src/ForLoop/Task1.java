package ForLoop;

public class Task1 {
    public static void main(String[] args) {
//        int n=7;
//        int sum=0;
//        for (int i=1; i<=n;i++){
//            sum=sum+i;
//        }
//        System.out.println(sum);
//        int n = 10;
//        int sum=0;
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 0) {
//                sum=sum+i;
//            }
//        }
//        System.out.println(sum);
      /*  int n = 10;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }*/
        int n = 35;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 10 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
       /* int n = 50;
        int count=0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                count++;







            }
        }
        System.out.println(count);*/
//        int a = 5;
//        int b = 15;
//        int count=0;
//        for (int i = a; i < b; i++) {
//           count=count+i;
//        }
//        System.out.println(count);
      /*  int a = 4;
        int b = 15;
        int count=0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
              count++;
            }
        }
        System.out.println(count);*/
        /*int a = 4;
        int b = 15;
        int count=0;
        int sum=0;
        for (int i = a; i < b; i++) {
            if (i % 3 == 0) {
                count++;
                sum=sum+i;
            }
        }
        System.out.println("yig'indisi: "+sum);
        System.out.println("soni: "+count);*/
//        int a = 6;
//        int b = 16;
//        int count = 0;
//        for (int i = a; i < b; i++) {
//            if (i % 2 == 0 && i % 3 == 0) {
//                count++;
//            }
//        }
//        System.out.println("soni: " + count);
      /*  int a = -6;
        int b = 10;
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i > 0) {
                count++;
            }
        }
        System.out.println("soni: " + count);*/
//        int a=2;
//        int sum=1;
//        for (int i=0;i<5;i++){
//            sum=sum*a;
//        }
//        System.out.println(sum);
       /* int a=2;
        int n=6;
        int sum=1;
        for (int i=0;i<n;i++){
            sum=sum*a;
        }
        System.out.println(sum);*/
      /*  int a = 3, n = 4;
        int sum = 0;
        int temp=0;
        for (int i = 0; i < n; i++) {
            temp=temp * 10 + a;
            sum=sum+temp;
        }
        System.out.println(sum);*/
       /* int n=6;
        int count=0;
        for (int i=0;i<n;i++){
            count=count;
        }
        System.out.println(count);*/
       /* int n = 10;
        int f_1 = 0;
        int f_2 = 1;
        int sum = 0;
        for (int i = 2; i < n; i++) {
            sum = sum + f_1 + f_2;
            int tem = f_1;
            f_1 = f_2;
            f_2 = f_2 + tem;
        }
        System.out.println(sum);*/
       /* int n=123345;
        int sum=0;
        for (int i = n; i !=0 ; i=i/10) {
            sum=sum+i%10;
        }
        System.out.println(sum);*/
    }
}



