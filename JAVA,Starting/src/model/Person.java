package model;

import java.io.Serializable;
import java.util.Objects;

public  class Person implements Serializable {
    private String name;
    private int age;
    private String address;
//    private String othername;
////    private void splitName()
//    {
//        String[] names = name.split(" ");
//        othername = "First name : "  + names[0] + "\n" + "Last name : " +names[1];
//    }
//
//    public String getOthername() {
//        return othername;
//    }
//
//    public void setOthername(String othername) {
//        this.othername = name;
//        splitName();
//    }

    public Person(){}
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
//    public Person(String othername)
//    {
//        this.othername = othername;
//    }
    public Person(int age)
    {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public int show(int a){
        a=a+1;
        return a;
    }
    public String show(String a){
        a = a +"Hello";
        return a;
    }
    public void Out()
    {
        String info = "Ten: " + name + "\nTuoi: " +age+ "\nDia chi: " + address;
        System.out.println(info);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(address, person.address) ;
//                && Objects.equals(othername, person.othername);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                /* ", othername='" + othername '\'' +*/
                '}';
    }
}
