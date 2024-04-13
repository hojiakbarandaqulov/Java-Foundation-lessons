public class Metod {
    public static void main(String[] args) {
        add(3, 8);
        addSecond(4, 6, 6);
    }
    public static void add(int a,int b){
        int c=a+b;
        System.out.println("a+b="+c);
    }

    public static void addSecond(int a,int b,int c){
        int sum=a+b+c;
        System.out.println("a+b+c="+sum);
    }
}
