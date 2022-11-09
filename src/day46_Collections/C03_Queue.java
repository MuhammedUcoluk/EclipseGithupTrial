package day46_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {
		
		Queue<String> kuyruk = new LinkedList<>();
		
		kuyruk.add("Lutfullah");
		kuyruk.add("Mustafa");
		kuyruk.add("Rıdvan");
		
		System.out.println(kuyruk); //[Lutfullah, Mustafa, Rıdvan]
		
		kuyruk.remove();
		System.out.println(kuyruk); //[Mustafa, Rıdvan]
		
		kuyruk.remove();
		System.out.println(kuyruk);//[Rıdvan]
		
		kuyruk.add("Rıdvan");
		kuyruk.add(null);
		kuyruk.add(null);
		kuyruk.add(null);
		
		System.out.println(kuyruk); //[Rıdvan, Rıdvan, null, null, null]
	}

}
