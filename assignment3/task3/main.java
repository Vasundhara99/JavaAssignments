package vasundhara.assignment3.task3;

public class main {
    static void ExamsCall(Exams exams)
    {
        exams.ExternalScore();
        exams.InternalScore();
    }
    static void LabsCall(Labs labs)
    {
        labs.ExternalLabScore();
        labs.InternalLabScore();
    }
    static void AttendanceCall(Attendance attendance)
    {
        attendance.ClassAttendance();
        attendance.LabAttendance();
    }
    static void WorkCall(Work work)
    {
        work.study();
    }
    public static void main(String args[])
    {
        JNTUStudent jntuStudent=new JNTUStudent();
        ExamsCall(jntuStudent);
        LabsCall(jntuStudent);
        AttendanceCall(jntuStudent);
        WorkCall(jntuStudent);
    }
}
