package ru.jira.scala.plugin.demo.configuration

import com.atlassian.event.api.EventPublisher
import com.atlassian.plugins.osgi.javaconfig.OsgiServices
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ImportOSGIComponentConfiguration {

    @Bean
    def eventPublisher(): EventPublisher = {
        OsgiServices.importOsgiService(classOf[EventPublisher])
    }
}
