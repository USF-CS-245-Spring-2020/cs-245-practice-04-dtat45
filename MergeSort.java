
public class MergeSort implements SortingAlgorithm {
	
	public void sort(int[] a) {
		
		if(a.length<2) {
			return;
		}
		// Splits the array into two sub-arrays
		int leftSize=a.length/2;
		int rightSize=a.length-leftSize;
		int[] left=new int[leftSize];
		int[] right=new int[rightSize];
		copyArray(a,left,right);
		
		sort(left);
		sort(right);
		
		mergeSort(a,left,right);
	} // sort
	
	void mergeSort(int[] target,int[] left,int[] right) { // Merges the two smaller arrays into one sorted array
		
		int indexL=0;
		int indexR=0;
		int indexTarget=0;
		
		while(indexL<left.length && indexR<right.length) {
			if(left[indexL]<=right[indexR])
				target[indexTarget++]=left[indexL++];
			else
				target[indexTarget++]=right[indexR++];
		}
		
		while(indexL<left.length)
			target[indexTarget++]=left[indexL++];
		while(indexR<right.length)
			target[indexTarget++]=right[indexR++];
	} // merge sort
	
	void copyArray(int[] a,int[] left,int[] right) { // Copies elements from array 'a' to their respective sub-arrays
		
		for(int i=0;i<left.length;i++)
			left[i]=a[i];
		for(int i=0;i<right.length;i++)
			right[i]=a[i+left.length];
	} // copyArray
}
