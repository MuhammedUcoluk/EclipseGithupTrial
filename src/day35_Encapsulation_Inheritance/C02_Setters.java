package day35_Encapsulation_Inheritance;

public class C02_Setters {

	public static void main(String[] args) {
		
		// Öğretmenler öğrencinin notunu girebilsin ama 
		// tüm notlarını göremesin
		// Sadece geçip geçmediğini görsün.
		
		C01 ogr1=new C01();

		System.out.println(ogr1.isGecerMi()); // FALSE
		
		ogr1.setNot(60);
		
		System.out.println(ogr1.isGecerMi()); //TRUE
	
	}

}
