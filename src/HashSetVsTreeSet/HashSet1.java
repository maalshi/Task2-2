package HashSetVsTreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class HashSet1 {
	static int notNull = 0;

	
	public static void main(String[] args) {
		HashSet <Integer> hset = new HashSet<Integer>();
		
		for (int i = 0; i < 1000; i++){
			Integer d = (int) new Random().nextGaussian();
			hset.add(d);
		}
		System.out.println(hset);
		
		TreeSet<Integer> tset = new TreeSet<Integer>();
		for (int i = 0; i < 10000; i++){
			Integer d = (int) (Math.random()*10000);
			tset.add(d);
		}
		System.out.println(tset);
		
		Iterator<Integer> it = tset.iterator();
		while (it.hasNext()){
			if (it.next() < 70)
				notNull++;
			else 
				it.remove();

	}
		System.out.println("Updated collection: ");
		System.out.println(tset);

   }


}


