package datastruct;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class InsertionSort {
	
	
	public static int[] sort(int[] basket) {
		
		for (int i=0;i<=basket.length-1;i++) {
			int current=basket[i];
			int j=i-1;
			j=i-1;
			while (j>=0 && basket[j]>current) {
				basket[j+1]=basket[j];
				j--;
			}
			basket[j+1]=current;
		}
	
		
		return basket;
		
	}
//	public static void main(String[] args) {
//		int[] basket= {10,9,8,7,6,5};
//		//int[] sbasket={5,6,7,8,9,10};
//		int[] b=sort(basket);
//		System.out.println("list = " + Arrays.toString(b));
//	}

}
