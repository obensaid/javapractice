package day10;

import java.util.Scanner;

public class StringBuilder01 {
	
	public static void main(String[] args) {
	// Kullanicidan bir kelime alip tersini yazdiralim.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen metin giriniz");
		
		String str=input.nextLine();
	
		String tersStr="";
		System.out.println(str.length()-1);
		
		for(int count=str.length()-1;count>=0;count--) {
			
			tersStr=tersStr+str.charAt(count);//adana
		}
		System.out.println(str);
		System.out.println(tersStr);
		
		
		StringBuilder stb2 = new StringBuilder(input.nextLine());
		stb2.reverse();
		System.out.println(stb2);

	}

}