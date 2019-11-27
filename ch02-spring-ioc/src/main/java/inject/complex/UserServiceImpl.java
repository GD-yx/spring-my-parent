package inject.complex;

/**
 * @author 南八
 */
public class UserServiceImpl implements UserService{
    /*细节依赖抽象（UserDao接口是抽象的)*/
    private UserDao dao;
    private String xxx;
    /*public UserServiceImpl(UserDaoImpl userDao) {
        this.dao = userDao;
    }*/
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public void setXxx(String xxx) {
        this.xxx = xxx;
    }

    @Override
    public void update() {
        dao.update();
    }
}
