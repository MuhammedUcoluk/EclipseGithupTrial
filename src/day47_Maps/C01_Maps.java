package day47_Maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		// 1 - Bir map oluşturmadan önce mapa koyacağımız key ve value değerlerini incelemeliyiz.
		//Tüm değerleri koyabilmek için key ve value için object, objeckt seçebiliriz.
		// Ama bu durumda map içindeki elemanlara ait bilgilere ulaşmada zorlanabiliriz.
		// Data türünü seçerken hem içine koyacağımız tüm elemanları kapsayacak bir data türü seçmeliyiz
		// Hem de içine koyduğumuz tüm elemanları işleyebilecek şekilde basit data türü seçmeliyiz.
		
		// 2- Mapi oluştururken mapin türüne de karar vemeliyiz.
		
		Map<Integer , String> sınıf = new HashMap<>();
		
		sınıf.put(101, "Ali , Can , J.Dev ");
		sınıf.put(102, "Veli, Yan , QA");
		sınıf.put(103, "Ali, Yan , C#");
		
		int no =104;
		String isim="Ayşe";
		String soyisim = "Can";
		String brans="QA";
		
		sınıf.put(no, isim + ", "+ soyisim + ", " + brans);
		
		System.out.println(sınıf);
		//{    				 101=Ali , Can , J.Dev , 102=Veli, Yan , QA, 103=Ali, Yan , C#, 104=Ayşe, Can, QA}
		//map parantezi		 Key1=Value1			 Key2=Value2			 Key3=Value3	Key4=Value4
		
		//Nosu 102 olan öğrencinin bilgilerini görelim.
		System.out.println(sınıf.get(102)); //Veli, Yan , QA
		
		//104
		System.out.println(sınıf.get(104)); //Ayşe, Can, QA
		
		//Mapteki tüm keyleri görelim derseniz.
		
		System.out.println(sınıf.keySet()); //[101, 102, 103, 104] bir set olarak key değerlerini döndürür.

		//Mapteki tüm valueleri görelim.
		
		System.out.println(sınıf.values());//[Ali , Can , J.Dev , Veli, Yan , QA, Ali, Yan , C#, Ayşe, Can, QA] collection olarak getirir.
		//Ancak yazdırma işlemi dışında birşey yapamayız. O sebeple.
		//Sınıftaki öğrencilerin isimlerini bir listeye ekleyip yazdıralım.
		
		List<String> valueList= new ArrayList<>((sınıf.values()));	
		
		System.out.println(valueList); //[Ali , Can , J.Dev , Veli, Yan , QA, Ali, Yan , C#, Ayşe, Can, QA]
		System.out.println(valueList.size()); // 4 döndürür. 
		
		List<String> isimListesi=new ArrayList<>();
		String bilgiler[]=new String[3];
		
		for (int i = 0; i < valueList.size(); i++) {
			
			bilgiler=valueList.get(i).split(",");
			isimListesi.add(bilgiler[0]);
			
		}
		System.out.println(isimListesi); //[Ali , Veli, Ali, Ayşe]
	}

}
