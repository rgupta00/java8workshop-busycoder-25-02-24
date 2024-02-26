package com.busycoder.java8.workshop.ex2;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
//OCP
public class AppleApp {

    public static List<Apple> getAllApplesOnCondition(List<Apple>apples, Predicate<Apple> predicate){
        return apples.stream().filter(predicate).toList();
    }

//    public static List<Apple> getAllApplesOnCondition(List<Apple>apples, Predicate<Apple> predicate){
//        List<Apple> appleOnCondition=new ArrayList<>();
//        for(Apple temp: apples){
//            if(predicate.test(temp)){
//                appleOnCondition.add(temp);
//            }
//        }
//        return appleOnCondition;
//    }


//    public static List<Apple> getAllRedApples(List<Apple>apples){
//        List<Apple> appleOnCondition=new ArrayList<>();
//        for(Apple temp: apples){
//            if(temp.getColor().equals("red")){
//                appleOnCondition.add(temp);
//            }
//        }
//        return appleOnCondition;
//    }

//        public static List<Apple> getAllHeavyApples(List<Apple>apples){
//            List<Apple> appleOnCondition=new ArrayList<>();
//            for(Apple temp: apples){
//                if(temp.getWeight()>=250){
//                    appleOnCondition.add(temp);
//                }
//            }
//            return appleOnCondition;
//    }
}











//OCP: SOLID
//all heavy apples >=250


//all green apples
//    public static List<Apple> getAllGeenApples(List<Apple>apples){
//        List<Apple> appleOnCondition=new ArrayList<>();
//        for(Apple temp: apples){
//            if(temp.getColor().equals("green")){
//                appleOnCondition.add(temp);
//            }
//        }
//        return appleOnCondition;
//    }
