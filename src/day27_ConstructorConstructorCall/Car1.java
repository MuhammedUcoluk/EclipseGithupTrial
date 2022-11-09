package day27_ConstructorConstructorCall;

public class Car1 {
	
	
	
	
	int yıl=2000;
	String renk;
	String model;
	int km;
	boolean satılıkMı;
	
	public Car1(int km, String model, String renk, int yıl, boolean satılıkMı) {
		// Atama yapacağımız tüm özellikler parametre olarak yolladık.
	}
	 // Ben 5 özelliği olan bir cost.. ürettiğimde java default const.. sildi.
	// Bu durumda daha önce yazılan ve default cons.. kullanan tüm kodlar çöker.
	// Bu durumda kodları düzeltmek için javanın sildiği default cons.. yerine parametresiz bir const.. oluşturmalıyım.
	
	
	// parametresiz cost. üretmenin syntax i calss adi+() + {} !!!!
	
	// Car1(){}
	
	
	
	public Car1() {
		// TODO Auto-generated constructor stub
	}



	


	public Car1(int i) { // bu yukarıdaki class taki yıla mı ait km ye mi ait bunu bildirmeliyim java ya.
		km=i;
		// 
	}


	


	public Car1(int i, int j) {
			//yıl       km 
		yıl=i;
		km=j;
	}


	public void hız(int hız) { 
		System.out.println("araba saatte " + hız + " km yapar");
		
		
	}
		
		public void yakıt(String yakıt) {
			
			System.out.println("araba yakıt olarak " + yakıt + " kullanır");
		}

}
