package com.aston.task2.transport.specification;

public interface CarryCargo {

    default String fastening(){
        return " Может перевозить грузы.";
    }
}
