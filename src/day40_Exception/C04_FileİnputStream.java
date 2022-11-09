package day40_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileİnputStream {

	public static void main(String[] args) throws FileNotFoundException {
		// Java da bir dosyaya ulaşmak istediğimizde file inpu stream classından yardım alırız.
		// 
		
		@SuppressWarnings("unused")
		FileInputStream fis=new FileInputStream("src\\day40\\yazı.txt");
		
		// Java bu kodda olası bir problem öngörüyor. 
		// Bu proleme karşı ne yapması gerektipğini bize soruyor. 
		// Yani altı çizilen her kod CTE değildir.
		
		// Bunun için 2 durum söz konusu
		// 1- Try catch kullanarak bu problemi handle edip Javanın yoluna devam etmesini sağlayabiliriz.
		// 2- Eğer dosya okunamıyorsa kod çalışmasın istiyorsak olayın farkında olduğumuzu 
		// 	  ve sorumluluğun bizde olduğunu javaya söylemeliyiz.
		System.out.println("görev tamamlandı");
	}

}
