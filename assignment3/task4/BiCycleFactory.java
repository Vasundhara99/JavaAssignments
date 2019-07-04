package vasundhara.assignment3.task4;

public class BiCycleFactory implements CycleFactory{
    public Cycle buyCycle()
    {
        System.out.println("I am buying a bicycle");
        return new BiCycle();
    }
}
