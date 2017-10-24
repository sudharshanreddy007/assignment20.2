package set;

import java.util.HashSet;
import java.util.Set;

public class Sets {
	
	  

	public static void main(String[] args)

			
	{
		// TODO Auto-generated method stub
		Set set1=new HashSet();
//As it implements the Set Interface, duplicate values are not allowed.
//Objects that you insert in HashSet are not guaranteed to be inserted
//in same order. Objects are inserted based on their hash code. 
//NULL elements are allowed in HashSet. HashSet also implements 
//Serializable and Cloneable interfaces.
//creating the object
		set1.add("Arnab");//add the values
		set1.add("Bharka");
		set1.add("Rajdeep");
		set1.add("Raviprakash");
		
		Set set2=new HashSet();
		//creating the objects
		set2.add("Goswami");//adding the values
		set2.add("Dutt");
		set2.add("Sardesai");
		set2.add("Kumar");
		
		System.out.println("Set1 elements:"+set1);//print set1
		System.out.println("Set2 elements:"+set2);//print set2
		set1.addAll(set2);//add all the values of set2 to set1
		System.out.println("After adding set2 elements into set1:");
		System.out.println(set1);//print set1
		
	    
	}

}