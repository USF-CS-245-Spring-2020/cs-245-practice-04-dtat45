/**
 * A class that sorts a given array by using a pivot and partitioning 
 * the array around the chosen pivot.
 * @author Dan Tat
 *
 */

public class QuickSort implements SortingAlgorithm {

	public void sort(int[] a) {
		
		quickSort(a,0,a.length-1);
	}
	
	// Sorts the array or given sub-array from index 'start' to index 'end'	
	public void quickSort(int[] a,int start,int end) { 
		
		if(start<end) {
			int pivot=partition(a,start,end);
			quickSort(a,start,pivot-1);
			quickSort(a,pivot+1,end);
		}
	} // quickSort
	
	/* Moves the 'pivot' element to the correct index and
	   moves smaller elements to the left of the 'pivot'
	   and larger elements to the right of the 'pivot' */
	public int partition(int[] a,int start,int end) {
		
		int pivot=start;
		int right=end;
		
		for(int i=end;i>start;i--) {
			// Checks if the current element is bigger than the pivot
			if(a[i]>a[pivot]) {
				swap(a,i,right);
				right--;
			}
		}
		swap(a,right,pivot);
		
		// Returns index of 'pivot'
		return right; 
	} // partition
	
	// Swaps the elements of the two given indices
	public void swap(int[] a,int i,int j) {
		
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	} // swap
}
