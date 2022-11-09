package day23_MultiDimensionalArray;

public class C04_MdArrays {

	public static void main(String[] args) {
		//  Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini 
		//ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
		
		int arr[][]={ {1,2,3}, {4,5}, {6} };
		
		int sonuc=1;  // arr[0].lenght-1 arr[1].lenght-1 arr[2].lenght-1  ile son elemanları bulduk.
		
		for (int i = 0; i < arr.length; i++) {
			
			int sonElementIndex=arr[i].length-1;
			sonuc*=arr[i][sonElementIndex];
		}
		System.out.println(sonuc);
		
	}

}
