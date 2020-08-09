package day10;

import java.util.ArrayList;

public class ListToArray02 {

	public static void main(String[] args) {
		//ArrayList i Array e ceviren java kodu yaziniz
		//"Python", "JAVA", "PHP",  "Perl", "C#", "C++"
		
		ArrayList <String> list = new ArrayList<String>();
		list.add("Python");	
		list.add("JAVA");
		list.add("PHP");
		list.add("Perl");
		list.add("C#");
		list.add("C++");
		String [] arr =new String[list.size()];
		list.toArray(arr);
		for (String str : arr) {
			System.out.println(str);
			
		}

	}

}