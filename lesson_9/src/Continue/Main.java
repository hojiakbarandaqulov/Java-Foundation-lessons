package Continue;

public class Main {
    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i <= n; i++) {
            if (i==3||i==7||i==9){
              continue;
            }
            System.out.println(i);
        }
    }
}
