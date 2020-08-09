package day11;

import java.util.Scanner;

public class Sayi_Okutma {

	public static void main(String[] args) {
		// 444 02 34  sayinin rakamsal okunusunu yazan kodu yazalim.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen telefon numaranizi giriniz");
		String sayi = input.nextLine().replace(" ", ""); //4442234
		
		for (int i = 0; i < sayi.length(); i++) {
			int birler = new Integer (sayi.substring(i,i+1));
			switch (birler) {
			case 0: System.out.print("sifir "); break;
			case 1: System.out.print("bir "); break;
			case 2: System.out.print("iki "); break;
			case 3: System.out.print("uc "); break;
			case 4: System.out.print("dort "); break;
			case 5: System.out.print("bes "); break;
			case 6: System.out.print("alti "); break;
			case 7: System.out.print("yedi "); break;
			case 8: System.out.print("sekiz "); break;
			case 9: System.out.print("dokuz "); break;
			default: break;
			
			}
			
		}
		
		
	}

}