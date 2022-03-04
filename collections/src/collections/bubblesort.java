package collections;

public class bubblesort {
	static void bubbleSort(int[] arr) {
		int n =arr.length;
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-1);j++) {
				if(arr[j-1]>arr[j]) {
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
public static void main(String[] args) {
	int arr[]= {289, 39, 48, 6, 28, 1, 2, 33};
	System.out.println("Array before bubble sort");
	for(int j =0;j<arr.length;j++) {
		System.out.print(arr[j]+"");
	}
	System.out.println();
	bubbleSort(arr);
	System.out.println("Array after bubble sort");
	for(int j=0;j<arr.length;j++) {
		System.out.print(arr[j]+"");
	}
}
}
