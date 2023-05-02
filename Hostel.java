package Assignment2;

public class Hostel {
    int mess_fee;
    String hostelname;

    Hostel(int mess,String hname){
        this.mess_fee=mess;
        this.hostelname=hname;
    }
    void display(){
        System.out.println("Hostel Name is: " + this.hostelname);
        System.out.println("Mess Fee Balance: " + this.mess_fee);
    }
}
