package sprinDemo.demo4;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

    public String name;
    public Integer age;

    public Dog dog;

    public String dogName;

    /*集合*/
    //数组
    public String[] attr;

    //List
    public List myList;

    //Set
    public Set mySet;

    //map
    public Map myMap;

    public void setAttr(String[] attr) {
        this.attr = attr;
    }

    public void setMyList(List myList) {
        this.myList = myList;
    }

    public void setMySet(Set mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map myMap) {
        this.myMap = myMap;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public Student(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    //    public void setName(String name){
//        this.name = name;
//    }
//    public void setAge(Integer age){
//        this.age = age;
//    }
}
