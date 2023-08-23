package lec4_lists2.DIY;

/** This is a fill in the blanks version of the SLList class
 *  in case you want to try to figure out how to write it yourself.
 */
public class SLList {
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode first; 

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }    

    /** Retrieves the front item from the list. */
    public int getFirst() {
        return first.item;
    }

    /** Adds an item to the end of the list. */
    public void addLast(int x) {
        /* Your Code Here! */
    }

    /** Returns the number of items in the list using recursion. */
    public int size() {
        /* Your Code Here! */
        return 0;
    }
}