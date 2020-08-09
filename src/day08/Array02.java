package day08;

import java.util.Arrays;
import java.util.Scanner;

import day04.For01;

public class Array02 {

	public static void main(String[] args) {
		// Girilen ifadeyi Array kullanarak tersini yazdiralim.
		//Deneme emeneD
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen bir ifade giriniz");
		String ifade = input.next();
		char [] arr =ifade.toCharArray();
		
		String tersi="";
		for (int i =arr.length-1; i >=0; i--) {
			tersi +=arr[i];
			
			
		}
		System.out.println("Girilen ifadenin ters yazilimi: "+tersi);
	
	
	int[] numArr = {1,2,3,4,5,6,7,8};
	System.out.println(Arrays.toString(numArr));
	for(int i=0;i<numArr.length/2;i++) {
		int temp=numArr[i];
		numArr[i]=numArr[numArr.length-i-1];
		numArr[numArr.length-i-1]=temp;
	}
	System.out.println(Arrays.toString(numArr));
}
}