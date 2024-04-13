import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int []number={6,4,3,8,7,5};
        String[]names={"Alish","Valish"};
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(names));
        Arrays.sort(number);
//        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.binarySearch(number,4));
        int[]testArray=Arrays.copyOf(number,3);
        System.out.println(Arrays.toString(testArray));
        int[]emptyArray=new int[10];
        Arrays.fill(emptyArray,5);
        System.out.println(Arrays.toString(emptyArray));

    }
  /*  public static void print(int[]number){
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
    public static void print(String[]number){
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }*/
}