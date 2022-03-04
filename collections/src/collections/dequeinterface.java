package collections;
import java.util.*;
public class dequeinterface {
	public static void main(String[] args) {
	Deque<Integer>num = new ArrayDeque<>();
	num.offer(10);
	num.offerLast(21);
	num.offerFirst(52);
	System.out.println("Deque elements:"+num);
	int first =  num.peekFirst();
	System.out.println("First element is:"+first);
	int lastElement = num.peekLast();
	System.out.println("Last Element:"+lastElement);
	int removed = num.pollFirst();
	System.out.println("Removed First Element:"+removed);
	System.out.println("Updated Deque is:"+num);
}

}
