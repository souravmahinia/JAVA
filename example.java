package collection;

import java.util.*;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to collection framework");
		ArrayList a1=new ArrayList();
		a1.add("sorav");
		a1.add(85);
		System.out.println(a1);
		System.out.println(a1.get(0));
		System.out.println(a1.remove(1));
		System.out.println(a1.contains("sorav"));
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		System.out.println(a1.set(0, "ram"));
		System.out.println(a1);
		a1.clear();
		a1.add("rohit");
//	    LinkedList list=new LinkedList();
//	    list.add("this is list");
//	    System.out.println(list);
		//Vector
		Vector a2=new Vector();
		a2.addAll(a1);
		System.out.println(a2);
		//Hashset.....UnOrdered
		HashSet a3=new HashSet();
		a3.add("rohan");
		a3.add(85.909);
		System.out.println("Hashset"+ a3);
		//TreeSet....Ordered(assending order)
		TreeSet a4=new TreeSet();
		a4.add(85);
		a4.add(96);
		a4.add(96);//in set duplicate value Not allowed
		a4.add(8);
		System.out.println("TreeSet" + a4);
	    

	}

}
