package com.busycoder.java8.workshop.ex1;

import java.util.function.*;

/*
    main 4 FI in java:
    Predicate
    Function
    Consumer
    Supplier
 */
public class E_FunctionalInterfaceInJava {
    public static void main(String[] args) {
        //Predicate basic?
//        Predicate<Integer>evenPredicate= x-> x%2==0;
//        Predicate<Integer>graterThen20= a-> a>20;
//
//        Predicate<Integer> p2=evenPredicate.and(graterThen20);
//        System.out.println(p2.test(441));


        //Bipredicate
        //if x >y or eq return t or return f
//        BiPredicate<Integer, Integer> b1=( x, y)-> x>=y;

//        Function<String,Integer> f1= s -> s.length();
//        System.out.println(f1.apply("busycoder"));

    //map(funcation)
       // BiFunction
//        BiFunction<String, String, String> f2=( s,  s2)-> s.concat(s2);
//        String data=f2.apply("rajeev","gupta");
//        System.out.println(data);

        //forEach(Consumer)
//      Consumer<String> consumer=x-> System.out.println(x);
//       consumer.accept("java rock");

//        BiConsumer<String, Integer> b2=(k, v)-> System.out.println(k+": "+v);
//
//       b2.accept("java",21);
//
//       //Supplier: factory dp
//        Supplier<String> supplier=()-> "java 8 workshop";
//
//        String data2=supplier.get();
//
//        System.out.println(data2);

  //  BinaryOperator<Integer> integerBinaryOperator=( x,  y)-> x+y;



    }
}
