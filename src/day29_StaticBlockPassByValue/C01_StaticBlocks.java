package day29_StaticBlockPassByValue;

public class C01_StaticBlocks {

	static { 
		
		System.out.println("static blok Main Method'dan bile önce çalışır.!!!!!!!!!!");
		
	}
	public static void main(String[] args) {
		
		System.out.println("Java'da önce Main Method çalışır.");

	}
	static {
		
		System.out.println("static blok nereye yazılırsa yazılsın Main Method'dan önce çalışır!!!!!!!!!!!!");
		
		// Buradaki gibi birden fazla static varsa Java önce yukarıdakini çalıştırır...
	}
}
