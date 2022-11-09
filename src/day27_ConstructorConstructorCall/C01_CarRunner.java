package day27_ConstructorConstructorCall;

import day26_ForEachLoop_Constructor.Car;

public class C01_CarRunner {

	public static void main(String[] args) {
		//Dünkü car classından bir obje oluşturmak istediğimzide.
		// Java car classını  içinde bulunduğumuz class a import etmek ister.
		
	Car car1=new Car();
	System.out.println(car1.yıl);
	// ancak başka package da olduğu için içinde bulunduğumuz class tan
	// car classındaki variables lara ulaşabilmem için variablesin axcess modifierinın. public olması lazım.
	
	
	Car1 caar1=new Car1();
	System.out.println(car1.km + " " + car1.model+ " " + car1.renk + " " + car1.yıl + " " + car1.satılıkMı);
	// 0 null null 2000 false
	car1.km=75000;
	car1.model="Corolla";
	car1.renk="Kırmızı";
	
	System.out.println(car1.km + " " + car1.model+ " " + car1.renk + " " + car1.yıl + " " + car1.satılıkMı);
	//75000 Corolla Kırmızı 2000 false
	
	Car1 car2=new Car1();
	System.out.println(car2.km + " " + car2.model+ " " + car2.renk + " " + car2.yıl + " " + car2.satılıkMı);
	//0 null null 2000 false	
		
	Car1 car3=new Car1();
	car3.km=40000;
	car3.satılıkMı=true;
	System.out.println(car3.km + " " + car3.model+ " " + car3.renk + " " + car3.yıl + " " + car3.satılıkMı);
	//40000 null null 2000 true
	}

}
