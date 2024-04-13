package Method;

public class Main {
    public static void main(String[] args) {
//        show("Java");
        /* System.out.println( m1(5,11));*/
        /*int a=5,b=2;
        temp(a,b);*/
      /*  char [] arr={'d','a'};
        String s=convertToString(arr);
        System.out.println(s);*/
        System.out.println(son(35));
      /*  String txt = ishora(-8);
        System.out.println(txt);*/
//        haftaKuni(6);
//        son(126);
      /*  System.out.println(temp(2));*/
       /* System.out.println(misol(5,7,10));*/
    }

    /* public static void show(String s) {
         System.out.println(s);
     }*/
    /*public static int m1(int a, int b){
        return (a+b)*2;
    }*/
   /* public static void temp(int a,int b){
        System.out.println(a*b);
    }*/
    /*public static String convertToString(char[]arr){
        String s= "";
        for (char c: arr) {
            s+=c;
        }
        return s;
    }*/
  /*  private static String ishora(int a) {
        String ishora;
        if (a >= 0) {
            ishora = "mubat";
        } else
            ishora = "manfiy";

        return ishora;
    }*/
  /*  public static void haftaKuni(int kun) {
        switch (kun) {
            case 1 -> System.out.println("Duyshanba");
            case 2 -> System.out.println("Seyshanba");
            case 3 -> System.out.println("Chorshanba");
            case 4 -> System.out.println("Payshanba");
            case 5 -> System.out.println("Juma");
            case 6 -> System.out.println("Shanba");
            case 7 -> System.out.println("Yakshanba");
        }
    }*/
    public static int son(int n){
        int sum=0;
        for (int i = n; i!=0; i=i/10) {
            sum=sum+i%10;
        }
        return sum;
    }
   /* public static double temp(int radius){
     *//*   int m= (int) (radius*2*3.14);
        System.out.println(m);*//*
       return radius*1609.344;
    }*/
  /*  public static double misol(int a, int b, int c){
        double p= (a+b+c)/2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        return S;
    }*/

}
