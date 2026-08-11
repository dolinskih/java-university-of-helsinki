import java.util.ArrayList;

public class Pipe<T> {
    private ArrayList<T> list;

    public Pipe() {
        this.list = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.list.add(value);
    }

    public T takeFromPipe() {
        if (this.list.isEmpty()) {
            return null;
        }

        T lastItem = this.list.get(0);
        this.list.remove(0);

        return lastItem;
    }

    public boolean isInPipe() {
        if (this.list.isEmpty()) {
            return false;
        }

        return true;
    }
}
