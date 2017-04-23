package ArrayListVsLinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;



public class ArrayList1 {
	

	public static void main(String[] args) {
		int notNull = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//fill the collection
		for (int i =0; i<10000000; i++){
			Integer d = (int) new Random().nextGaussian();
			list.add(d);
		}
		//Show the collection
		System.out.println("Collection is: ");
		for (Integer d : list) {
			System.out.println(d);
		}
		
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()){
			if (it.next() != 0)
				notNull++;
			else 
				it.remove();
			
		}
		
		System.out.println ("Чисел, которые не равны нулю: " + notNull);
		System.out.println("Новая коллекция: ");
		for (Integer d : list){
			System.out.println(d);
		}
		
	}

}
