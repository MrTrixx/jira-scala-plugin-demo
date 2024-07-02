package ru.jira.scala.plugin.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.jira.scala.plugin.demo.service.JavaPluginStarter;
import ru.jira.scala.plugin.demo.service.MyJavaService;
import ru.jira.scala.plugin.demo.service.MyScalaInterface;
import ru.jira.scala.plugin.demo.service.MyScalaService;
import ru.jira.scala.plugin.demo.service.PluginStarter;

@Configuration
public class ServiceConfiguration {

    @Bean
    MyJavaService myJavaService() {
        return new MyJavaService();
    }

    @Bean
    MyScalaInterface myScalaService() {
        return new MyScalaService();
    }
    
    @Bean
    PluginStarter javaPluginStarter() {
        return new JavaPluginStarter();
    }

}
