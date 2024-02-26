package com.busycoder.java8.workshop.ex3;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import static java.util.stream.Collectors.*;
import java.util.stream.Stream;


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

		//collect  all the book names having cost 500
		//java 8 stuff
//		Stream<Book> stream = books.stream();
//		List<String> namesOnly=books.stream()
//				.filter(new Predicate<Book>() {
//					@Override
//					public boolean test(Book book) {
//						return false;
//					}
//				})
//				.map(new Function<Book, String>() {
//					@Override
//					public String apply(Book book) {
//						return null;
//					}
//				})
//				.collect(Collectors.toList());
//
//		namesOnly.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		});


//		List<String> namesOnly=books.stream()
//				.filter( book -> book.getPrice()>=500)
//				.map( book-> book.getTitle())
//				.collect(toList());


//		List<String> namesOnly=books.stream()
//				.filter( book -> book.getPrice()>=500)
//				.map( book-> book.getTitle())
//				.toList();
//
//		namesOnly.forEach(x-> System.out.println(x));

//		books.stream()
//				.filter( book -> book.getPrice()>=500)
//				.map( book-> book.getTitle())
//				.forEach(name-> System.out.println(name));

		books.stream()
				.filter( book -> book.getPrice()>=500)
				.map( book-> book.getTitle())
				.forEach(name-> System.out.println(name));

//
//		namesOnly.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		});



		//java 7
//		List<String> namesOnly=new LinkedList<>();
//		for(Book book: books){
//			if(book.getPrice()>=500){
//				namesOnly.add(book.getTitle());
//			}
//		}
//		for(String name: namesOnly){
//			System.out.println(name);
//		}

	}
}
