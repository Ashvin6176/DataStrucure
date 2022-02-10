package com.DSAProgram;

import java.util.stream.Stream;

public class DemoFile {
    public static void main(String[] args){
        Integer i[]={1,5,6,7,2,8,12};

        Stream.of(i).filter(x->x%2==0).forEach(System.out::println);
    }
}
