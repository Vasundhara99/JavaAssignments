package vasundhara.assignment4;

public class main {
    public static void main(String args[])
    {
        ThrowExceptions throwExceptions=new ThrowExceptions();
        try {
            throwExceptions.m1();
        }
        catch(Exception e)
        {
         System.out.println(e);
        }
        finally
        {
            System.out.println("Finally got executed");
        }
    }
}
