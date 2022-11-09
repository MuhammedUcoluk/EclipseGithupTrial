package day45_Collections;

import java.util.LinkedList;

public class C03_LinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll= new LinkedList<>();
		
		System.out.println(ll);
	
		ll.add(5);
		ll.add(7);
		
		System.out.println(ll);// [5,7]
		
		System.out.println(ll.peek()); // 5 Silmeden ilk elemanı getirdi.
		System.out.println(ll.peekFirst());//5 Silmeden ilk elemanı getirdi.
		System.out.println(ll.element()); //5 
		
		System.out.println(ll.poll()); // 5 getirdi sildi
		System.out.println(ll); //[7] bir üst satırda poll 5 i sildi ve onu döndürdü.
		System.out.println(ll.poll());//7
		System.out.println(ll);//[]
		System.out.println(ll.poll());//[]
		System.out.println(ll);//null
		
		System.out.println(ll.hashCode());//1
		
		LinkedList<Integer> ll2= new LinkedList<>();
		
		System.out.println(ll2.peekFirst()); // null
		System.out.println(ll2.peek()); // null
		//System.out.println(ll2.element()); //java.util.NoSuchElementException
		ll2.add(6);
		System.out.println(ll2.hashCode());//37
		
		System.out.println(ll2.offer(10)); // hem ekledi hem true döndü.
		System.out.println(ll2);//[6, 10]
		
		ll2.push(2); // addFirst ile aynı
		
		
		
		
	}

}
