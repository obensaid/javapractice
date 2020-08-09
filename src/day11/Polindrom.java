package day11;

import java.util.Scanner;

public class Polindrom {

	public static void main(String[] args) {
		/*
		 * Bir palindrom, madam veya racecar veya 10801 sayısı gibi ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.
			Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.
			madam  1234321
		 */
		Scanner input =new Scanner(System.in);
		System.out.println("Lütfen polindrom için değer giriniz.");
		String str =input.nextLine().toLowerCase().replace(" ",""); //ali
		
		int count =str.length()-1;//2
		
		String tersi="";
		
		for(;count>=0;count--) {
			tersi =tersi+str.charAt(count);//ila
		}
		
		
		
		if (tersi.equals(str)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}


}
