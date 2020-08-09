package day05;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {

		// Girilecek olan email adresinin kurallara uygun olup olmadigini kontrol edelim.
        
        // onkisim @ sonkisim . 
        // " " 
        //getEmailDogrulama(String email)
        
        //return type => boolean
		
		// Girilecek olan email adresinin kurallara uygun olup olmadigini kontrol edelim.
		
				// onkisim @ sonkisim .  a@b.c
				// " " 
				//getEmailDogrulama(String email)
				
				//return type => boolean
				
				Scanner input = new Scanner(System.in);
				System.out.println("Lutfen email adresinizi giriniz");
				String email = input.nextLine();
				
				System.out.println("Email: " + getEmailDogrulama(email));
			}
			public static boolean getEmailDogrulama(String email) {
				
				if(!email.contains("@")) {
					return false;
				}if(email.length()<=4) {
					return false;
				}if(email.contains(" ")) {
					return false;
				}
				if(!email.contains(".")) {
					return false;
					
				}
				String [] arr=email.split("@"); //abc@c@.com  arr[0]="abc"  arr[1]="c" arr[2]=.com
				if(arr[0].length()<1) {
					return false;
				}if (arr[1].length()<3) {
					return false;
				}if(arr.length>2) {
					return false;
				}
				
				
				
				return true;

		
	}

}
