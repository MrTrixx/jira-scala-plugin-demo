package ru.jira.scala.plugin.demo.configuration

import com.atlassian.event.api.EventPublisher
import org.springframework.context.annotation.{Bean, Configuration}
import ru.jira.scala.plugin.demo.service.{MyEventListener, PluginStarter}

import java.util

@Configuration
class EventListenerConfiguration {
  
  @Bean
  def myEventListener(eventPublisher: EventPublisher,
                      pluginStarters: util.List[PluginStarter]): MyEventListener = {
    MyEventListener(eventPublisher, pluginStarters)
  } 
}
