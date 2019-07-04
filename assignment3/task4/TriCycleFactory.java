package vasundhara.assignment3.task4;

public class TriCycleFactory implements CycleFactory{
    public Cycle buyCycle()
    {
        System.out.println("I am buying a tricycle");
        return new TriCycle();
    }
}
