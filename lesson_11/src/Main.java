public class Main {
    public static void main(String[] args) {
       /* int[]array={3,1,8,4,2,7};
        System.out.println("Boshlang'ich qiymat : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j <array.length;j++) {
                if (array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("O'sish tartibida tartiblash");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }*/
       /* int[] arr = {64, 25, 12, 22, 11};

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                    int temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }
        }
        System.out.print("O'sish tartibida: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }*/

        //insertion sort amali masalasi
        int[] array = {12, 11, 13, 5, 6};
        System.out.println("Boshlang'ich massiv:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        System.out.println("O'sish tartibida saralangan massiv:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}