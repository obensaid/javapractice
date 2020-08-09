package day02;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		
		// kullanıcıdan 2 tam sayı alalım ve dört işlem sonucunu yazdıralım.
		
		
		// kullanıcıdan 2 tam sayı alalım ve dört işlem sonucunu yazdıralım.
		
		Scanner  sc =new Scanner (System.in);
		
		System.out.println("Lütfen 1. sayıyı giriniz");
		
		double num1 = sc.nextDouble();
		
		System.out.println("Lütfen 2. sayıyı giriniz");
		double num2 = sc.nextDouble();
		
		System.out.println("Toplam: " + (num1+num2));
		System.out.println("Fark: " + (num1-num2));
		System.out.println("Çarpım: " +(num1*num2));
		System.out.println("Bölüm: " + (num1/num2));
        
		sc.close();
		
	
}
}
