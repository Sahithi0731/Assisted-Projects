package collections;
import java.util.*;
public class sortedsetinterface {
	public static void main(String[] args) {
		SortedSet set = new TreeSet();
		set.add("mphasis");
		set.add("simplylearn");
		set.add("java");
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Object element = i.next();
			System.out.println(element.toString());
		}
	}

}
