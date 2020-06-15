package arraySorting;

import java.util.Arrays;

public class bubbleSortDemo {
	static int[] a = {2,8,9,6,3,4,0,7,5,1};
	public static void main(String[] args) {
		bubbleSort(a);
		System.out.print(Arrays.toString(a));

	}
	public static void bubbleSort(int[] a) {
		for(int i = a.length - 1; i > 0; i--) {
			boolean flag = false;//增進效能用
			for(int j = 0; j < i; j++) {
				if(a[j] > a[j+1]) {
					swap(a, j, j+1);
					flag = true;//增進效能用
				}
			}
			if(flag ==false)break;//增進效能用
		}
	}
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
