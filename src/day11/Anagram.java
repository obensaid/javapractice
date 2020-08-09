package day11;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * Anagram, bir kelimenin harflerinden başka bir kelime oluşturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen  Java kodunu yazınız.
			isAnagram("listen", "Silent") ==> true
		 */
		Scanner input =new Scanner(System.in);
		System.out.println("Lütfen Anagram için 1. değeri giriniz.");
		String str1 =input.nextLine().toLowerCase().replace(" ","");
		System.out.println("Lütfen Anagram için 2. değeri giriniz.");
		String str2 =input.nextLine().toLowerCase().replace(" ","");
		
		System.out.println(isAnagram(str1, str2));
		
	}
		public static boolean isAnagram(String str1,String str2) {
		
		//boolean isAnagram =false;
		char [] arr1 = str1.replace(" ", "").toLowerCase().toCharArray();
		char [] arr2 = str2.replace(" ", "").toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(arr1);
		System.out.println(arr2);
		
		if(str1.length()!=str2.length()) {
			return false;
	
		}
		for (int i = 0; i < arr2.length; i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
			
				
			
		}
		return true;

	}

}