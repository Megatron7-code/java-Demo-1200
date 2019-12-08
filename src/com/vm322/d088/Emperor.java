package com.vm322.d088;

public class Emperor {
    public static Emperor emperor = null;
    private Emperor(){}

    public static Emperor getInstance(){
        if(emperor == null){
            emperor = new Emperor();
        }
        return emperor;
    }

    public void getName(){
        System.out.println("kind");
    }
}
