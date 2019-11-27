package inject.complex;

/**
 * @author 南八
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void update() {
        System.out.println("update in user dao...");
    }
}
