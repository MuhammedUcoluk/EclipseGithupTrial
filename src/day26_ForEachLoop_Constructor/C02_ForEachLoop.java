package day26_ForEachLoop_Constructor;

public class C02_ForEachLoop {

	public static void main(String[] args) {
		// Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop 
		//kullanarak bulunuz. Sonucu ekrana yazdiriniz
		
		int arr[]= {1,2,3,4,5};
		
		int carpım=1;
		for (int each : arr) {
			
			carpım*=each;
		}
		System.out.println("Arrayin elemanları çarpımı = " + carpım);
	}

}
