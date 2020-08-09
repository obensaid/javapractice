package day07;

import java.util.Arrays;

public class Array02 {

	public static void main(String[] args) {
		//Array elemanlarinin matematige gore tersini alan bir method yazalim.
		//1,2,-3,4,-5,-6
		//-1,-2,3,-4,5,6
		
		int [] arr = {1,2,-3,4,-5,-6};
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(sayininTersi(arr)));

	}
	public static int[] sayininTersi(int [] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]*=-1;
			
		}
		
		
		
		return arr;
		
	}

}