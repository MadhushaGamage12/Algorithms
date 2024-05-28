public class BubbleSort1 {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {104,25,88,52,11,7};
        bubbleSort(arr);
        System.out.println("Sorted array :");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
