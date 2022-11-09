package day26_ForEachLoop_Constructor;

public class CarRunner {

	public static void main(String[] args) {
		// Car classından bir obje oluşturalım.
		
		Car 		car1			=			new 			Car(); //car1 objesi oluşturduk.
		
	// Class ismi  **Obje ismi    **atama	   **keyword	   **Constructor call
		
		System.out.println(car1.km + " " + car1.model+ " " + car1.renk + " " + car1.yıl); //0 null null 2000
		
		
		// Bir obje oluştururken eğer obje için kendi class ında belirlenen değerleri kullanmak istiyorsam
		// hiç bir değeri kendim atamadan obje oluştuurabilirim.
		// Bu durumda hiçbir parametre kullanılmadığı için default contructor yeterli olacaktır.
		
		// Eğer obje oluşturduğum class taki değerleri kullanmak yerine kendi değerlerimle bir obje oluşturmak 
		// istersem o zaman paramaetreli contructor oluşturmam gerekir.
		
		// Car car2()=new Car("Kırmızı", "Corolla");
		
		// Car classında iki string parametresi olan bir constructor olmadığı için
		// (Şimdilik) bu obje oluşturmayı yapamayız.
	}

}
