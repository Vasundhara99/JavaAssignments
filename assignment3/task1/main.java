package vasundhara.assignment3.task1;
public class main {
    public static void main(String args[]) {
        Rodent rodent[]=new Rodent[3];
        rodent[0] = new Hamster();
        rodent[1] = new Gerbil();
        rodent[2] = new Mouse();
        /*THE ABOVE 3 LINES EXECUTE THE BASE CLASS CONSTRUCTOR FIRST AND THEN THE DERIVED CLASS CONSTRUCTOR*/
        rodent[0].makeSound();
        rodent[1].makeSound();
        rodent[2].makeSound();
        rodent[0].eat();
        rodent[1].eat();
        rodent[2].eat();
        /*ALL THE ABOVE METHODS EXECUTE THE OVERRIDDEN DERIVED CLASS METHODS.THIS IS CALLED POLYMORPHISM*/
    }
}
