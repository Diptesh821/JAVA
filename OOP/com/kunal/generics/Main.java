package com.kunal.generics;

public class Main implements GenericInterface<Integer>{
int value;
    @Override
    public void display(Integer value) {

        this.value=value;
    }

    public static void main(String[] args) {
        Main obj=new Main();
        obj.display(20);
        System.out.println(obj.value);
    }
}
