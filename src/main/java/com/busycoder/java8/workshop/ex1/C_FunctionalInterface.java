package com.busycoder.java8.workshop.ex1;
/*
    What is funcational interface?
    @FunctionalInterface annotation
 */
@FunctionalInterface
interface Foof{
    void foofMethod();

    default String foofDefault(){
        System.out.println("foof default ");
        return "busycoder";
    }
    static String foofStatic(){
        System.out.println("foof static ");
        return "busycoder";
    }

}
public class C_FunctionalInterface {
    public static void main(String[] args) {

        //What is lamabda is a peice of code vs annonymous inner class


//        Foof foof=new Foof() {
//            @Override
//            public void foofMethod() {
//                System.out.println("foof method is overriden");
//            }
//        };

                //peice of code that can be passed in a method call , can be returned from method call
                //peice of code that that is passed around
                //high level function (funcational programming)
        Foof foof=()-> System.out.println("foof method is overriden");



        Foof foof2=()->
                System.out.println("foof method is overriden");



        Foof foof3=()->
                System.out.println("foof method is overriden");


        foof3.foofMethod();

    }
}
