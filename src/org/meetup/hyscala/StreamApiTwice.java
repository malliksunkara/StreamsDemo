package org.meetup.hyscala;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiTwice {

	
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4,5,6,7,8);
		
		Stream<Integer> s=values.stream();
		
		s.forEach(System.out::println);
		
		s.forEach(System.out::println); // give the illegal state of exception

	}

}
