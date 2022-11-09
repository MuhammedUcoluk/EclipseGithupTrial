package day33_StringBuilder;

public class C07_Yarışma {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// ForLoop ile 1000 defa işlem yapalım.
		// Öncesinde ve sonrasından zamanı kontrol edip StringBuilder ve String class larının performanslarını karşılaştıralım
		
		//İpucu long Timesb=System.nanoTime(); kullanalım
		
		String str="Merhaba";
		StringBuilder sb=new StringBuilder("Merhaba");
		sb.trimToSize();// Capasiteyi lenght boyutuna indirdik.
		
		long time1=System.nanoTime();
		
		for (int i = 0; i < 1000; i++) {
			str+=" ";
			
		}
		
		long time2=System.nanoTime();
		
		long stringSure=time2-time1;
		
		//BURAYA KADAR STRİNG İN FOR LOOP U ÇALIŞTIRMA SÜRESİNİ ÖLÇTÜK
		
		long time3=System.nanoTime();
		
		for (int i = 0; i < 1000; i++) {
			sb.append(" ");
			
		}
		
		long time4=System.nanoTime();
		
		long sbSure=time4-time3;
		
		
		// BURAYA KADAR DA STRİNGBUİLDER IN HIZINI ÖLÇTÜK
		
		
		
		// SONRA AŞAĞIDAKİ GİBİ YAZDIRDIK.
		if (sbSure>stringSure) {
			System.out.println("String daha hızlı");
		} else {
			System.out.println("StringBuilder daha hızlı");
		}
		
		System.out.println(stringSure/sbSure); // 26 kat daha hızlı.
	}

}
