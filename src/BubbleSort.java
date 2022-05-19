import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter elements of array: ");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        bubbleSort(array, n);

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

    }


    public static void bubbleSort(int[] array, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}