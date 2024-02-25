package com.busycoder.java8.workshop.ex3;
import java.util.Arrays;
import java.util.List;


public class A_DemoLambdaExpession2 {

 public static void printMe(String data){
	 System.out.println(data);
 }

	
	public static void main(String[] args) {
		
		List<Book> books=Arrays.asList
				(new Book(121, "java", "raj", 540),
						new Book(11, "python", "ekta", 840),
						new Book(621, "c programming", "gunika", 300),
						new Book(191, "adv java", "raj", 940));

		//give me list of top 2 books as per price

	}
}
