package day05;

import java.util.Scanner;

public class StringMethod01 {

	public static void main(String[] args) {
 // Kullanicidan alacagimiz hotmail adresini gmail olarak degistirelim.
        
        //abc@hotmail.com => abc@gmail.com
        
        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen hotmail adresinizi giriniz");
        
        String email = input.next();
        
        if(email.contains("@hotmail")) {
            String gmail=email.replace("@hotmail.com","@gmail.com");
            System.out.println(gmail);
            
        }else {
            System.out.println("Mail adresiniz hotmail icermiyor.");
        }
        
        
      input.close();  
        
    }
}
