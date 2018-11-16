package beans;

/**
 *
 * @author Mañana
 */
public class Taza<T> {

    private T item;

    public Taza() {
    }

    public Taza(T item) {
        System.out.println("Taza " + item.getClass());
        this.item = item;
    }
    
    public Taza(T item, String msg) {
        System.out.println(msg);
        System.out.println("Taza " + item.getClass());
        this.item = item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Taza{" + "item=" + item + '}';
    }

}

