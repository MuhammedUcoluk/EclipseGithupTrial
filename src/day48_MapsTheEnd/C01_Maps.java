package day48_MapsTheEnd;

import java.util.HashMap;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		// Verilen bir Stringteki harfleri
		//ve harflerin kaçar kez kullanıldığını return eden bir method yazınız
		//Ör: ; input:Hellooo output: H=1 E=1 L=2 O=3
		
		String input="Hellooo";
		
		Map<String,Integer> mainMap=harfsay(input);
		System.out.println(mainMap);
	}

	private static Map<String,Integer> harfsay(String input) {
		
		Map<String,Integer> harfSayılarıMap=new HashMap<>();
		String inputArr[]=input.split("");//[H, e, l ,l, o, o, o]
		
		for (String each : inputArr) {
			if (!harfSayılarıMap.containsKey(each)) {
				harfSayılarıMap.put(each, 1);
			} else {
				//harfSayılarıMap.get(each)+1 bu girilen sayıların valuesini bulup 1 artırır.
				harfSayılarıMap.put(each, harfSayılarıMap.get(each)+1);
			}
			
		}
		
		return harfSayılarıMap;
		
	}

}
