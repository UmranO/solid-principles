package com.cydeo.solid.openClosed.example2.bad;

public class Calculator {
    public void calculate(Operation operation) {

        int num1 = 10;
        int num2 = 2;
        if(operation.getType()==OperationType.ADDITION){
            System.out.println( num1+num2);
        }
        if(operation.getType()==OperationType.SUBTRACTION){
            System.out.println( num1-num2);
        }
        if(operation.getType()==OperationType.MULTIPLICATION){
            System.out.println(num1 * num2);
        }
        if(operation.getType()==OperationType.DIVISION){
            System.out.println(num1/num2);
        }
        //What happens if I want to add another operation later?   %
        //-We have to make a modification to this calculate() like below which is not a good structure and align with
        //the open-closed principle bec. we have to change an already present method instend of extend the structure

//      if (operation.getType().equals(OperationType.MODULUS)) {
//          System.out.println(num1 % num2);
//        }

    }
}