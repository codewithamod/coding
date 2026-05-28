package com.design_pattern;

public class FactoryTest {
    public static void main(String[] args) {
        Mobile factory = Factory.getInstance("android");
        factory.call();
    }
}

class Android implements Mobile {
    public Android() {
        System.out.println("Android object created");
    }

    @Override
    public void call() {
        System.out.println("calling from android");
    }
}

class Iphone implements Mobile {
    public Iphone() {
        System.out.println("Iphone object created");
    }

    @Override
    public void call() {
        System.out.println("calling from iphone");
    }
}

class Factory {

    public static Mobile getInstance(String type) {
        if (type.equalsIgnoreCase("android")) {
            return new Android();
        } else if (type.equalsIgnoreCase("iphone")) {
            return new Iphone();
        } else {
            return null;
        }
    }

}

interface Mobile {
    void call();
}
