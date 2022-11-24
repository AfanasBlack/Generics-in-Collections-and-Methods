import java.util.Random;

public class MagicBox<T> {
    protected int x;
    protected int maxObject;
    protected T[] items;
    Random random = new Random();

    public MagicBox(int maxObject) {

        this.maxObject = maxObject;
        this.items = (T[]) new Object[maxObject] ;
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                x++;
            }
        }

        if (x > 0) {
            throw new RuntimeException("Коробка не полна. Осталось еще " + x + " ячеек заполнить! ");
        }

        int randomInt = random.nextInt(maxObject);

        return items[randomInt];
    }

}
