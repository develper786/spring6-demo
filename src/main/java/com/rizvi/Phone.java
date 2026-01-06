package com.rizvi;

public class Phone {

    public Network network;

//    public Phone(Network network) {
//        System.out.println("Creating Phone object using constructor injection");
//        this.network = network;
//    }
//
//    public Phone(int a, double d){
//        System.out.println(a);
//        System.out.println(d);
//        System.out.println("2nd Network instance is created using constructor");
//    }


    public Network getNetwork() {
        return network;
    }
    public void setNetwork(Network network) {
        System.out.println("Creating network instance using setter");
        this.network = network;
    }

}
