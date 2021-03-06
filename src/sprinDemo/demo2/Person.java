package sprinDemo.demo2;

public class Person {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return "this person's name : " + name;
    }

    public void init(){
        System.out.println("Person----init");
    }

    public void destory(){
        System.out.println("Person-----destory");
    }
}
