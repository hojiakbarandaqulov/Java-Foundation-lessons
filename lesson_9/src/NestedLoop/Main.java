package NestedLoop;

public class Main {
    public static void main(String[] args) {
       /* for (int i = 0; i < 5; i++) {
            System.out.println(i+" Salom");
            for (int j = 0; j < 3; j++) {
                System.out.println(i);
            }
        }*/
        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + " " + j);
            }
        }*/
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.println(i +" * "+j +" = " + (i*j)+"  ");
//            }
//            System.out.println("---------------");
//        }
      /*  int n=10;
        long sum=0;
        for (int i = 1; i <=n ; i++) {
            long num=0;
            for (int j = 0; j < i ; j++) {
               num=num*10+i;
            }
            System.out.print(num);
            sum+=num;
            if (i!=n){
                System.out.print(" + ");
            }
        }
        System.out.println(" = "+sum);*/
       /* for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==1 && j==1){
                    continue;
                }
                System.out.println(i+" "+j);
            }
        }*/
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if(j==2) {
                    break;
                }
                System.out.println(i+" "+j);
            }

        }
    }
}
