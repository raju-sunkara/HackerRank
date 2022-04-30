package datastruct;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class BubbleSort {
	
	
	public static int[] sort(int[] basket) {
		
		for (int i=0;i<basket.length;i++) {
			for (int j=0;j<basket.length-i-1;j++) {
				if (basket[j]>basket[j+1]) {
					int temp=basket[j];
					basket[j]=basket[j+1];
					basket[j+1]=temp;
				}
			}
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
