package config.annosupport;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author 南八
 */

@Configuration
@ComponentScan("com")//提供了与Spring XML的{acode <context:component-scan}元素并行的支持。
@EnableAspectJAutoProxy//表示支持处理带有AspectJ的{@code @Aspect}注释的组件
@EnableTransactionManagement//表示启用Spring的注解驱动的事务管理功能
public class AnnoSupportTxConfig {
    @Bean
    public DataSource dataSource(){
        return dataSource();
    }
    @Bean
    public DataSourceTransactionManager transactionManager(){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource());
        return transactionManager;
    }
}
