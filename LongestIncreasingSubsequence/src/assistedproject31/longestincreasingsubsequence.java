package assistedproject31;

public class longestincreasingsubsequence {
	static int lis(int arr[], int n)
	{
		int lis[] = new int[n];
		int i, j, max = 0;
		
		//initialize LIS values for all indexes
		for(i=0;i<n;i++)
			lis[i]=1;
		
		//compute optimized LIS values in bottom up manner
		for(i=1;i<n;i++)
			for(j=0;j<i;j++)
				if(arr[i]>arr[j] && lis[i]<lis[j] + 1)
					lis[i] = lis[j] + 1;
		
		//pick maximum of all LIS values
		for(i=0;i<n;i++)
			if(max < lis[i])
				max = lis[i];
		
		return max;
	}
	public static void main(String args[]) {
		int arr[] =  {10, 22, 9, 33, 21, 50, 41, 60, 80};
		int n = 9;
		System.out.println("The length of the longest increasing subsequence is "  + lis(arr, n));
	}
}
