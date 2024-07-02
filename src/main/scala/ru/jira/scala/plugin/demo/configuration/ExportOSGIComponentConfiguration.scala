package ru.jira.scala.plugin.demo.configuration

import com.atlassian.plugins.osgi.javaconfig.{ExportOptions, OsgiServices}
import org.osgi.framework.ServiceRegistration
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.FactoryBean
import org.springframework.context.annotation.{Bean, Configuration}
import ru.jira.scala.plugin.demo.service
import ru.jira.scala.plugin.demo.service.{MyJavaService, MyScalaInterface}

import scala.annotation.static

@Configuration
class ExportOSGIComponentConfiguration {

  @Bean
  def exportMyJavaService(myJavaService: MyJavaService): FactoryBean[ServiceRegistration[?]] = {
    OsgiServices.exportOsgiService(myJavaService, ExportOptions.as(classOf[MyJavaService]))
  }

  @Bean
  def exportMyScalaService(myScalaService: MyScalaInterface): FactoryBean[ServiceRegistration[?]] = {
    OsgiServices.exportOsgiService(myScalaService, ExportOptions.as(classOf[MyScalaInterface]))
  }

}
