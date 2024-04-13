package Sccanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        add();
    }
    public static void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ismingizni kiriting: ");
        String name = scanner.next();
        System.out.print("Familyangizni kiriting: ");
        String surname=scanner.next();
        System.out.println("Familyangiz : "+name);
        System.out.println("Ismingiz : "+surname);
    }
}
