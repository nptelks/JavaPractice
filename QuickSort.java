package training;

public class QuickSort
{
	static int division(int[] arr, int first, int last)
	{
		int pivot = arr[last];
		int i = first ;
		for(int j = first; j<last; j++)
		{
			if(arr[j] < pivot)
			{
				
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp ;
				
				i++ ;
			}
		}
		int temp = arr[i];
		arr[i] = arr[last];
		arr[last] = temp;
		
		return i ;
	}
	
	static void qSort(int[] arr, int first, int last)
	{
		if(first < last)
		{
			int pivot = division(arr, first, last);
			
			qSort(arr, first, pivot-1);
			qSort(arr, pivot+1, last);
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {4, 6, 3, 5, 2};
		int len = arr.length;
		qSort(arr, 0, len-1);
		for(int i=0; i <= len-1; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
