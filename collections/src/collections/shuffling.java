package collections;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class shuffling {
	public static void main(String[] args) {
		Integer[] intA= {10, 20,30,40,50,60,70,80,90,100};
		List<Integer>intL= Arrays.asList(intA);
		Collections.shuffle(intL);
		intL.toArray(intA);
		System.out.println(Arrays.toString(intA));
	}

}
