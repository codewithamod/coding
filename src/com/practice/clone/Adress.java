package com.practice.clone;

public class Adress implements Cloneable {

    private String city;

    public Adress(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Adress adress1 = new Adress("Delhi");
        Adress adress2 = (Adress) adress1.clone();
        System.out.println(adress1.city);
        System.out.println(adress2.city);

        System.out.println("After transformation");
        adress2.city = "Mumbai";
        System.out.println(adress1.city);
        System.out.println(adress2.city);
    }
}
