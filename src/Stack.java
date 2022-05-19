interface StackMethods{
    void push(int val);
    int pop();
    int size();
    boolean isEmpty();
    void display();
}
public class Stack implements StackMethods {
    int top;
    int[] arr;
    Stack(){
        top=-1;
        arr = new int[20];
    }
    @Override
    public void display(){
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    @Override
    public void push(int val) {
        top++;
        arr[top] = val;
    }

    @Override
    public int pop() {
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
        return top==-1;
    }
    public static void main(String[] args) {
        Stack obj = new Stack();
        System.out.println(obj.isEmpty());
        obj.push(7);
        obj.push(3);
        obj.push(2);
        obj.push(9);
        System.out.println(obj.isEmpty());
        System.out.println(obj.pop());
        obj.display();
    }
}
