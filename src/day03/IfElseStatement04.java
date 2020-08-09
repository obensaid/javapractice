package day03;

import java.util.Scanner;

public class IfElseStatement04 {

	public static void main(String[] args) {

		//kullanicidan meslegini istyelim
		//meslegi qa = ==>Quality Analyst
		//		  dev= ==>Developer
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen mesleginizi giriniz");
		String ms = scan.nextLine();
		
		if (ms.equalsIgnoreCase("qa")) {
			System.out.println("Mesleginiz  : Quality Analyst");	
		}else if (ms.equalsIgnoreCase("dev")) {
			System.out.println("Mesleginiz  : Developer");	
		}else  if (ms.equalsIgnoreCase("ba")) {
			System.out.println("Mesleginiz  : business Analyst");	
		}else if (ms.equalsIgnoreCase("pm")) {
			System.out.println("Mesleginiz  : Project Manager");	
		}else {
			System.out.println("hic bir kritere uymamaktadir");	
		}
		scan.close();
	}

}
