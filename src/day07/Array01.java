package day07;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		// 3 elemanlı String array olusturalim
		// clever,meek,nice
		//tek tek ve liste halinde yazdiralim.
		// herbir array elemanina "ly" ekleyelim.
		
		String [] arr = new String [3];
		arr[0]="clever";
		arr[1]="meek";
		arr[2]="nice";
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
			
		}
		System.out.println();
		for (String w : arr) {
			System.out.print(w + " ");
			
		}
		System.out.println();
		String arr1[] = {"clever","meek","nice"};
		
		String ek = "ly";
		for (int i = 0; i < arr1.length; i++) {
			//System.out.print(arr1[i].concat(ek)+ " ");
			
			System.out.print(arr1[i]+ ek +" ");
			
		}
		
		

	}

}
