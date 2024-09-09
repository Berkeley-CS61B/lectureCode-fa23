package lec5_lists3;

/** An SLList is a list of integers, which hides the terrible truth
   * of the nakedness within. */
public class SLList {	
	private class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
		}
	} 

	private IntNode first;
	private int size;

	public SLList(int x) {
		first = new IntNode(x, null);
		size = 1;
	}

 	/** Adds x to the front of the list. */
 	public void addFirst(int x) {
 		first = new IntNode(x, first);
 		size += 1;
 	}

 	/** Returns the first item in the list. */
 	public int getFirst() {
 		return first.item; 		
 	}

 	/** Adds an item to the end of the list. */
 	public void addLast(int x) {
 		size += 1;

 		IntNode p = first;

 		/* Move p until it reaches the end of the list. */
 		while (p.next != null) {
 			p = p.next;
 		}

 		p.next = new IntNode(x, null);
 	}

 	public int size() {
 		return size;
 	}
}