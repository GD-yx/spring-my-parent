package com;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * @author 南八
 */
@HandlesTypes(MyAppInitializer.class)
public class MyServletContainerInit2 implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        for (Class<?> clz : c) {
            /*判断传过来的clz是不是MyAppInitializer接口的实现类*/
            if(MyAppInitializer.class.isAssignableFrom(clz)){
                try {
                  /*创建接口的实现类*/
                    MyAppInitializer instance = (MyAppInitializer) clz.newInstance();
                    /*调用接口的方法*/
                    instance.dangQiDonShi(ctx);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
