package vasundhara.assignment6;

public class SList<E> {
    private Link<E> head = new Link<E>(null);
    SListIterator<E> iterator() { return new SListIterator<E>(head); }
    public String toString() {
        if(head.next == null) return "SList: []";
        System.out.print("SList: [");
        SListIterator<E> it = this.iterator();
        String s = new String();
        while(it.hasNext()) {
            s+=it.next() + (it.hasNext() ? ", " : "");
        }
        return s + "]";
    }
}
