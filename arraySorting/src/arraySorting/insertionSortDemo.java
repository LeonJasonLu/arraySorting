package arraySorting;
import java.util.Arrays;
public class insertionSortDemo {
	static int[] a = {2,8,9,6,3,4,0,7,5,1};

	public static void main(String[] args) {
		insertionSort(a);
		System.out.println(Arrays.toString(a));

	}
	
	public static void insertionSort(int[] a) {
		for(int i =1; i < a.length-1; i++) {
			int temp = a[i];
			int j = 0;
			for(j = i-1; j >= 0 && temp < a[j]; j--) {
				a[j+1] = a[j];
			}
			a[j+1] = temp;
		}
	}

}
