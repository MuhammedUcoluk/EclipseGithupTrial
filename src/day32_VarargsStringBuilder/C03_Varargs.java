package day32_VarargsStringBuilder;

public class C03_Varargs {

	public static void main(String[] args) {

		
		
		
		KafanaGöreIslem(5,10,13,0);
		
		
		// varargs list gibi davranır ama array methodları ile çalışır.
	}

	private static void KafanaGöreIslem(int sayı1, int sayı2,int sayı3 , int sayı4 ,   int ...sayılar ) {
										//5           // 10       //13		//0				""
		
		int toplam=0;
		for (int each : sayılar ) {
			toplam+=each;
		
		
		
		}
		System.out.println("ilk sayı ile diğerlerinin toplamının çarpımı : " +sayı1* toplam);//0

	}

}
