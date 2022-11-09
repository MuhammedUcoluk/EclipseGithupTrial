package day43_İnterfaces;

public interface C02_İnterface {

	void motor(); // normal classlarda access modifier yazmazsanız java bunu default acces mod. kabul eder.
					// interface de ise acces modifier yazmazsanız java bunu public kabul eder.
	
	//private int sayı=10; JAVA PRİVATE VE PROTECTED KABUL ETME İNTERFACE DE.
	
	int sayı=10; // final ve static olarak kabul etti.
	
	public int sayı2=11;
	
	public static final int sayı3=12;
	
	//interface de body si olan bir method yazmak isterseniz java size 2 alternatif sunar;
	//1- Methodun başına "default" keyword yazabilirsiniz
	// ancak burada yazan default access modifier değil Java nın interfaces için özel kabul ettiği bir keyword dür.
	public default void kaporta() { 
		System.out.println("default keyword sayesinde body oluşturabildim.");
	}
	
	public static void şanzıman() {
		System.out.println("static keyword ile body oluşturabildim.");
	}
}
