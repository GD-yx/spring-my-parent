package lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author 南八
 */
public class UserInfoDaoLifeCycle2 implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("-------destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties set :初始化");
    }
}
