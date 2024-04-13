package Foreach;

public class Main {
    public static void main(String[] args) {
        int []numbers={2,4,3,5,10};
        String[]name={"Ali","Vali","Eshmat","Toshmat"};

        for (int n:numbers){
            System.out.println(n);
        }
        System.out.println();
        for (String n:name){
            System.out.println(n);
        }
    }
}
