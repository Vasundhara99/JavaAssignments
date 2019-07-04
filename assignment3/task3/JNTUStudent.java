package vasundhara.assignment3.task3;

public class JNTUStudent extends Student implements Work {
    JNTUStudent()
    {

    }
    Student student=new Student();
    public void InternalScore()
    {
      System.out.println("A jntu student's internal score depends upon how well he studies one hr before the exam");
    }
    public void ExternalScore()
    {
        System.out.println("A jntu student's external score depends upon how well he studies one night before the exam");
    }
    public void InternalLabScore()
    {
        System.out.println("A jntu student's internal lab score depends upon how well he doesn't study");
    }
    public void ExternalLabScore()
    {
        System.out.println("A jntu student's external lab score depends upon how well he studies during the exam");
    }
    public void ClassAttendance()
    {
        System.out.println("A jntu student's class Attendance depends upon how well he knows the CR");
    }
    public void LabAttendance()
    {
        System.out.println("Lab Attendance doesn't matter");
    }
    public void study()
    {
        System.out.println("A jntu student studies once a year");
    }

}
