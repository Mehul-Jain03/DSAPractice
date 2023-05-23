package arrays;

public class BubbleSort {


    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }


    public static void main(String[] args) {
        bubbleSort(new int[] {3,6,2,9,2,8,20,23,13});
    }
}
