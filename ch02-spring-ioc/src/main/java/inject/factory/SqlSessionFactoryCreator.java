package inject.factory;

import java.util.Properties;

/**
 * @author 南八
 */
public class SqlSessionFactoryCreator {
    private  Properties properties;
   public SqlSessionFactory create(){
        return new SqlSessionFactory(properties);
    }

    public SqlSessionFactoryCreator() {
    }

    public SqlSessionFactoryCreator(Properties properties) {
        this.properties = properties;
    }


    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
