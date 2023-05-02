package Assignment2;

public class Marks{
    String subject;
    int mid_sem;
    int end_sem;
    int misc;
    double percent;
    Character grade;

    Marks(String sub,int a, int b,int c){
        this.subject=sub;
        this.mid_sem=a;
        this.end_sem=b;
        this.misc=c;
        this.percent=a+b+c;
    }
}
