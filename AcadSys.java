package Assignment2;

import java.util.Scanner;


public class AcadSys {
    public static void main(String[] args) {
        Acad_Office iitbhu=new Acad_Office();
        Scanner in=new Scanner(System.in);
        while(true) {           // Menu Card for the Academic Office
            System.out.println("Enter 0 to exit\nEnter 1 for adding given number of students,\n 2 for displaying list of all students\n 3 for displaying a student of given roll number\n 4 for adding marks of a student of given rollnumber");
            int Menu = in.nextInt();
            switch (Menu) {
                case 0 -> {
                    System.out.println("Shutting down...");
                    System.exit(0);
                }
                case 1 -> {
                    System.out.println("Enter number of students to be admitted");
                    int n = in.nextInt();
                    in.nextLine();
                    iitbhu.nstudents(n);
                }
                case 2 -> {
                    for (Student s : iitbhu.studentList) {
                        s.display();
                    }
                }
                case 3 -> {
                    in.nextLine();
                    System.out.println("Enter the roll number of the student");
                    String roll = in.nextLine();
                    Student s = iitbhu.searchStudent(roll);
                    if (s != null)
                        s.display();
                    else
                        System.out.println("No student with roll-no " + roll + " exists");
                }
                case 4 -> {
                    in.nextLine();
                    System.out.println("Enter the roll number of the student");
                    String roll = in.nextLine();
                    Student s = iitbhu.searchStudent(roll);     //Search for the student with the reference of roll number
                    if (s == null) {
                        System.out.println("No student with roll-no " + roll + " exists");
                    }
                    else {
                        System.out.println("Enter the subject name, mid-sem marks, end-sem marks and miscellaneous marks if any, else 0");
                        String sub = in.nextLine();
                        int mid = in.nextInt();
                        int end = in.nextInt();
                        int misc = in.nextInt();
                        in.nextLine();      // Flush Statement in Java
                        s.sem.setMarks(sub, mid, end, misc);
                        System.out.println("Marks added!");
                        s.display();
                    }
                }
                default -> System.out.println("No functionality available for given code");
            }
        }
    }
}
