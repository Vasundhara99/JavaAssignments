package vasundhara.assignment3.task2;

public class main {
    public static void main(String[] args)
    {
        Cycle cycle[]=new Cycle[3];
        Unicycle unicycle=new Unicycle();
        Bicycle bicycle=new Bicycle();
        Tricycle tricycle=new Tricycle();
        cycle[0]=(Cycle)unicycle;
        cycle[1]=(Cycle)bicycle;
        cycle[2]=(Cycle)tricycle;

        /*cycle[0].balance();
        cycle[1].balance();
        cycle[2].balance();
        */
        unicycle=(Unicycle)cycle[0];
        bicycle=(Bicycle)cycle[1];
        tricycle=(Tricycle)cycle[2];
        unicycle.balance();
        bicycle.balance();
        //tricycle.balance();
    }
}
