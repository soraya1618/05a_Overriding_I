package com.cc.java;

public class Parent extends Grandparent {

    public String sayHello(){
        return "Hello from Parent";
    }

    public String sayHello(String str){
        return str + "parent";
    }
}

