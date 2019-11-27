package config.annosupport;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 南八
 */
@Configuration
@ComponentScan("com")
@EnableAspectJAutoProxy
public class AnnoSupportAopConfig {

}
