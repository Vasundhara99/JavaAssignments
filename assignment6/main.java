package vasundhara.assignment6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        SList<String> sl = new SList<String>();
        System.out.println(sl);
        SListIterator<String> slIter = sl.iterator();
        int noOfInserts=scan.nextInt();
        for(int i=0;i<noOfInserts;i++) {
            slIter.insert(scan.next());
            System.out.println(sl);
        }
        SListIterator<String> slIter2 = sl.iterator();
        System.out.println("removing first element");
        slIter2.remove();
        System.out.println(sl);
    }
}
