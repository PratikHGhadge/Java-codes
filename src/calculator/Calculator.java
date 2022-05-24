package calculator;
import calculator2.Calc;

import java.util.Scanner;


public class Calculator extends Calc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int ch;
        int a, b;
        System.out.println(" ****************** Calculator *******************************");
        while (run){
            System.out.print("Enter value of num1 and num2 : ");
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("1 ADD");
            System.out.println("2 Sub");
            System.out.println("3 Multiply");
            System.out.println("4 Divide");
            System.out.println("5 Exit ");
            System.out.print(" Enter your choice :");
            ch = sc.nextInt();
            Calculator obj = new Calculator();
            switch (ch){
                case 1:
                    obj.add(a, b);
                    break;
                case 2:
                    obj.sub(a, b);
                    break;
                case 3:
                    obj.mult(a, b);
                    break;
                case 4:
                    obj.div(a, b);
                    break;
                case 5:
                    run = false;
                    break;
            }
        }

    }


}
