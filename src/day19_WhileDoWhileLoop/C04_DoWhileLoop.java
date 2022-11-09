package day19_WhileDoWhileLoop;

public class C04_DoWhileLoop {

	public static void main(String[] args) {
		//
		int i=0;											//WHİLE
		
		while (i<5) {
			System.out.print(i+" "); //01234
			i++;									// while önce kontrol eder sonra çalıştırır.loop içinde artış olsa da kontrol
													//eder ve bu durum bazı durumlarda hata ortaya çıkmasına sebep olur.
													// dowhile önce işlem yapar sonra şartı kontrol eder. Özellikle kullanıcıdan
													// değer almada dowhile tercih edilir.
		}
		System.out.println("");
		int a=0;
		
		do {												//DOWHİLE
			System.out.print(a+" ");// 01234
			a++;
		} while (a<5);
	}

}
