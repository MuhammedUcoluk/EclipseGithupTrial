package day30_MutableımmutableDateTime;

import java.util.ArrayList;
import java.util.List;

public class C01_Immutable {

	public static void main(String[] args) {
		// String ımmutable bir class iken. List mutable dir.
		
		String str="Ali";
		
		str.toUpperCase(); //str==> "ALİ"
		
		System.out.println(str); //"Ali"
		
		System.out.println(str.toUpperCase()); //"ALİ"
		
		System.out.println(str); //Ali
		
		List<String> isimler =new ArrayList<>();
		
		System.out.println(isimler); //[]
		
		isimler.add("Ali");
		
		System.out.println(isimler); //[Ali]
		
		isimler.set(0, "Veli");
		
		System.out.println(isimler); //[Veli]
		
		isimler.remove(0);
		
		System.out.println(isimler); //[]
		

		
		
		

	}

	
}
