package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ArrayList {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// list oluşturalım...
		
		List<String> isimList = new ArrayList<>();
		
		List<String> isimList2 = new ArrayList<String>();
		// bazen eşitliğin sağ tarafındaki elmas içine data türü yazılmazsa sorun çıkabiliyor!!!
		// Ama genelde sorun çıkmaz bizde list oluşturuken sağ tarafta data türü yazmayız.
		
		//List<String> isimList3 = new List<>();
		// Java bunu kabul etmez. List eşitliğin sağ tarafında List<>(); yazamayız.
		// Scanner scandeki gibi değil KARIŞTIRMA!!!
		
		List<Integer> sayılar = new ArrayList<>(); 
		// list data türü olarak primitive leri kabul etmez. o yüzden soldaki diomand a Int değil integer yazdık.
		
		
		List<Boolean> cevaplar = new ArrayList<>();
		
		
		
		
		
		
	}

}
