package day38_Overriding;

public class Balıklar extends Animals{

	public static void main(String[] args) {
	
		Balıklar balık1=new Balıklar();
		balık1.beslenme();//Tüm hayvanlar belenir

		balık1.hareket();//Balıklar yüzerek hareket eder.

		balık1.solunum();//Balıklar solungaçlarıyla nefes alır
 
	
	
	}
	
		@Override
		//Child class taki bir method parent class tan bir methodu override ediyorsa bunu istersek @override
		// notasyonu ile declare edebiliriz. Declare etmesek bile kod çalışır ancak
		// Declare ettiğimizde overriden methodu(parents class taki method) sürekli kontrol eder ve 
		//o methodda overridinge uymayan bir değişiklik olursa CTE verir.
		public void hareket(){
			System.out.println("Balıklar yüzerek hareket eder.");	
			
			}
	
			
			
			public void solunum() {
				System.out.println("Balıklar solungaçlarıyla nefes alır");
			}

	

}
