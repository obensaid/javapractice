package day06;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		// Saat ve dakika girildiginde saniye retun eden java methodu yazalim.
		
		// 1 saat = 3600 sn
		//1 dakika = 60 sn 
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen saat giriniz");
		int saat = input.nextInt();
		System.out.println("Lutfen dakika giriniz");
		int dakika = input.nextInt();
		
		System.out.println("Girilen saat ve dakika: " + saniyeDonusturucu(saat,dakika) +" saniyedir.");

	}
	public static int  saniyeDonusturucu (int saat, int dakika) {
		
		int saniye = (saat*3600)+(dakika*60);
		return saniye;
	}
	

}