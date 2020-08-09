package day06;

public class Question05 {

	public static void main(String[] args) {
		// Girilen sayisi rakamlari toplamini return eden bir method yazalim.
		
		// 123 1+2+3=6
		
		System.out.println("Sayinin rakamlari toplami: " +rakamlarToplami(65757));

	}
	public static int rakamlarToplami(int sayi) {
		
		int toplam=0;
		int birlerbasamagi=0;
		
		while(sayi>0) {
			birlerbasamagi = sayi%10;
			toplam +=birlerbasamagi;
			sayi=sayi/10;
					
		}
		return toplam;
	}

}



