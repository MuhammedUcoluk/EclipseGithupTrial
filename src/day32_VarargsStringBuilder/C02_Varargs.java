package day32_VarargsStringBuilder;

public class C02_Varargs {

	public static void main(String[] args) {
		
		
		
		KafanaGöretopla(5,10,13,0);
		
		
		// varargs list gibi davranır ama array methodları ile çalışır.
	}

	private static void KafanaGöretopla(int sayı1, int ...sayılar ) {
										//5           // 10,13,0
		
		int toplam=0;
		for (int each : sayılar ) {
			toplam+=each;
		
		
		
		}
		System.out.println("ilk sayı ile diğerlerinin toplamının çarpımı : " +sayı1* toplam);//115
		
	}

	
		
	}


