package day25_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("unused")
public class C05_List {

	public static void main(String[] args) {
		// Verilen bir listede. İçinde belirli bir harf olan elemanları 
		// silen bir method yazınız.
		
		List<String> str=new ArrayList<>();
		str.add("Ceyhun");
		str.add("Yıldız");
		str.add("Mustafa");
		str.add("Tugba");
		str.add("Turgat");
		System.out.println(str); //[Ceyhun, Yıldız, Mustafa, Tugba, Turgut]

		String silinecekharf="a";
		
		str=silinmisstr(str,silinecekharf); // BURAYI ANLAMADIM. NEDEN STR A EŞİTLEDİ?????
		
	
		
	}

	public static List<String> silinmisstr(List<String> str, String silinecekharf) {
		
		for (int i = 0; i < str.size(); i++) {
			if (str.get(i).contains(silinecekharf)) {
				str.remove(i);
				i--; // ( BUNUN SEBEBİ SİLDİKTEN SONRA LİSTENİN İNDEXİ 1 KAYDI. MUSTAFA SİLİNDİ TUĞBA İNDEX 2 YE KAYDI VE İ ++ OLDUĞUNDAN
				// TUĞBA ARADA KAYNADI. BU DURUMUN ÖNÜNE GEÇMEK İÇİN SİLDİKTEN SONRA İNDEXİ 1 AZALTARAK SİLDİĞİ İNDEXİ TEKRAR KONTROL
				// ETMESİNİ SAĞLADIK!!!!!!!!.)
			}
		}
			
		System.out.println(str); // [Ceyhun, Yıldız]
		
		
		return str;
	}

}
