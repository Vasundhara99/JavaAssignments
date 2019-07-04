package vasundhara.assignment3.task4;

public class UniCycleFactory implements CycleFactory{
    public Cycle buyCycle()
    {
        System.out.println("I am buying a unicycle");
        return new UniCycle();
    }
}
