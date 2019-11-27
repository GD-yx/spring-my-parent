package inject.factory;

import java.util.Properties;

/**
 * @author 南八
 */
public class SqlSessionFactory {

    private Properties properties;

    @Override
    public String toString() {
        return "SqlSessionFactory{" +
                "properties=" + properties +
                '}';
    }

    public SqlSessionFactory(Properties properties) {
        System.out.println("我是SqlSessionFactory");

    }
}
