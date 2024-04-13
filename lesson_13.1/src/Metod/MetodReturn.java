package Metod;
public class MetodReturn {
    public static void main(String[] args) {

        int n=add(5,8);
        System.out.println(n);
    }
    public static void greeting(String name){
        System.out.println("Mazgi "+name);
    }
    public static int add(int a,int b){
        int c=a+b;
        return c;
    }
}
