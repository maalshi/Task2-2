package HashSetVsTreeSet;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		int notNull = 0;
		
		TreeSet<Integer> tset = new TreeSet<Integer>();
		for (int i = 0; i < 1000; i++){
			Integer d = (int) (Math.random()*100);
			tset.add(d);
		}
		System.out.println(tset);
		
		Iterator<Integer> it = tset.iterator();
		while (it.hasNext()){
			if (it.next() != 0)
				notNull++;
			else 
				it.remove();

	}
		System.out.println("Updated collection: ");
		System.out.println(tset);

   }


}


