public class LinearSearch {
	static int linearSearch(int a[], int n, int val) {
		for(int i = 0;i<n;i++)
		{
			if(a[i]==val)
				return i+1;
		}
		return 1;
	}
	public static void main(String args[]) {
		int a[] =  {55, 29, 10, 40, 57, 41, 20, 24, 45};
		int val = 10;
		int n =a.length;
		int res = linearSearch(a,n,val);
		System.out.println();
		System.out.print("The elements of the array are-");
		for(int i=0;i<n;i++)
			System.out.print(" "+a[i]);
		System.out.println();
		System.out.println("Element to be searched is-"+val);
		if(res==-1)
			System.out.println("Element is not present in the array");
		else
			System.out.println("Element is present at " + res + "position of array");
	}
}