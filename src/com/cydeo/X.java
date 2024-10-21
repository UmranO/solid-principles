package com.cydeo;

public class X {
    public static void main(String[] args) {

        Z z= new Y();                      //Here Polymorphisim Z is the interface with an abstract method
                                           //Y is a class that implements that interface Z
        z.method();                        //We are calling in Class X the Interface's method from the object of
                                           //class Y which is implementing Interface Z.
                                           //Bu noktada source code dependency olarak ciplak gozle kodu takip etmek
                                           //istedigimizde main module'den baslayip zinteface gidiyoruz ama z'de sadece
                                           // abstract method var. Buradan sonrasinda implementation'in nerede oldugunu
                                           //direkt goremiyoruz. Inter.Z'de boyle bir bilgi yok. Ama ClassY'de bu bilgi
                                           //mevcut:
                                                    /*
                                                    public class Y implements Z {
                                                    @Override
                                                    public void method() {
                                                                           }
                                                     */
                                           //Dolayisiyla burada tight coupling olmasin diye istedigimiz source code
                                           //dependency'nin terse donme durumu gerceklesmis oldu. UOS Bilgi akisi terse
                                           //dondu.


    Z a=new A();                          //A is a class that implements Interf.Z & if there is a problem in the method
                                          //which is an implementation of the Z's abstract() in Class Y but this won't
                                          //affect the same abstract()'s implementation in class A when we call it in A
    a.method();
    }
}
