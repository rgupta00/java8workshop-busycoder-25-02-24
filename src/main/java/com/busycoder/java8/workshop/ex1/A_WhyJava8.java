package com.busycoder.java8.workshop.ex1;

import java.util.stream.LongStream;

//calculating prime no bw 1 to 1_000_0
class Prime{
    public static boolean isPrime(Long n){
        boolean isPrimeNumber=true;
        for(int i=2;i<n;i++){
            if(n%i==0)
                isPrimeNumber=false;
        }
        return isPrimeNumber;
    }
}

public class A_WhyJava8 {
    public static void main(String[] args) {

//		//System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "8");
//		System.out.println(Runtime.getRuntime().availableProcessors());
//		//funcational/declerative (what to do) vs imparative (what to do , how to do?)
//		long start=System.currentTimeMillis();
//

//		long counter=LongStream.rangeClosed(1,160_00)
//				.filter(Prime::isPrime)
//				.parallel()
//				.count();
//
//		long end=System.currentTimeMillis();
//		System.out.println("counter: "+ counter);
//		System.out.println("time taken: "+ (end-start)+" ms");

        //java -Djava.util.concurrent.ForkJoinPool.common.parallelism=8 MotivationJava8
    }
}
