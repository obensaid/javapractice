package day02;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		
		// Kullanıcıdan 5 basamaklı sayı alalım,  ilk 2 ve son 2 basamaklarındaki sayıların 
		// sayı değerlerini toplayalım 
		
		// 12345
		//12 1+2
		//45 4+5
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lütfen 5 basamaklı sayı giriniz");
		
		int num = sc.nextInt(); //12345 
		
		int ilkIki  = num/1000; //12
		
		int sonIki = num%100; //45
		
		int iklIkiTop = (ilkIki%10)+ (ilkIki/10);
		
		int sonIkiTop = (sonIki %10) + (sonIki/10);
		
		
		System.out.println("Sayıların toplamı: " +(iklIkiTop + sonIkiTop));
		sc.close();	
	}
	
}
		
		

		

