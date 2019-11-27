package aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author 南八
 */
public class SomeBean implements ApplicationContextAware, BeanNameAware {
    @Override
    public void setBeanName(String s) {

    }
    private ApplicationContext context;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public  ApplicationContext getContext(){
        return this.context;
    }
    public void xxx(){

    }
}
