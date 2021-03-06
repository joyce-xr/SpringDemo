package sprinDemo.demo3;

public class User {

//    public User(){
//        super();
//        System.out.println("User默认构造方法");
//    }

    public static User createUser(){
        System.out.println("指定静态方法创建对象");
        return new User();
    }
}
