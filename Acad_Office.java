package Assignment2;

import java.util.*;

public class Acad_Office {
    ArrayList <Student> studentList=new ArrayList<>();

    void nstudents(int n){
        while(n-- > 0){
            hostelAllot(studentAdmission());
        }

    }

    void hostelAllot(Student k){
        switch (k.roll.substring(0, 2)) {
            case "22" -> {
                if (k.gender == 'F') {
                    k.setHostel(12000, "GSMC-Extension");
                    System.out.println("Hostel: GSMC-Extension is Allotted for you");
                } else {
                    k.setHostel(12000, "Aryabhatta");
                    System.out.println("Hostel: Aryabhatta is Allotted for you");
                }
            }
            case "21" -> {
                if (k.gender == 'F') {
                    k.setHostel(15000, "Gamcha");
                    System.out.println("Hostel: Gamcha is Allotted for you");
                } else {
                    k.setHostel(15000, "DG-2");
                    System.out.println("Hostel: DG-2 is Allotted for you");
                }
            }
            case "20" -> {
                if (k.gender == 'F') {
                    k.setHostel(15000, "Gamcha");
                    System.out.println("Hostel: Gamcha is Allotted for you");
                } else {
                    k.setHostel(15000, "Rajputana");
                    System.out.println("Hostel: Rajputana is Allotted for you");
                }
            }
            default -> System.out.println("No Hostel being allotted.");
        }
    }

    Student searchStudent(String roll)
    {
        for(Student s:studentList)
        {
            if(s.roll.equals(roll))
                return s;
        }
        return null;
    }
    Student studentAdmission(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name=sc.nextLine();
        System.out.print("Enter email: ");
        String mail=sc.nextLine();
        System.out.print("Enter dept: ");
        String dept=sc.nextLine();
        System.out.print("Enter phone number: ");
        String phone=sc.nextLine();
        System.out.print("Enter roll number: ");
        String roll=sc.nextLine();
        System.out.print("Enter Gender: ");
        Character gend=sc.next().charAt(0);
        Student s=new Student();
        s.setDetails(name,roll,mail,dept,phone,gend);
        studentList.add(s);
        System.out.println("Admission is Successfull.");
        return s;
    }
}
