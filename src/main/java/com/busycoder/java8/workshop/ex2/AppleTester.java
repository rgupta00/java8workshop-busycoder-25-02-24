package com.busycoder.java8.workshop.ex2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AppleTester {

		
		public static void main(String[] args) {

		List<Apple> apples = Arrays.asList
				(new Apple("red", 400),
						new Apple(
				"green", 300),
						new Apple("green", 200),
						new Apple("red", 250));


		//Method ref is syntex suger over lamabda ::

//		Predicate<Apple> heavyPredicate= a->a.getWeight()>=250;

//     	Predicate<Apple> heavyPredicate= Apple::isHeavyApple;
     	Predicate<Apple> heavyPredicate= AppleLogic::isHeavy;

//		Predicate<Apple> greenPredicate= a->a.getColor().equals("green");

			Predicate<Apple> greenPredicate=Apple::isGreen;

		Predicate<Apple> heavyAndGreen=heavyPredicate.and(greenPredicate);

		List<Apple> heavyApples=AppleApp.getAllApplesOnCondition(apples, heavyAndGreen);
//		heavyApples.stream().forEach(a-> System.out.println(a));
	heavyApples.forEach(a-> System.out.println(a));












//		List<Apple> heavyApples= AppleApp.getAllpplesOnCondition(apples,Apple::isHeavyApple);
//		heavyApples.forEach(a-> System.out.println(a));

//			List<Apple> heavyApples= AppleApp.getAllpplesOnCondition(apples,Apple::isGreen);
//			heavyApples.forEach(a-> System.out.println(a));
//
//			//green or heavy
//			Predicate<Apple> heavyPredicate=Apple::isHeavyApple;
//			Predicate<Apple> greenPrediate=Apple::isGreen;
//			Predicate<Apple> greenOrHeavyPrediate=heavyPredicate.or(greenPrediate);
//
//			List<Apple> heavyOrGreenApples= AppleApp.getAllpplesOnCondition(apples,greenOrHeavyPrediate);
//			heavyOrGreenApples.forEach(a-> System.out.println(a));

	}
}

















