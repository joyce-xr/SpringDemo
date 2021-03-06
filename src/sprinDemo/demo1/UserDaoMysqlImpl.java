package sprinDemo.demo1;

public class UserDaoMysqlImpl implements UserDao {

    private String name;
    //使用依赖注入必须要提供set方法
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("mysql dao save");
        System.out.println("mysql dao.name = " + name);
    }

    @Override
    public void delete() {
        System.out.println("mysql dao delete");
    }

    public void init(){
        System.out.println("UserDaoMysqlImpl----init");
    }

    public void destory(){
        System.out.println("UserDaoMysqlImpl-----destory");
    }
}
