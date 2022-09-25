package com.te.learnjava8.basic;

class MaxMinHold {
	int max = 0;
	int min = 0;
}
public class MaxAndMinArray {
	public static MaxMinHold findMaxMin(int[] a) {
		int max = 0;
		int min = 9;
		
		for (int i = 0;i < a.length;i++) {
			if(a[i] > max)
				max = a[i];
			if(a[i] < min)
				min = a[i];
			
		}
		MaxMinHold hold = new MaxMinHold();
		hold.max = max;
		hold.min = min;
		return hold;
	}
		public static void main(String[] args) {
			
			int a[] = {2,12,-2,11,23};
			MaxMinHold hold = findMaxMin(a);
			System.out.println("Maximum "+hold.max);
			System.out.println("Minimum "+hold.min);
                  System.out.println("--------------------");
			
	}
	

}
