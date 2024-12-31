package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Arya");//add
		a.add("Dhedhu");
		a.add("Radhil");
		System.out.println(a);
		a.add(1, "Thrivedha");//add by index
		System.out.println(a);
       System.out.println( a.get(2));
       a.set(3, "Raju");//replace
       System.out.println(a);
       
       if(a.contains("Achu"))//contains method
       {
    	   System.out.println("Present");
       }
       else
       {
    	   System.out.println(" Not Present");
       }
       
       
       if(a.isEmpty())//isempty
       {
    	   System.out.println("List is empty");
       }
       else
       {
    	   System.out.println("List is not empty\n\n");
       }
       //for(String b : a)//for each loop
      // {
    	  // System.out.println(b);
      // }
       Iterator<String> obj = a.iterator();
       
       while(obj.hasNext())//hasnext method//check whether elements present
       {
    	   System.out.println(obj.next());//next method//print values
       }
       
      obj.remove();//remove last elements
      System.out.println(a);
       
	}

}
