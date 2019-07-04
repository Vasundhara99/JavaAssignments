package vasundhara.assignment6;

public class Link<E> {
    E data;
    Link<E> next;
    Link(E data)
    {
        this.data=data;
        this.next=null;
    }
    Link(E data,Link<E> next)
    {
        this.data=data;
        this.next=next;
    }
    public String toString() {
        if(data == null) return "null";
        return data.toString();
    }
}
