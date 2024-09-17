package lec11_inheritance4;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class JavaSetDemo {
    public static void main(String[] args) {
        Set<Integer> S = new HashSet<>();
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
//        Set<Integer> S2 = new HashSet<>();
//        S2.add(5);
//        S2.add(23);
//        S2.add(42);
//        System.out.println(S.equals(S2));
    }
}
