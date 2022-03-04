import java.util.Arrays;
public class BinarySearch {
	public static void main(String args[]) {
		int numArray[] = {5, 10, 15, 20, 25, 30, 35};
		System.out.println("The input array:" + Arrays.toString(numArray));
		int key = 25;
		System.out.println("\n Key to be searched=" + key);
		//set first to first index
		int first = 0;
		//set last to last elements in array
		int last = numArray.length-1;
		//calculate mid of the array
		int mid = (first+last)/2;
		//when first and last donot overlap
		while(first <=last) {
			if(numArray[mid] < key) {
				first = mid+1;
			}
			else if(numArray[mid] == key){
				System.out.println("Element is found at index: " +mid);
				break;
			}
			else {
				last = mid-1;
			}
			mid = (first+ last)/2;
		}
		//if the first and last overlap, then key is not present in the array
		if(first>last) {
			System.out.println("Element is not found");
		}
	}
}