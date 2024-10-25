package com.cydeo.solid.dependencyInversion.goodExample;

public class MyApp {
   // public static void main(String[] args) {
   //     XMLReader xMLReader =new XMLReader();                Normalde bunlar websitesindeki forma end user'in girdigi
   //     UserReader userReader=new UserReader(xMLReader);     bilgiden gelecek dolayisiyla tek tek create etmene gerek
   //     userReader.getUsername();                            kalmayacak o zaman da main method yerine baska bir metod
   // }                                                        olacak eg read()

//Mesela:
    public static void read(Reader reader){
        UserReader userReader=new UserReader(reader);
        userReader.getUsername();

    }
}
