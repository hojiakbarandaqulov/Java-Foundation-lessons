package Varargs;

public class Main {
    public static void main(String[] args) {
        print(5,"Alish",2,1,3,4,5);
        print(4);
    }

  /*  public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }*/
  public static void print(int age,String naem,int... array) {
      for (int i = 0; i < array.length; i++) {
          System.out.println(array[i]);
      }
  }
    public static void print(int... array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
