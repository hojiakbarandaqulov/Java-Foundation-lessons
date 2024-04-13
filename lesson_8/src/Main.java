public class Main {
    public static void main(String[] args) {
       /* int n=6;
        switch (n){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Xafta kuni");
                break;
            case 6:
            case 7:
                System.out.println("Xafta oxiri( shanba yo yakshanba)");
                break;
            default:
                System.out.println("Mazgi");
        }*/
        int kun=6;
        switch (kun) {
            case 1,2,3,4,5 -> {
                System.out.println("Hafta kuni");

            }
          case 6,7 -> System.out.println("Dam olish kuni");
            default -> System.out.println("Kun topilmadi");
        }

    }
}