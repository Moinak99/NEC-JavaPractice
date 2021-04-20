package basics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Collections {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void ArrayListDemo() {
		ArrayList<String> alist1= new ArrayList<String>(); //generic
		ArrayList alist2 = new ArrayList(); //non-generic type declaration
		//adding elements into Arraylist
		alist1.add("test");
		alist1.add(1, "test2");
		alist1.add("H e lLo Wor LD");
		System.out.println(alist1.get(2).replaceAll("\\s", "").toLowerCase());
		alist2.add(1);
		alist2.add(1, "test");
		
		//printing elements using traditional loop
		 for(int i=0 ; i<alist1.size() ; i++) {
			 System.out.println(alist1.get(i));
		 }
		 //printing by using Iterator
		 Iterator<String> i =  alist1.iterator();
		 while(i.hasNext()) {
			 System.out.println(i.next());
	}

	}
	
	public void LinkedListDemo() {
		
		LinkedList<String> list = new LinkedList<>();
		//adding elements into likned list
		list.add("Hello");
		list.add(1, "World"); //adding by index
		list.addLast("123");
		System.out.println(list.size()); //printing the size
		//view elements using foreach loop
		list.forEach((temp)->{
			System.out.println(temp);
		});
	}
	
	public void VectorDemo() {
		Vector<Integer> vect = new Vector<>(); //synchronized and thread safe
		System.out.println(vect.capacity()); // by default size is 10, increases by 100%
		//adding elements
		vect.add(1);
		vect.add(2);
		vect.add(2);
		vect.add(3);
		//printing elements
		for(int i:vect) {
			System.out.println(i);
		}
		
	}

	public void HashMapDemo() {
		Map<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "test");
		hmap.put(2, "test1");
		
		Set<Integer> keys = hmap.keySet();
		
		for(int i : keys) {
			System.out.println(i);
			System.out.println(hmap.get(i));
		}
		//System.out.println(hmap.get(1));
		
	}

	public void HashSetDemo() {
		//cannot have duplicate entries,time complexity less compared to array
		HashSet<Integer> myset = new HashSet<>(); 
		myset.add(6);
		myset.add(7);
		myset.add(5);
		myset.add(6);
		for(int i: myset) {
			System.out.println(i);
		}
	}

	public void LinkedHashSetDemo() {
		
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();  
		
		linkedset.add("Hello");
		linkedset.add("World");
		
		for(String i: linkedset) {
			System.out.println(i);
		}
	}
	
	public void LinkedTreeSetDemo() {
		TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  

		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}
	
	public void PriorityQueueDemo() {
		//it doesn't work in  FIFO like normal queue. it arranges data based on their priority
		PriorityQueue<String> pq = new PriorityQueue<>();
		//adding elements 
        pq.add("Moinak");
        pq.add("Ghosh");
        // Printing by iterator interface
        Iterator<String> iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
	}
	
}
