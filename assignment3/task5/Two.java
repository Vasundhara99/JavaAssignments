package vasundhara.assignment3.task5;

public class Two {
    static class InnerClassTwo extends One.InnerClassOne
    {
        InnerClassTwo(int a,int b)
        {
            super(a,b);
        }
    }
    public static void main(String args[])
    {
        InnerClassTwo innerClassTwo=new InnerClassTwo(2,3);
    }
}
