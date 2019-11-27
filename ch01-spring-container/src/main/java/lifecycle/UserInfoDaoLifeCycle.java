package lifecycle;

/**
 * @author 南八
 */
public class UserInfoDaoLifeCycle {
    public void init() {
        System.out.println("这个类的初始化代码，不是在构造函数");
    }
    public void init2(){
        System.out.println("2这个类的初始化代码，不是在构造函数");
    }
    public void destroy(){
        System.out.println("销毁");
    }
}