package sprinDemo.demo1;

public class UserDaoOracleImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("Oracle dao save");
    }

    @Override
    public void delete() {
        System.out.println("Oracle dao delete");
    }
}
