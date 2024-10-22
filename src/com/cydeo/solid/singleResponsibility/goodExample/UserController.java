package com.cydeo.solid.singleResponsibility.goodExample;
public class UserController {

//This is a good example for Single Responsibility Principle
//We don't put all the methods we need in this class.
//This class has only 3()s which are related with getting the request and response


    public static void getRequest() {
        // Get the request
        // Send this request to validation and security part
    }

    public static String createResponse() {
        return "Response";  // For example "User is created"
    }

    public static void sendResponse() {
        // Send user a response
    }
}
