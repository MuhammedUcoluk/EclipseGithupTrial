package day48_MapsTheEnd;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {
		// Verilen map’te istenen programlama dilini bilen kisileri list olarak donduren bir method yaziniz.
		//map➔ { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		//Istenen dil ➔ java
		//Sonuc ➔ [Ali, Veli]
		Map<Integer,String> soruMap=MapOlustur.myMap();
		String istenenDil="Java";
		
		
		System.out.println(dilBilenListesiOlustur(soruMap,istenenDil));//Sonuc ➔ [Ali, Veli]

	}

	private static List<String> dilBilenListesiOlustur(Map<Integer, String> soruMap, String istenenDil) {
		
		List<String>dilBilenListesi=new ArrayList<>();
		//map➔ { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
				//Istenen dil ➔ java
		
		//soruMap.values();//bana collection döndürüyor.
		
		List<String>valueList=new ArrayList<>(soruMap.values());
		//System.out.println(soruMap.values());//[Ali,Can,java, Veli,Yan,java, Ali,Yan,C#] ==>Eleman sayısı 3
		//Bu 3 elemanı tek tek ele alıp split ile bölüp dil değeri java olanların isim değerlerini 
		//dilBilenListesi ne ekleyeceğim.
		
		String parcalıArray[]=new String[3];
		
		for (String each : valueList) {
			parcalıArray=each.split(",");//[Ali,Can,java] şeklinde 3 elemanlı array getirecek.
			
			if (parcalıArray[2].equalsIgnoreCase(istenenDil)) {
				
				dilBilenListesi.add(parcalıArray[0]);
				
				
			} else {

			}
			
		}
		
		return dilBilenListesi;
	}

}
