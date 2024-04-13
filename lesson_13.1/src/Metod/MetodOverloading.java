package Metod;

public class MetodOverloading {
    public static void main(String[] args) {
        add(2, 3);
        add(2, 3, 4);
        add(5,6);
        add("Alish","Valish");
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b);
    }
    public static void add(Long a,Long b){
        System.out.println(a+b);
    } public static void add(String a,String b){
        System.out.println(a+b);
    }
}
