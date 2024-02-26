package com.busycoder.java8.workshop.ex3;

import java.util.Optional;
class CityNotFoundEx extends RuntimeException{

}
/*
    What is Optional class in java 8
    how to deal with NPE in better way
 */
public class B_OptionalClass {
    public static void main(String[] args) {

        //raj
        Optional<String> opCityName = getCityName(8);
//        String cityName=opCityName.orElse("not found");
//        System.out.println(cityName);

//        String cityName=opCityName.orElseThrow(()->new CityNotFoundEx());
//        System.out.println(cityName);

        String cityName=opCityName.orElseThrow(CityNotFoundEx::new);
        System.out.println(cityName);

    }





    //harsh
    public static Optional<String> getCityName(int cordate){
        //db
        return Optional.ofNullable(null);
    }


//    //harsh
//    public static String getCityName(int cordate){
//        //db
//        return null;
//    }
}
