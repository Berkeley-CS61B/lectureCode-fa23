package lec8_inheritance1;

public class IsADemo {
    public static void main(String[] args) {
        List61B<String> someList = new SLList<>();
        someList.addFirst("elk");
        someList.addLast("dwell");
        someList.addLast("on");
        someList.addLast("existential");
        someList.addLast("crises");
        someList.print();
    }
}