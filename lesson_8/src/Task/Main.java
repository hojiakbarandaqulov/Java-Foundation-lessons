package Task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* int kun=5;
        switch (kun){
            case 1-> System.out.println("Duyshanba");
            case 2-> System.out.println("Seyshanba");
            case 3-> System.out.println("Chorshanba");
            case 4-> System.out.println("Payshanba");
            case 5-> System.out.println("Juama");
            case 6-> System.out.println("Shanba");
            case 7-> System.out.println("Yakshanba");
        }*/
       /* int baho=6;
        switch (baho){
            case 1-> System.out.println("Yomon");
            case 2-> System.out.println("qoniqarsiz");
            case 3-> System.out.println("qoniqarli");
            case 4-> System.out.println("Yaxshi");
            case 5-> System.out.println("a'lo");
            default -> System.out.println("xato");
        }*/
//        int oy=3;
//        switch (oy){
//            case 1-> System.out.println("Qish");
//            case 2-> System.out.println("Qish");
//            case 3-> System.out.println("Baxor");
//            case 4-> System.out.println("Baxor");
//            case 5-> System.out.println("Baxor");
//            case 6-> System.out.println("Yoz");
//            case 7-> System.out.println("Yoz");
//            case 8-> System.out.println("Yoz");
//            case 9-> System.out.println("Kuz");
//            case 10-> System.out.println("Kuz");
//            case 11-> System.out.println("Kuz");
//            case 12-> System.out.println("Qish");
//        }
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("oyni kiriting: ");
        int n = scanner.nextInt();
        switch (n) {
            case 1 -> System.out.println(31);
            case 2 -> System.out.println(28);
            case 3 -> System.out.println(31);
            case 4 -> System.out.println(30);
            case 5 -> System.out.println(31);
            case 6 -> System.out.println(30);
            case 7 -> System.out.println(31);
            case 8 -> System.out.println(31);
            case 9 -> System.out.println(30);
            case 10 -> System.out.println(31);
            case 11 -> System.out.println(30);
            case 12 -> System.out.println(31);
            default -> System.out.println("Bunday oy yoq!");
        }*/
        /*int a=6,b=4;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);*/
       /* int a=3;
        switch (a) {
            case 1-> System.out.println("desimetr");
            case 2-> System.out.println("kilometr");
            case 3-> System.out.println("matr");
            case 4-> System.out.println("millimeter");
            case 5-> System.out.println("santimetr");
        }*/
       /* int tonna = 1000;
        int x = tonna / 1;
        System.out.println(x + " kilogramga teng");*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("yilni kiriting: ");
        int year=scanner.nextInt();
        System.out.println("oyni kiriting: ");
        int m=scanner.nextInt();
        System.out.println("kunni kiriting: ");
        int d=scanner.nextInt();
        d++;
        if (year % 4 != 0 && year % 100 == 0 || year % 400 != 0) {
            System.out.println(year+" Berilgan yil kabisa yili emas "+" Berilgan oy "+m+" Berilgan kun "+d);
        } else {
            System.out.println("kabisa yil ");
//        }SSS
//        int n=6;
//        int m=4;
//        switch (n){
//            case 1-> System.out.print(" bir");
//            case 2-> System.out.print(" ikki");
//            case 3-> System.out.print(" uch");
//            case 4-> System.out.print(" to'rt");
//            case 5-> System.out.print(" besh");
//            case 6-> System.out.print(" olti");
//            case 11-> System.out.print(" on bir");
//            case 12-> System.out.print(" on ikki");
//            case 13-> System.out.print(" on uch");
//            case 14-> System.out.print(" on to'rt");
//        }
//        switch (m){
//            case 1-> System.out.print(" 'isht");
//            case 2-> System.out.print(" olma");
//            case 3-> System.out.print(" chillak");
//            case 4-> System.out.print(" qarg'a");
//            case 11-> System.out.print(" valet");
//            case 12-> System.out.print(" olma");
//            case 13-> System.out.print(" qirol");
//            case 14-> System.out.print(" tuz");
//        }
        /*int yosh=21;
        switch (yosh){
            case 20-> System.out.println("yigrma yosh");
            case 21-> System.out.println("yigrma bir yosh");
            case 22-> System.out.println("yigrma ikki yosh");
            case 23-> System.out.println("yigrma uch yosh");
            case 24-> System.out.println("yigrma to'rt yosh");
            case 25-> System.out.println("yigrma besh yosh");
            case 26-> System.out.println("yigrma olti yosh");
            case 27-> System.out.println("yigrma yrtti yosh");
            case 28-> System.out.println("yigrma sakkiz yosh");
            case 29-> System.out.println("yigrma toqqiz yosh");
            case 30-> System.out.println("ottiz yosh");
        }*/
//        int a=106;
//        switch (a){
//            case 100-> System.out.println("yuz");
//            case 101-> System.out.println("bir yuzi bir");
//            case 102-> System.out.println("bir yuzi ikki");
//            case 103-> System.out.println("bir yuzi uch");
//            case 104-> System.out.println("bir yuzi to'rt");
//            case 105-> System.out.println(" bir yuzi besh");
//            case 106-> System.out.println("bir yuzi olti");
//            case 107-> System.out.println("yuz");
//            case 108-> System.out.println("yuz");
//            case 109-> System.out.println("yuz");
//            case 110-> System.out.println("yuz");
//            case 111-> System.out.println("yuz");
//            case 112-> System.out.println("yuz");
//            case 113-> System.out.println("yuz");
//            case 114-> System.out.println("yuz");
//            case 115-> System.out.println("yuz");
//            case 116-> System.out.println("yuz");
//            case 117-> System.out.println("yuz");
//            case 118-> System.out.println("yuz");
//            case 119-> System.out.println("yuz");
//            case 120-> System.out.println("yuz");
//            case 121-> System.out.println("yuz");
//            case 122-> System.out.println("yuz");
//        }
    }
}
}
