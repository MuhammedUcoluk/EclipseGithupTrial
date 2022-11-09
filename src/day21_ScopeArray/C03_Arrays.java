package day21_ScopeArray;

public class C03_Arrays {

	public static void main(String[] args) {
		// Elemanları "Ali" "Veli" "Ayse" ve "Fatma" olan bir arrya oluşturun ve yazdırın.
		
		String arr[]= new String[4];
		
		arr[0] = "Ali";
		arr[1] = "Veli";
		arr[2] = "Ayşe";
		arr[3] = "Fatma";
		// Bu uzun yolu.
		// KISA YOLU!!!
		
		String arr2[]= {"Ali","Veli","Ayşe","Fatma"};
		
		 //Soru2= "Ali" yerine "Can" Ayşe yerine gül atayın.
		
		arr2[0]="Can";
		arr2[2]="Gül";
		
		System.out.println(arr2[1]);

		// Son elemeti yazdırın.
		System.out.println(arr[arr.length-1]); // String deki lengh te yanında () vardı burada sadece lenght.
		
		//System.out.println(arr[arr.length]);// Hata verir. yazdırğın index sınırların dışında hatası.
	}

}
