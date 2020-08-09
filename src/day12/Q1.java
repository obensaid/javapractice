package day12;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
//Kullanicidan 1 sayi alalim ve o sayi kadar arda arda gelen fibonacci sayi dizisini yazdiralim.
		//girilen sayi: 10 ==>> 0 1 1 2 3 5 8 13 21 34
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen fibonacci sayisi giriniz");
		int sayi =input.nextInt();
		
		int sayi1=0;
		int sayi2=1;
		int ikiSayininToplami=0;
		System.out.print(sayi1 + " " + sayi2);
		
		for (int i = 2; i <sayi; ++i) {
			ikiSayininToplami = sayi1 + sayi2; // 3 =  1 + 2
			sayi1=sayi2; //2 
			sayi2=ikiSayininToplami; // 3
			System.out.print(" " + ikiSayininToplami); // 0 1 1 2 3
			
			
		}
		
input.close();
	}

}