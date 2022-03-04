package collections;
import java.util.*;
public class queueinterface {
	public static void main(String args[]) {
		Queue<String>queue = new LinkedList<>();
		queue.add("mphasis");
		queue.add("simpplylearn");
		queue.add("java");
		queue.add("collections");
		System.out.println(queue);
		queue.remove("java");
		System.out.println(queue);
		System.out.println("Queue includes 'mphasis'?:"+queue.contains("mphasis"));
		queue.clear();
	}

}
