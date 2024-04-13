package MatodArray;


public class Main {
    public static void main(String[] args) {
       /* int[]array={1,3,2,4,5,6};
        printArray(array,"Alish");*/
        printArray(makeArray(2,4,6,8));
    }
    public static void printArray(int[]array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[]makeArray(int a, int b,int c,int d){
        int[]array=new int[4];
        array[0]=a;
        array[1]=b;
        array[2]=b;
        array[3]=d;
        return array;
    }
}
