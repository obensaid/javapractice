package day02;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {

//		System.out.println(5 + "Ali"); //5Ali
//		System.out.println( 5+5 + "Ali" +4+3); //10Ali43
//		
//		System.out.println(1==3);//false
//		System.out.println(2==2);//true
		
	//Kullanıcıdan adını ve soyadını alalım ve adının ve soyadının ilk harflerini yazdıralım
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Lütfen adınızı giriniz");
//		
//		char adilk= sc.next().charAt(0);
//		
//		System.out.println("Lütfen soyadınızı giriniz");
//		char soyadilk = sc.next().charAt(0);
//		
//		System.out.println("adınızın ilk harfi: " + adilk  + "\n"  + "soyadınızın ilk harfi: " + soyadilk);
		
		//hasan kara 
		System.out.println("Adınızı ve sayadınızı giriniz."); // hasan kara
		
		String adSoyad = sc.nextLine();
		
		System.out.println("isminizin ilk harfi: " + adSoyad.charAt(0) + "\n" + "soyisminizin ilk harfi: " +
		  adSoyad.charAt(6));
		sc.close();

	}
}