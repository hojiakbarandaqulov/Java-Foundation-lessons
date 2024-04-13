package MantiqiyOperatorlar;

public class Main {
    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        // && Va operatori
//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(a>5 &&a <10);
//        System.out.println(b>5 &&b <7);
        // || Yoki operatori
//        System.out.println(true || false);
//        System.out.println(a>5 || a==6);
//        System.out.println(b<6 || b<10);
//        System.out.println(a>b ||b>15);
//        System.out.println(a>10 ||b==6);

        // ! Inkor operatori
        System.out.println(!(a>1));
        System.out.println(!(b>a));
        System.out.println(!(a>b));
        System.out.println(!(a>5 && a<10));

    }
}
