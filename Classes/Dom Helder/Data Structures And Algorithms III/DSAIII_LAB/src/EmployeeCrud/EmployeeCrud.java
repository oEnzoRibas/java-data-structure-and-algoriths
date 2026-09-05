package EmployeeCrud;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;


public class EmployeeCrud {

    final static int nameSize = 30, registerSize = 100;

    public static void main() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("data/employees.dat","rw");
        Scanner sc = new Scanner(System.in);


        int option = -1;


        do{
            System.out.println("\n 1 - Register new Employee");
            System.out.println("\n 2 - Search Employee");
            System.out.println("\n 3 - List Employee");
            System.out.println("\n 4 - Delete Employee");
            System.out.println("\n 0 - Exit");

            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Register");
                    break;
                case 2:
                    System.out.println("Emplooyee");
                    break;
                case 3:
                    System.out.println("List");
                    break;
                case 4:
                    System.out.println("Delete");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }while(option != 0);


    }
    static void register(RandomAccessFile file, Scanner sc) throws IOException{
        System.out.println("ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Salary: ");
        double salary = sc.nextDouble();

        long pos = getPos(id);

        file.seek(pos);

        file.write(id);

        StringBuffer buffer = new StringBuffer(name);
        buffer.setLength(nameSize);

        file.writeChars(buffer.toString());

        file.writeDouble(salary);

        System.out.println("The employee has been registered succesfully!");
    }

    static void search(RandomAccessFile file, Scanner sc) throws IOException
    {
        System.out.println("Employee's ID to search");
        int id = sc.nextInt();

        long pos = getPos(id);

        if (pos >= file.length()){
            System.out.println("This ID is not registered");
            return;
        }

        file.seek(pos);

        int code = file.readInt();

        char[] name = new char[nameSize];

        for (int i = 0; i< nameSize; i++){
            name[i] = file.readChar();
        }

        String nameStr = new String(name).trim();

        double salary = file.readDouble();

        System.out.printf("""
                EMPLOYEES DATA
                
                ID: %n
                NAME: %s
                SALARY: %d
                """ code, nameStr);

    }

    static long getPos(int id){
        return (long) (id - 1) * registerSize;
    }
}
