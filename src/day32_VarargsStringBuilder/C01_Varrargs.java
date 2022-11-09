package day32_VarargsStringBuilder;

public class C01_Varrargs {

	public static void main(String[] args) {
		

		
		topla(5,8,10,13,15,0);
		
		
		// varargs list gibi davranır ama array methodları ile çalışır.
	}

	private static void topla(int... sayılar) {
		int toplam=0;
		for (int each : sayılar ) {
			toplam+=each;
		}
		System.out.println("girilen sayıların toplamı : " + toplam);
	}

}
