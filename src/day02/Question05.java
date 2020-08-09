package day02;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {

		// Kullanıcıdan  yaşını ve kilosunu alalım
		// 18 yaşından küçük ise kan bağışı yapamaz
		// 18 yaşından büyük ve 50 kilo dan hafif ise kan bağışı yapamaz.
		// 18 yaşından büyük ve 50 kilodan ağır ise kan bağışı yapabilir.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lüften yaşınızı giriniz");
		 int yas = sc.nextInt();
		 System.out.println("Lütfen kilonuzu giriniz");
		 int kilo = sc.nextInt();
//		 
//		 if (yas>18) {
//			 		 
//			 System.out.println("Lütfen kilonuzu giriniz");
//			 int kilo = sc.nextInt();
//			 if (kilo>50) {
//			 System.out.println("Kan verebilirsiniz.");
//			 }else {
//			 System.out.println("50 kilodan hafifler kan bağışı yapamaz.");
//		 }
//	 }else {
//			 System.out.println("18 yaşından küçükler kan bağışı yapamaz.");
//		 }
	
//		 
		 String result = yas>18 ? kilo>50 ? "Kan bağışı yapabilir":"50 kilodan hafifler kan bağışı yapamaz."
			 :"18 yaşından küçükler kan bağışı yapamaz."; 
		 System.out.println(result);

		 sc.close();
	}
}

