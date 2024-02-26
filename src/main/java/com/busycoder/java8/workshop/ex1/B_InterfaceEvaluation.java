package com.busycoder.java8.workshop.ex1;

import java.util.Comparator;

/*
    interface evaluation in java 8?
 */
interface Foo{
    void foof();
    //java 9 : private method inside the interface aka helper method to the default method
    private void fooPrivate(){
        System.out.println("foo private");
    }
    static void fooStatic(){
        System.out.println("foo static method");
    }
    default  void foofDefault(){
        fooPrivate();
        System.out.println("foof default code");
    }
}
class FooImpl1 implements Foo{
    @Override
    public void foof() {
        System.out.println("foof overriden imp1");
    }
}
class FooImpl2 implements Foo{
    @Override
    public void foof() {
        System.out.println("foof overriden imp2");
    }
    @Override
    public   void foofDefault(){
        System.out.println("foof default code override");
    }
}
//another ex
interface Cal{
    int add(int a, int b);
}
public class B_InterfaceEvaluation {
    public static void main(String[] args) {

        //
        Runnable runnable=()-> System.out.println("job of thread...");

        Comparator<String> stringComparator=( o1,  o2)-> o2.compareTo(o1);





       // Cal cal=( a,  b) -> a+b;






        Foo foo=new FooImpl1();
        foo.foofDefault();
        foo.foof();

        Foo.fooStatic();//cotaining the algo

    }
}
