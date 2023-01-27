package javaexample;

import java.util.ArrayList;

public class CollectionExamples {

	public static void main(String[] args) {
		ArrayList<String> Name= new ArrayList<String>();
		Name.add("Ankit");
		Name.add("Divyank");
		Name.add("Khilendra");
		
		System.out.println(Name);
		Name.add("Rahul");
		System.out.println(Name);
		Name.add(1, "Rohit");
		System.out.println(Name);
		
		
		Name.add(0, "Lakhan");
		System.out.println(Name);
		

	}

}
