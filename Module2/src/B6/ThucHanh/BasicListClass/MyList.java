package B6.ThucHanh.BasicListClass;


import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elments[];

    public MyList() {
        elments = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elments.length * 2;
        elments = Arrays.copyOf(elments, newSize);
    }

    public void add(E e) {
        if (size == elments.length) {
            ensureCapa();
        }
        elments[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elments[i];
    }
}
