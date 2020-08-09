package day06;

import java.util.Scanner;

public class Qustion09 {

	public static void main(String[] args) {
		// Kullanıcı 0 sayisi girene kadar girdigi sayilari toplayalim.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz");
		
		int num = input.nextInt();
		int toplam=0;
		
		do {
			System.out.println("Tekrar sayi giriniz.");
			toplam +=num;
			System.out.println("Girilen sayilarin toplami: " + toplam);
			num =input.nextInt();
			
		}while (num!=0);
		
		System.out.println("Genel Toplam: " + toplam);
		
		
		

	}

}
