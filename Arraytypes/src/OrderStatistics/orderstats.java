package OrderStatistics;
import java.util.Arrays;
import java.util.Random;
public class orderstats {
	private orderstats() {}
	public static int randomizedSelect(int[] array, int order) {
		checkOrder(order, array);
		Random random = new Random();
		return randomizedSelect(array, 0, array.length-1, order+1,random);
	}
	private static void checkOrder(int order, int[] array) {
		if(order < 0) {
			throw new IndexOutOfBoundsException("Negative order:"+order);
		}
		if(order >= array.length) {
			throw new IndexOutOfBoundsException(
					"Order is too large("+order+"). Must be at most"+(array.length-1)+".");
		}
	}
	private static int randomizedSelect(int[] array, int startIndex, int endIndex, int order, Random random){
		if(startIndex == endIndex) {
			return array[startIndex];
		}
		int pivotIndex = randomizedPartition(array, startIndex, endIndex, random);
		int k = pivotIndex - startIndex+1;
		if(order == k) {
			return array[pivotIndex];
		}else if(order < k) {
			return randomizedSelect(array, startIndex, pivotIndex-1, order, random);
		}else {
			return randomizedSelect(array, pivotIndex+1,endIndex,order-k,random);
		}
	}
	private static int randomizedPartition(int[] array, int startIndex, int endIndex, Random random) {
		int rangeLength = endIndex - startIndex+1;
		int i = startIndex+random.nextInt(rangeLength);
		swap(array, endIndex, i);
		return partition(array, startIndex, endIndex);
	}
	private static int partition(int[] array, int startIndex, int endIndex) {
		int pivot = array[endIndex];
		int i = startIndex-1;
		for(int j=startIndex;j<endIndex;++j) {
			if(array[j]<=pivot) {
				i++;
				swap(array,i,j);
			}
		}
		swap(array,i+1,endIndex);
		return i+1;
	}
	private static void swap(int[] array, int i, int j) {
		int tmp=array[i];
		array[i]=array[j];
		array[j]=tmp;
	}
}
class Demo{
	private static final int WARMUP_LENGTH = 100_000;
	private static final int WARMUP_ITERATIONS = 500;
	private static final int ARRAY_LENGTH = 50_000_000;
	
	public static void main(String[] args) {
		long seed = System.currentTimeMillis();
		Random random = new Random(seed);
		
		warmup(random);
		int[] array = getRandomIntArray(ARRAY_LENGTH,random);
		System.out.println("Seed = "+seed);
		
		long startTime = System.currentTimeMillis();
		int median1 = orderstats.randomizedSelect(array,  ARRAY_LENGTH/2);
		long endTime = System.currentTimeMillis();
		
		System.out.println("orderstats.randomizedSelect() in"+(endTime-startTime)+"milliseconds.");
		startTime = System.currentTimeMillis();
		Arrays.sort(array);
		int median2 = array[ARRAY_LENGTH/2];
		endTime = System.currentTimeMillis();
		
		System.out.println("Selection via sorting in"+(endTime-startTime)+"milliseconds.");
		if(median1 != median2) {
			System.err.println("Algorithms disagree:"+ median1 + "vs" + median2);
		}else {
			System.out.println("Algorithmsagree:"+median1);
		}
	}
	private static void warmup(Random random) {
		System.out.println("Warming up..");
		
		for(int iteration = 0; iteration < WARMUP_ITERATIONS; ++iteration) {
			int[] array = getRandomIntArray(WARMUP_LENGTH, random);
			orderstats.randomizedSelect(array,  random.nextInt(WARMUP_LENGTH));
			Arrays.sort(array);
		}
		System.out.println("Warming up done!");
	}
	private static int[] getRandomIntArray(int length, Random random) {
		int[] array = new int[length];
		for(int i=0;i<array.length;++i) {
			array[i]=random.nextInt(1_000_000);
		}
		return array;
	}
}