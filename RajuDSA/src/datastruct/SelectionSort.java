package datastruct;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class SelectionSort {
	
	
	public static int[] sort(int[] basket) {
		
		for (int i=0;i<=basket.length-2;i++) {
			int minIndex=i;
			for (int j=i+1;j<=basket.length-1;j++) {
				if (basket[j]<basket[minIndex]) {
					minIndex=j;
					
				}
			int temp=basket[i];
			basket[i]=basket[minIndex];
			basket[minIndex]=temp;	
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
