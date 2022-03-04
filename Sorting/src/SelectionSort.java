
public class SelectionSort {
	public void sort(int array[])
	{
		int n = array.length;
		for(int i=0;i<n-1;i++)
		{
			int min_element = i;
			for(int j=i+1;j<n;j++)
				if(array[j]<array[min_element])
					min_element=j;
			int temp = array[min_element];
			array[min_element]=array[i];
			array[i]=temp;
		}
	}
	public void printarray(int array[])
	{
		int n = array.length;
		for(int i=0;i<n;++i)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	//main method
	public static void main(String args[]) {
		SelectionSort ob = new SelectionSort();
		int array[]= {15,10,99,53,36};
		ob.sort(array);
		System.out.println("Sorted array");
		ob.printarray(array);
	}
}