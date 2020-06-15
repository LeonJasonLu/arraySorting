package arraySorting;
import java.util.Arrays;
public class selectionSortDemo {

	static int[] a = {2,8,9,6,3,4,0,7,5,1};
	
	public static void main(String[] args) {
		selectionSort(a);
		System.out.print(Arrays.toString(a));

	}
	
	public static void selectionSort(int[] a) {
		for(int i = a.length-1; i >= 1 ; i--) {
			int maxIndex = 0;
			for(int j = 1; j <= i; j++) {
				if(a[j] > a[maxIndex]) {
					maxIndex = j;
				}
			}
			swap(a, maxIndex, i);
		}
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
