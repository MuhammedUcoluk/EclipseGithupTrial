package day25_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_Sort {

	public static void main(String[] args) {
		
		List<String> isimler=new ArrayList<>();
		
		isimler.add("Kutlu");
		isimler.add("Emrah");
		isimler.add("Ferhat");
		
		System.out.println(isimler); // [Kutlu, Emrah, Ferhat]

		Collections.sort(isimler);
		System.out.println(isimler); // [Emrah, Ferhat, Kutlu] Alfabetik sıralama yaptı. Buna NATURAL ORDER diyoruz. 
		
		isimler.add("filiz");
		System.out.println(isimler);//[Emrah, Ferhat, Kutlu, filiz]
		
		Collections.sort(isimler);// filiz küçük harfle başladığı için sıraladık ama sonda kaldı.
		System.out.println(isimler); // [Emrah, Ferhat, Kutlu, filiz]
	}

}
