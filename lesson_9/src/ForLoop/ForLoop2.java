package ForLoop;

public class ForLoop2 {
    public static void main(String[] args) {
       /* int n = 12;
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
                return;
            }
        }
        if (count==0){
            System.out.println("tup son");
        }else {
            System.out.println("tub emas");
        }*/
//        int i=5;
//        for (i=0; true;i++) {
//            System.out.println(i);
//        }
        /*for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }*/

        int n=11;
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum=sum+i;
            System.out.println(sum);
        }
    }
}
