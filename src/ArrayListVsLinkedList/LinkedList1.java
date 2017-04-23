package ArrayListVsLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class LinkedList1 {
	static int notNull = 0;


	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i <10000; i++) {
			Integer d = (int) (Math.random()*100);
			list.add(d);
		}
		//show the collection
		System.out.println(list);
		
		//find all zeroes and remove them from collection
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()){
			if (it.next() < 50)
				notNull++;
			else 
				it.remove();

	}
		System.out.println("Updated collection: ");
		System.out.println(list);

   }
}
