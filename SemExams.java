package Assignment2;

import java.util.ArrayList;

public class SemExams {
    ArrayList<Marks> subjects;

    SemExams(int n){
        subjects= new ArrayList<>();
    }

    void display(){
        for (int i=0;i<subjects.size();i++){
            System.out.println(subjects.get(i).subject + "Marks");
            System.out.println("MidSem Marks: " + subjects.get(i).mid_sem);
            System.out.println("Endsem Marks: " + subjects.get(i).end_sem);
            System.out.println("Miscellaneous Marks: " + subjects.get(i).misc);
            System.out.println("Percentage of this Sem: " + subjects.get(i).percent + "%");
            if(subjects.get(i).percent > 90){
                subjects.get(i).grade='A';
            }
            else if(subjects.get(i).percent <= 90 && subjects.get(i).percent>=50){
                subjects.get(i).grade='B';
            }
            else if(subjects.get(i).percent<50 && subjects.get(i).percent >= 33){
                subjects.get(i).grade='C';
            }
            else{
                subjects.get(i).grade='F';
            }
            System.out.println("The grade for this sem is: " + subjects.get(i).grade);
            System.out.println();
        }
    }

    void setMarks(String sub,int mid,int end,int misc){
        subjects.add(new Marks(sub,mid,end,misc));
    }
}


