// Submit all example Java programs demonstrating printing, scanning, command line arguments,
// Control structures, types of classes etc.

public class Assignment1 {
    public static void main(String[] args) {
        // a)	Hello World and Use of data type
        System.out.println("Hello world");
        String name = "Pratik Ghadge";
        char gender = 'M';
        boolean isGraduated = false;
        int rollNumber = 23;

        System.out.println("Name is " + name);
        System.out.println("Gender is " + gender);
        System.out.println("isGraduated is " + isGraduated);
        System.out.println("rollNumber is " + rollNumber);

        // b)	Use of mixed data types
        char a = 'B';
        int b = 32;
        System.out.println(a + b);

        // c)	Command Line Arguments
//        int a1 = Integer.parseInt(args[0]);
//        int b1 = Integer.parseInt(args[1]);
//        int c = a1 + b1;
//        System.out.println("Addition is =" + c);

        // d)	Operators in Java (Arithmetic, Logical, Relational, conditional, bitwise)
        int numOne = 10;
        int numTwo = 20;

        int add = numOne + numTwo;
        int sub = numOne - numTwo;
        int mul = numOne * numTwo;
        int div = numOne / numTwo;

        boolean equ = (numOne == numTwo);

        System.out.println("Addition is " + add);
        System.out.println("Substraction is " + sub);
        System.out.println("Multiplication is " + mul);
        System.out.println("Division is " + div);
        System.out.println("Equal or not " + equ);

        numOne = numTwo >> 3;
        numTwo = numTwo << 2;
        System.out.printf("Nume one and num two: %d, %d \n", numOne, numTwo);

        if(numOne > numTwo){
            System.out.println("Num one greater");
        }else{
            System.out.println("Num two greater");
        }



        // e)	Control Structures (for, while, if-else)
        int age = 18;

        if (age < 18) {
            System.out.println("You are not allowd!");
        } else if (age == 18) {
            System.out.println("Just wait one more year!");
        } else {
            System.out.println("You are allowed!");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d ", i);
        }

        System.out.println();

        int index = 2;

        while (index <= 10) {
            System.out.println(index);
            index = index + 2;
        }

        // f)	Strings in JAVA (different class constructors, String operations)

        String name1 = new String("Pratik");
        String lastname = "Ghadge";

        char chars[] = {'a', 'b', 'c', 'd'};

        byte ascii[] = {65, 66, 67, 68, 69, 70};

        String asciiWord = new String(ascii);


        System.out.println(name1);
        System.out.println(lastname);
        System.out.println(chars);
        System.out.println(ascii);
        System.out.println(asciiWord);

        System.out.println("Name word length: " + name1.length());

        String age1 = "18";
        String output = "He is " + age1 + " years old";

        System.out.println(output);

        System.out.println(lastname.charAt(4));

        // g)	Class, Passing values to methods (by value, pass by reference) , Abstract Class
        User userOne = new User();

        userOne.setData("Pratik", 18);

        User userTwo = new User();

        userOne.setDataByReference(userTwo);

        userOne.display();
        userTwo.display();

    }

}

abstract class UserAbstract {

    abstract void display();

}

class User extends UserAbstract {

    String name = null;
    int age = 18;

    void setData(String _name, int _age) {
        name = _name;
        age = _age;
    }

    void setDataByReference(User user) {
        user.name = name;
        user.age = age;
    }
    @Override
    void display() {
        System.out.printf("Name: %s, age: %d \n", name, age);
    }
}

