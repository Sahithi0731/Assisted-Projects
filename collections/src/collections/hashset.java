package collections;
import java.util.HashSet;
public class hashset {
	public static void main(String args[]) {
		HashSet<String>hset = new HashSet<String>();
		hset.add("mphasis");
		hset.add("simplylearn");
		hset.add("java");
		hset.add("collections");
		hset.add("hashset");
		hset.add("hashset");
		hset.add("mphasis");
		hset.add(null);
		hset.add(null);
		//displaying hashset elements
		System.out.println(hset);
	}

}
