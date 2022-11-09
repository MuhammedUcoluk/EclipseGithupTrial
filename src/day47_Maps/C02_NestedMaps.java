package day47_Maps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMaps {

	public static void main(String[] args) {
		// iç içe map oluşturacaksak en içerdekinden başlamanız tavisye olunur.
		
		Map<String,String> ögr1=new HashMap<>();
		ögr1.put("isim", "Ali");
		ögr1.put("Soyisim", "Can");
		ögr1.put("Branş", "J.Dev");
		
		Map<String,String> ögr2=new HashMap<>();
		ögr2.put("isim", "Veli");
		ögr2.put("Soyisim", "Yan");
		ögr2.put("Branş", "QA");
		
		Map<String,String> ögr3=new HashMap<>();
		ögr3.put("isim", "Ali");
		ögr3.put("Soyisim", "Yan");
		ögr3.put("Branş", "C#");
		
		Map<String,String> ögr4=new HashMap<>();
		ögr4.put("isim", "Ayşe");
		ögr4.put("Soyisim", "Can");
		ögr4.put("Branş", "QA");
		
		System.out.println("1. Öğrenci : " + ögr1);
		System.out.println("2. Öğrenci : " + ögr2);
		System.out.println("3. Öğrenci : " + ögr3);
		System.out.println("4. Öğrenci : " + ögr4);
		
		Map<Integer,Map<String,String>> sınıfMap=new HashMap<>();
		
		sınıfMap.put(101, ögr1);
		sınıfMap.put(102, ögr2);
		sınıfMap.put(103, ögr3);
		sınıfMap.put(104, ögr4);
		
		System.out.println(sınıfMap);
		/*{
		101={Soyisim=Can, Branş=J.Dev, isim=Ali}, 
		102={Soyisim=Yan, Branş=QA, isim=Veli}, 
		103={Soyisim=Yan, Branş=C#, isim=Ali}, 
		104={Soyisim=Can, Branş=QA, isim=Ayşe}
		}
												*/
	}

}
