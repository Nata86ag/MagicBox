import java.util.Random;

public class MagicBox <T> {

    private T[] items;
    private int size;


    public MagicBox(int size) {
        this.items = (T[]) new Object[size];
        this.size = size;
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
                throw new RuntimeException(String.format("Коробка не полна. Осталось ещё заполнить ячеек %d",items.length - i));
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(size);
        return (items[randomInt]);
    }
}

