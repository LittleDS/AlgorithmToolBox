
public class QuickSort {
	public void quickSort(int arr[], int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1) {
			quickSort(arr, left, index - 1);			
		}
		if (index < right) {
			quickSort(arr, index, right);
		}
	}
	
	public int partition(int arr[], int left, int right) {
		int pivot = arr[(left + right) / 2];
		while (left <= right) {
			//Find element on left that should be on right
			while (arr[left] < pivot) left++;
			
			//Find element on right that should be on left
			while (arr[right] > pivot) right--;
			
			//Swap elements, and move left and right indcies
			if (left <= right) {
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		return left;
	}
	
	public void swap(int arr[], int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
