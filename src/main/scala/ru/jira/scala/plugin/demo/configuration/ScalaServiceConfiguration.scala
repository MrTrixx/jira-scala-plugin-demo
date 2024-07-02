package ru.jira.scala.plugin.demo.configuration

import org.springframework.context.annotation.{Bean, Configuration}
import ru.jira.scala.plugin.demo.service.{PluginStarter, ScalaPluginStarter};

@Configuration
class ScalaServiceConfiguration {
  
  @Bean
  def scalaPluginStarter(): PluginStarter = {
    ScalaPluginStarter()
  }
}
