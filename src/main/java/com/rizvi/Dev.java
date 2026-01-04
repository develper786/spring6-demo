package com.rizvi;


import org.springframework.beans.factory.annotation.Autowired;

public class Dev {

    @Autowired
    public Computer comp;
    private String name;
    private int age;

    public Dev() {
        System.out.println("Dev Object is created...");
    }

    public Dev(Computer comp, String name, int age){
        this.comp=comp;
        this.name=name;
        this.age=age;
        System.out.println("Desktop Object is created with parameterized constructor...");
    }


    public Computer getComp(){
        return comp;
    }
    public void setComp(Computer comp){
        this.comp=comp;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public void build() {

        System.out.println("Building and working in the project...");
        comp.compileCode();
    }
}
