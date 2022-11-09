package day19_WhileDoWhileLoop;

public class C05_DoWhileLoop {

	public static void main(String[] args) {
		//m harfinden başlayarak c harfine kadar tüm harfleri yazdırın.
		
		for (char i = 'm'; i >'c'; i--) {					//FORLOOP LA BÖYLE
			System.out.print(i+" ");
		}
		System.out.println("");
		char krk='m';
															//WHİLELOOP LA BÖYLE
		while (krk>'c') {
			System.out.print(krk+" ");
			krk--;
			
		}
		System.out.println("");
		char kar='m';
		do {												//DOWHİLELOOP İLE BÖYLE
			System.out.print(kar+" ");
			kar--;
		} while (kar>'c');
		
	}

}
