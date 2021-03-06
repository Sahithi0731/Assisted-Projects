package rangequeries;
public class rangequeries {
	static void findProduct(long[] arr, int[] lower,int[] upper)
	{
		int n = arr.length;
		long[] preProd = new long[n];
		int[] countZeros = new int[n];
		long prod = 1;
		int count = 0;
		for(int i =0; i<n;i++) {
			if(arr[i]==0)
				count++;
			else
				prod *= arr[i];
			preProd[i]=prod;
			countZeros[i]=count;
		}
		for(int i =0;i<lower.length;i++) {
			int l = lower[i];
			int u = upper[i];
			if(l==1)
			{
				if(countZeros[u-1]==0)
					System.out.println(preProd[u-1]);
				else
					System.out.println(0);
			}
			else {
				if(countZeros[u-1]-countZeros[l-2]==0)
					System.out.println(preProd[u-1]/preProd[l-2]);
				else
					System.out.println(0);
			}
		}
	}
	public static void main(String[] args)
	{
		long[] arr = new long[] {0,2,3,4,5};
		int[] lower = {1,2};
		int[] upper = {3,2};
		findProduct(arr,lower,upper);
		}
	}
