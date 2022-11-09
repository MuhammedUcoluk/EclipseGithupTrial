package day27_ConstructorConstructorCall;

public class C02_ParametreliContructor {

	public static void main(String[] args) {
		//Java nın oluşturduğu default const.. ile obje oluşturabiliyoruz ama her obje için yeniden değer ataması 
		// yapmak zahmetli oluyor.
		// İstersek parametrreli cons... oluşturup daha obje oluşturuken istediğim değerleri atayabilirim.
		
		Car1 car1=new Car1(50000,   "Vectra",    "Beyaz",     2015,          true);
						//int km,String model,String renk, int yıl,boolean satılıkMı
		
		
		Car1 car2=new Car1(35000);
						//int km
		System.out.println(car2.km); // 35000
		
		Car1 car3=new Car1();
		System.out.println(car3.km); // 0 default değeri atayacak.
		
		Car1 car4=new Car1(1000);
		System.out.println(car4.km); // 1000 verir.
		
		// yıl ve km yi parametre olarak girebileceğim bir constr. daha oluşturabilir miyim?
		
		Car1 car5=new Car1(2020,5000);
						//yıl,  km
		System.out.println(car5.yıl + " " +car5.km + " " + car5.model);
							//2020			5000				null
		
		
		
	}

}
