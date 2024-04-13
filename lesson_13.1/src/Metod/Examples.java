package Metod;

public class Examples {
    public static void main(String[] args) {
//        System.out.println(ishora(0));
        System.out.println(multiply(2,3,add(3,2,4)));
    }
//    public static String ishora(int n){
//        if (n>0){
//            return "musbat";
//        }else if (n<0){
//            return "manfiy";
//        }
//            return "Mazgi 0 ekanku!!!!";
//    }
   public static int multiply(int a,int b,int c){
        int d=a*b*c;
        return d;
   }
   public static int add(int a,int b,int c){
        int d=a+b+c;
        return d;
    }
}
