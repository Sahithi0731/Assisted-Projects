package stringinarrayofstrings;
import java.util.ArrayList;
import java.util.Iterator;
public class FindingString {
	public static void main(String[] args) {
		ArrayList <String>list = new ArrayList<String>();
		//Instantiating an arraylist object
		list.add("mphasis");
		list.add("simplylearn");
		list.add("java");
		list.add("strings");
		list.add("arrays");
		list.add("java script");
		list.add("hadoop");
		list.add("websearch");
		list.add("HTML");
		list.add("HBase");
		list.add("JOGL");
		list.add("OpenCV");
		System.out.println("Contents of the array list:");
		for(String element : list) {
			if(element.contains("java")) {
				System.out.println(element);
			}
		}
	}
}