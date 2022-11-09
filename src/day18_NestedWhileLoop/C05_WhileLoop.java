package day18_NestedWhileLoop;

public class C05_WhileLoop {

	public static void main(String[] args) {
		// For ve While Loop kullanarak 3 basamaklı sayılardan 15 20 ve 90 a tam bölünebilen sayıları yazdırın.
		
		for (int i = 100; i < 1000; i++) {
			if (i%15==0 && i%20==0 && i%90==0) {
				System.out.println(i+ " ");
			}
		}
			int sayı=100; // başlangıç değerim
			while (sayı<1000) { // şartım
				if (sayı%15==0 && sayı%20==0 && sayı%90==0) {
					System.out.println(sayı);
				}
				sayı++;
			}
		// eğer başlangıç ve bitiş şartı bir sayının artışına bağlı ise veya 	tekrar edilecek
			// işlem adedi belli ise FORLOOP
		// bir önceki örnekteki gibi işlem tekrar sayısı belli değil veya 
		//bitiş için bir sınır değerinden büyük olma gibi bir şart varsa WHİLELOOP tercih edilir.
	}

}
