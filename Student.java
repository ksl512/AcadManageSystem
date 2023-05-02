package Assignment2;

import java.util.*;
public class Student extends Attendance {
    String name;
    String roll;
    Character gender;
    String email;
    String Phone_number;
    String degree;
    Hostel hostel;
    SemExams sem;

    Student(){
        hostel=new Hostel(-1,"Not Allowed");
        sem=new SemExams(6);
    }
    void setDetails(String n, String r,String e,String d,String p,Character g){
        this.name=n;
        this.roll=r;
        this.email=e;
        this.degree=d;
        this.Phone_number=p;
        this.gender=Character.toUpperCase(g);
        this.attendance=getAttendance();
    }

    int getAttendance(){
        Random r=new Random();
        return r.nextInt(101);
    }

    void setHostel(int mess,String hname){
        hostel = new Hostel(mess,hname);
    }
    void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.roll);
        System.out.println("Email: " + this.email);
        System.out.println("Phone Number: " + this.Phone_number);
        System.out.println("Degree: " + this.degree);
        System.out.println("Attendance Percentage in this Sem: " + this.attendance);
        System.out.println();
        System.out.println("Hostel Details");
        hostel.display();
        System.out.println();
        System.out.println("Academic Details");
        sem.display();
        System.out.println();
    }

}
