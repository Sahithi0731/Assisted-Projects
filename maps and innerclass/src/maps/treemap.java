package maps;
import java.util.*;
public class treemap {
	public static void main(String[] args) {
		Map<String, Integer>map=new TreeMap<>();
		map.put("mphasis",10);
		map.put("simplylearn", 30);
		map.put("java", 20);
		
		for(Map.Entry<String, Integer>e:map.entrySet())
			System.out.println(e.getKey()+""+e.getValue());
	}

}
