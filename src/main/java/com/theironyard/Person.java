package com.theironyard;

// Remember MVC? This is the (M)odel.
public class Person {
    // make these fileds private
    private String name;
    private String city;
    private int age;

    // this is a parameterless constructor
    // this is needed b the Spring serializer/deserializer
    // in order to use these objects with json

    // getters and setters for each field
    // json serializer uses these methods to build objects
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person () {

    }

    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }
}


