package test_scripts;

import java.util.stream.IntStream;

public class Lamda {

	public static void main(String[] args) {
		IntStream.rangeClosed(1, 10).forEach(i -> System.out.println(i));

	}

}
