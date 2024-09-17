package lec11_inheritance4;

import java.util.Iterator;

public class ArraySet<T> {
    private T[] items;
    private int size; // the next item to be added will be at position size

    public ArraySet() {
        items = (T[]) new Object[100];
        size = 0;
    }

    /* Returns true if this map contains a mapping for the specified key. */
    public boolean contains(T x) {
        for (int i = 0; i < size; i += 1) {
            if (items[i].equals(x)) {
                return true;
            }
        }
        return false;
    }

    /* Associates the specified value with the specified key in this map.
       Throws an IllegalArgumentException if the key is null. */
    public void add(T x) {
        if (x == null) {
            throw new IllegalArgumentException("can't add null");
        }
        if (contains(x)) {
            return;
        }
        items[size] = x;
        size += 1;
    }

    /* Returns the number of key-value mappings in this map. */
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        ArraySet<Integer> S = new ArraySet<>();
        S.add(5);
        S.add(23);
        S.add(42);

        /* Nice iteration. */
//        for (int i : S) {
//            System.out.println(i);
//        }

        /* Ugly iteration. */
//        Iterator<Integer> seer = S.iterator();
//        while (seer.hasNext()) {
//            int x = seer.next();
//            System.out.println(x);
//        }

        /* toString. */
//        System.out.println(S);

        /* Equals. */
//        ArraySet<Integer> S2 = new ArraySet<>();
//        S2.add(5);
//        S2.add(23);
//        S2.add(42);
//        System.out.println(S.equals(S2));

    }
}