package config;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author 南八
 */
@Configuration
@PropertySource("classpath:db.properties")
@MapperScan("com.dao")
@ComponentScan({"com.service","com.aspect"})
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class AppConfig {

    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());

        //这个类支持路径模式，比如classpath*及ant格式
        PathMatchingResourcePatternResolver patternResolver =  new PathMatchingResourcePatternResolver();
        Resource[] resources = patternResolver.getResources("classpath*:*.xml");
        sqlSessionFactoryBean.setMapperLocations(resources);

        //配置日志
        sqlSessionFactoryBean.setConfiguration(configuration());
        //配置分页插件
        sqlSessionFactoryBean.setPlugins(pageInterceptor());

        return sqlSessionFactoryBean.getObject();
    }

    /**
     * 分页插件
     * @return
     */
    private PageInterceptor pageInterceptor() {
        PageInterceptor pageInterceptor = new PageInterceptor();
        Properties properties = new Properties();
        //值必须是字符串，不要直接写true
        properties.put("supportMethodsArguments","true");
        properties.put("reasonable","true");
        pageInterceptor.setProperties(properties);
        return pageInterceptor;
    }

    /**
     * 日志
     * @return
     */
    private org.apache.ibatis.session.Configuration configuration() {
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setLogImpl(StdOutImpl.class);
        //下面的配置是把下划线（underScore）转换为驼峰命名，表user_name ->userName
        configuration.setMapUnderscoreToCamelCase(true);
        return configuration;
    }

    @Bean
    public DataSourceTransactionManager transactionManager(){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource());
        return transactionManager;
    }
}
