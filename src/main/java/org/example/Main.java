package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your ID:");
        String id = reader.nextLine();

        System.out.println("Enter your name:");
        String name = reader.nextLine();
        int choice;

        Student student = new Student(id, name);

        do {
            System.out.println("Type 1, if you want to search by ID");
            System.out.println("Type 2, if you want to search by name");
            System.out.println("Type 3, if you want to add students");
            System.out.println("Type 4 to exit");
            choice = reader.nextInt();
            reader.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Please enter the student ID:");
                    String searchID = reader.nextLine();
                    student.searchByID(searchID);
                    break;
                case 2:
                    System.out.println("Please enter the student name:");
                    String searchName = reader.nextLine();
                    student.searchByName(searchName);
                    break;
                case 3:
                    System.out.println("How many students do you want to add?");
                    int entries = reader.nextInt();
                    reader.nextLine();
                    Student[] students = new Student[entries];
                    for (int i = 0; i < students.length; i++) {
                        students[i] = new Student();
                        students[i].addStudent(i + 1);
                    }
                    System.out.println("\\nHere are the new students you added:\\n");
                    for (int i = 0; i < students.length; i++) {
                        students[i].displayStudent(i + 1);
                    }
                    break;
                case 4:
                    System.out.println("Exiting：");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

        reader.close();
    }
}