package org.meetup.hyscala;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String args[])
	{
		List<Integer> values = Arrays.asList(4,5,6,7,8);
		
		//values.forEach( i -> System.out.println(i)); //consumer interface
		//values.forEach(System.out::println); // method reference
		values.stream().forEach(System.out::println); //converts the normal list to stream
		 
		values.parallelStream().forEach(System.out::println); //// converts the list to parllel stream
																// depending on the cores available
        														// in cpu
		
		
		
		
		
	}
	
}
