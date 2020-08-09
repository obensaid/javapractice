package day08;

public class Array03Bska {

	public static void main(String[] args) {
		// Bir int Array içerisinde  aradigimiz sayiyi kontrol edelim.
		//[12,32,34,54,45] 
		int [] sayilar = {12,32,34,54,45};
		System.out.println(getVarmi(sayilar));
		
		
	}
	public static boolean getVarmi(int []sayilar) {
		for (int i = 0; i < sayilar.length; i++) {
			if(String.valueOf(sayilar[i]).contains("2")) 
				return true;
			
		}	
			
			return false;

	}

	}