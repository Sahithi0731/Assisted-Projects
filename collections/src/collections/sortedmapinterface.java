package collections;
import java.util.*;
public class sortedmapinterface {
	public static void main(String args[]) {
		TreeMap<String, Double>t = new
		TreeMap<String, Double>();
		t.put("mphasis",new Double(76.5));
		t.put("simplylearn", new Double(87.3));
		t.put("java", new Double(78.2));
		t.put("sortedmap", new Double(73.4));
		Set<?>set= t.entrySet();
		Iterator<?>i=set.iterator();
		while(i.hasNext()) {
			@SuppressWarnings("rawtypes")
		Map.Entry me = (Map.Entry)i.next();
		System.out.print(me.getKey()+":");
		System.out.println(me.getValue());
		}
		System.out.println();
		double percentage = ((Double)t.get("simplylearn")).doubleValue();
		t.put("implylearn",new Double(percentage));
		System.out.println("My new balance:"+t.get("smplylearn"));
		
	}

}
