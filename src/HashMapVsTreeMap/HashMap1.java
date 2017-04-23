package HashMapVsTreeMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class HashMap1 {
	
	
	public static void main(String[] args) {
		Integer d1 = 0;
		Integer d2 = 0;
		int notNull = 0;
		
		HashMap <Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (int i =0; i<2500; i++){
			d1 ++;
			d2 = (int) (Math.random()*100);
			hmap.put(d1, d2);
			System.out.println(hmap);
		}
		
		hmap.remove(4);
		
		System.out.println("Updated collection: ");
		System.out.println(hmap);
		

	}

}
