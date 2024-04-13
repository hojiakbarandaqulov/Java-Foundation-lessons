package ArrayScanner;

    public class Array {
       public void sort(int arr[]) {
            int n = arr.length;
            for (int i = 0; i < n-1; i++) {
                int min_idx = i;
                for (int j = i+1; j < n; j++){
                    if (arr[j] < arr[min_idx]) {
                        min_idx = j;
                    }
                }
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
        public void printArray(int arr[]) {
            int n = arr.length;
            for (int i = 0; i < n; ++i) {
                System.out.print(arr[i] + " ");
                System.out.println();
            }
        }
        public static void main(String args[]) {
            Array obj = new Array();
            int arr[] = {2,98,43,123,1};
            obj.sort(arr);
            System.out.println("Sorted array");
            obj.printArray(arr);
        }
    }
