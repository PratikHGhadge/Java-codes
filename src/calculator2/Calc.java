package calculator2;
interface calculator_functions{
    void add(int a, int b);
    void sub(int a, int b);
    void mult(int a, int b);
    void div (int a, int b);
}
public class Calc implements calculator_functions{
    @Override
    public void add(int a, int b) {
        int c = a+b;
        System.out.println("a+b="+c);
    }

    @Override
    public void sub(int a, int b) {
        int c = a-b;
        System.out.println("a-b="+c);
    }

    @Override
    public void mult(int a, int b) {
        int c = a*b;
        System.out.println("a*b="+c);
    }

    @Override
    public void div(int a, int b) {
        int c = a/b;
        System.out.println("a/b="+c);
    }
}
