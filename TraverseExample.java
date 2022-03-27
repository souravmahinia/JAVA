package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList();
		a1.add("sorav");
		a1.add("Rohan");
		a1.add("rohit");
		a1.add("mukesh");
		//for each_loop
		for(String str:a1) 
		{
			System.out.println(str);
			System.out.println(str.length()+"\t");
			//StringBuffer for reverse
			StringBuffer str1=new StringBuffer(str);
			str1.reverse();
			System.out.println(str1);
			
			
			
		}
         //traverse using iterater
		     Iterator<String> itr=a1.iterator();
		     System.out.println("______iterater_________");
		     while(itr.hasNext()){
		    	 String next=itr.next();
		    	 
		    	 System.out.println(next);
		     }
		   //Backword traverse using Listiterater
		     ListIterator<String> itr2=a1.listIterator(a1.size());
		     System.out.println("______Listiterater_________");
		     while(itr2.hasPrevious()){
		    	 String previous=itr2.previous();
		    	 
		    	 System.out.println(previous);
		     }
		     System.out.println("______Enumeration_________");
		     //Enumeration...Shortest method
		     a1.forEach(e->{
		    	 
		    	 System.out.println(e);
		     });
	}
	
  
}
