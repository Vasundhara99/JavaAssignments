package vasundhara.assignment3.task4;

public class main {
    public static void rideCycle(CycleFactory factory) {
        Cycle c = factory.buyCycle();
        c.ride();
    }
    public static void main(String [] args) {
        rideCycle(new UniCycleFactory());
        rideCycle(new BiCycleFactory());
        rideCycle(new TriCycleFactory());
    }
}
