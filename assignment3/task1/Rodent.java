package vasundhara.assignment3.task1;
public abstract class Rodent {
    Rodent()
    {
        System.out.println("I am from Rodent family");
    }
    abstract void makeSound();
    void eat()
    {
        System.out.println("Rodent is eating");
    }
}
