package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int shoeSize;
    private String pet;
    private String food;

    private String hairColor;

    public Person() {
        this.name="";
        this.age=Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age= age;
    }

    public Person(String name) {
        this.name= name;
    }

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

     public void setShoeSize(int shoeSize) {
         this.shoeSize=shoeSize;
     }

    public void setFood(String food) {
        this.food = food;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setPet (String pet) {
        this.pet = pet;
    }


    public int getShoeSize() {
        return shoeSize;
    }

    public String getPet() {
        return pet;
    }

    public String getFood() {
        return food;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age=age;
    }



    public String getName() {
        return name;
    }

    public Integer getAge() {

        return age;
    }
}
