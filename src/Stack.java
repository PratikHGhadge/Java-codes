import java.sql.SQLOutput;
import java.util.Scanner;

interface StackMethods {
    void push(int val);

    int pop();

    int size();

    boolean isEmpty();

    void display();
}

public class Stack implements StackMethods {
    int top;
    int[] arr;

    Stack() {
        top = -1;
        arr = new int[20];
    }

    @Override
    public void display() {
        if (top == -1) {
            System.out.println("STACK IS EMPTY...");
            return;
        }
        System.out.println("Stack is :");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    @Override
    public void push(int val) {
        if (top == arr.length - 1) {
            System.out.println("STACK IS FULL...");
            return;
        }
        top++;
        arr[top] = val;
    }

    @Override
    public int pop() {
        if (top == -1) {
            System.out.println("STACK IS EMPTY...");
            return -1;
        }
        int x = arr[top];
        top--;
        return x;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }


    public static void main(String[] args) {
        int ans, ch;
        Stack obj = new Stack();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("******************* Stack **********************");
            System.out.println("1 Push ");
            System.out.println("2 Pop ");
            System.out.println("3 isEmpty ");
            System.out.println("4 Display ");
            System.out.println("Enter your choice :");
            ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.println("Enter int to push :");
                    int temp = sc.nextInt();
                    obj.push(temp);
                    break;
                }

                case 2: {
                    System.out.println("Deleted int = " + obj.pop());
                    break;
                }

                case 3: {
                    if (obj.isEmpty()) {
                        System.out.println("Stack is Empty");
                    } else {
                        System.out.println("Stack is not empty");
                    }
                    break;
                }
                case 4: {
                    obj.display();
                    break;
                }
                default:
                    System.out.println("enter correct choice");
                    break;
            }
            System.out.println("Do you want to continue :");
            ans = sc.nextInt();
        } while (ans == 1);
    }
}
