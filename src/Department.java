import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

interface DepartmentInterface {
    void writeRecord(String name, String department, int rollNumber);
    void readRecords();
}


public class Department implements DepartmentInterface{

    private File file;
    private FileWriter writer;
    private static String FILE_NAME = "temp.txt";


    @Override
    public void writeRecord(String name, String department, int rollNumber) {
        try {
            writer = new FileWriter(FILE_NAME, true);
            writer.append("Name: " + name
                    + " Department: " + department + " Roll Number: " + rollNumber + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred!");
        }

    }

    @Override
    public void readRecords() {
        try {
            file = new File(FILE_NAME);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println("An error occurred!");
        }
    }

    private static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Department Menu");
        System.out.println("1. Add record");
        System.out.println("2. Read all records");
        System.out.println("3. Exit");
        int choice;
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Department dept = new Department();

        boolean run = true;

        while (run) {

            switch (menu()) {
                case 1 -> {
                    String name;
                    System.out.print("Enter name: ");
                    name = sc.next();
                    String department;
                    System.out.print("Enter department: ");
                    department = sc.next();
                    int rollNumber;
                    System.out.print("Enter roll number: ");
                    rollNumber = sc.nextInt();

                    dept.writeRecord(name, department, rollNumber);
                }
                case 2 -> dept.readRecords();
                default -> run = false;
            }
        }
    }
}

