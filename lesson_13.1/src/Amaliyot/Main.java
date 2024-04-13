package Amaliyot;

public class Main {
    public static void main(String[] args) {
//        show("Alish",5);
//        Integer(5,4);
    /* int n=2,m=3;
     download(n,m);*/
       /* char[]arr={'J','a','v','a'};
        String s=convertToString(arr);
        System.out.println(s);*/
        /* System.out.println(son(0));*/
        /* print(10);*/
       /* System.out.println(raqam(127));*/
     /*   System.out.println(aylana(5));*/
//        System.out.println(son(5,3,6));
        System.out.println(gipetinuza(4,3,5));
    }
    public static boolean gipetinuza(int a, int b, int c){
        return c*c == a * a + b * b;
    }
  /*  public static int son(int a,int b,int c){
        int p=(a+b+c)/2;
        double S=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return (int) S;
    }*/
    /*public static void show(String s,int n){
        System.out.println(s);
        System.out.println(n);
        System.out.println(s+n);
    }*/
   /* public static void Integer(int a,int b){
        int P=2*(a+b);
        System.out.println(P);
    }*/
    /*public static void download(int a, int b){
        System.out.println(a*b);
    }*/
   /* public static String convertToString(char[]array){
        String s="";
        for (char c:array){
            s+=c;
        }
        return s;
    }*/
  /*  public static String son(int n){
        if (n>0){
            return "musbat";
        } else if (n<0) {
            return "manfiy";
        }
        return "Mazgi 0 ekanku!!";
    }*/
   /* public static int print(int day) {
        switch (day) {
            case 1 -> System.out.println("Duyshanba");
            case 2 -> System.out.println("Seyshanba");
            case 3 -> System.out.println("Chorshanba");
            case 4 -> System.out.println("Payshanab");
            case 5 -> System.out.println("Juma");
            case 6 -> System.out.println("Shanba");
            case 7 -> System.out.println("Yakshanba");
            default -> System.out.println("Bunday kun yoq!");
        }
            return day;
    }*/
    /*public static int raqam(int n) {
        int sum = 0;
        for (int i = n; i !=0;i=i/10) {
           sum=sum+i%10;
        }
        return sum;
    }*/
  /*  public static String aylana(int n){
        if (n%2==0){
            return "Juft";
        }
        return "Toq";
    }*/
}
