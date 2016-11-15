package org.meetup.hyscala;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamPipeLineDemo {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		
		for(int i=1; i<=100;i++)
		{
			values.add(i);
		}
		
		//values.stream().filter(i ->  { System.out.println("hi"); return true; }); // intermediate operation
		
		//values .stream().map( i -> { System.out.println(2*i); return true; });  // intermediate operation
		
		values.stream().map(i->i*2).forEach(System.out::println);

	}

}
