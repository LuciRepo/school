package com.fastrackit;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    public static int retireAge;
    private static final double EARTH_GRAVITY = 0.99;
    protected String name;
    private int age;
    private double weight;
    Date graduationDate = new SimpleDateFormat("dd- MM- yyyy HH:mm:ss").parse(31 - 12 - 2020 12:00:00);
    Date happyAnniversary = new SimpleDateFormat("dd- MM- yyyy HH:mm:ss").parse(01 - 06 - 1990 12:00:00);

    public Person(Date graduationDate, Date happyAnniversary) {
        this.graduationDate = graduationDate;
        this.happyAnniversary = happyAnniversary;
        System.out.println();
    }

   /* public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public Date getHappyAnniversary() {
        return happyAnniversary;
    }

    public void setHappyAnniversary(Date happyAnniversary) {
        this.happyAnniversary = happyAnniversary;
    }*/


    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    // overloading
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public static double getEarthGravity() {
        return EARTH_GRAVITY;
    }

    public final void setName(String name) {
        this.name = name;
        // some important stuff - ca sa apara se pune public final..
        System.out.println("Some important stuff");
    }

    public String getName() {
        return name;
    }
}
