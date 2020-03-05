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

class MylistTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));

        listInteger.get(6);
        System.out.println("element 6: "+listInteger.get(6));
    }
}

