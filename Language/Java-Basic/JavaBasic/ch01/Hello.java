package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Hello {

	public static void main(String[] args) {
		System.out.println(pibo(30));
		
		System.out.println("안녕하세요.");
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 1; i <= 10; i++)
		{
			numbers.add(i);
		}
		
		for(int number : numbers) 
		{
			System.out.print(number + " ");
		}
		
		
		
	}
	
	
	
	public static int pibo(int a)
	{
		if(a == 0) return 0;
		if(a == 1) return 1;
		return pibo(a - 1) + pibo(a - 2);
	}
}
