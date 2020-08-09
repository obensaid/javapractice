package day04;

import java.util.Scanner;

public class StringMethod02 {

	public static void main(String[] args) {
		//mulakatta muhakkak soruyorlar 
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
		
		Scanner scan = new Scanner(System.in);
	    String str1 = input.nextLine();
	     String str2 = input.nextLine();
	     String a = str1+" "+str2;
		System.out.println(a);
		input.close();

	}

}
