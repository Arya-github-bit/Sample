package collections;

import java.util.HashSet;

public class Hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> a= new HashSet<String>();
		a.add("A");
		a.add("B");
		a.add("C");
		a.add("D");
		HashSet<String> b= new HashSet<String>();
		a.add("X");
		a.add("Y");
		a.add("U");
		a.add("W");
		a.addAll(b);//ADD ALL METHOD//ADDING TWO SETS
		System.out.println(a);
		

	}

}
