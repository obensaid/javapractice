package day02;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {

		// Kullanıcıdan 1 harf alalım ve bunun büyük harf, küçük harf yada hatalı giriş şeklinde kod yazalım
//		
//		if (ch >= 'a' && ch<='z') {
//			
//			System.out.println("Küçük harf");
//			
//		}else if (ch>='A' && ch<='Z') {
//			System.out.println("Büyük harf");
//		}else {
//			System.out.println("Hatalı giriş yaptınız.");
//		}
//		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lüften bir sayi giriniz");
		 char sy = sc.next().charAt(0);
		 String result = sy >= 'a'&&sy<='z' ? "kucukharf": sy>= 'A'&&sy<='Z' ? "buyuk harf":"hatali giris";
		 System.out.println(result);
	
		 sc.close();
		 
	}

}
