import java.util.Scanner;

public class HeapSort {
    Scanner sc = new Scanner(System.in);
    int[] heap;
    int n;

    public void accept(){
        System.out.println("Enter the value of n :");
        n = sc.nextInt();
        heap = new int[n+1];
        System.out.println("Enter element of array :");
        for (int i = 1; i < n+1; i++) {
            heap[i] = sc.nextInt();
        }
    }

    public void create(){
        heap[0] = n;
        for (int i = n/2; i >= 1; i--) {
            downAdj(i);
        }
    }

    public void downAdj(int i){
        int j;
        while (2*i<heap[0]){
            j = 2*i;
            if (j+1<=heap[0] && heap[j]<heap[j+1]){
                j++;
            }
            if (heap[i]<heap[j]){
                swap(i, j);
                i=j;
            }else {
                break;
            }
        }
    }

    void swap(int i, int j){
        int temp = heap[i];
        heap[i]=heap[j];
        heap[j] = temp;
    }

    void sort(){
        heap[0] = n;
        while (heap[0]>=1){
            swap(1, heap[0]);
            heap[0]--;
            downAdj(1);
        }
    }

    void display(){
        for (int i = 1; i <= n; i++) {
            System.out.print(heap[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HeapSort obj = new HeapSort();
        obj.accept();
        System.out.println("Array before sorting :");
        obj.display();
        obj.create();
        System.out.println("Maximized array :");
        obj.display();
        obj.sort();
        System.out.println("Array after sorting :");
        obj.display();
    }
}
