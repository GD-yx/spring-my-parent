package com.test1;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;


/**
 * @author 南八
 */
public class A implements InitializingBean, FactoryBean<A> {
    /**
     * 被spring管理的东西，通过getBean得到的东西是一个完完整整的
     * 首先是实例化:先执行构造函数
     * 进行装配（wire）自动帮我们注入（如果有设定显示的注入或自动）
     * 执行afterPropertiesSet
     * 执行你指定的init方法:因为按spring的要求是
     * 那么afterPropertiesSet页数无参无返回值afterPropertiesSet
     * 所以如果你设定的自定义init方法就是afterPropertiesSet
     */
    private B b;
    private C c;

    public A(B b, C c) {
        System.out.println("构造函数");
        this.b = b;
        this.c = c;
    }

    public A() {

    }

    public void setB(B b) {
        this.b = b;
        System.out.println("set b 方法");
    }

    public void setC(C c) {
        this.c = c;
        System.out.println("set c 方法");
    }
    public void init(){
        System.out.println("初始化..........");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("在属性设置完毕之后----------");
    }

    @Override
    public A getObject() throws Exception {
        System.out.println("getObject()---------");
        return new A();

    }

    @Override
    public Class<?> getObjectType() {
        System.out.println("getObjectType()-------");
        return A.class;
    }

    @Override
    public boolean isSingleton() {
        System.out.println("isSingleton()-----------");
        return false;
    }
}
