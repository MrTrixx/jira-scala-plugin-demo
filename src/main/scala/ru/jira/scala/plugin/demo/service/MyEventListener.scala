package ru.jira.scala.plugin.demo.service

import com.atlassian.event.api.EventListener
import com.atlassian.jira.component.ComponentAccessor
import com.atlassian.plugin.event.events.PluginEnabledEvent
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.{DisposableBean, InitializingBean}
import ru.jira.scala.plugin.demo.service.MyJavaService
import com.atlassian.event.api.EventPublisher

import java.util

class MyEventListener(private val eventPublisher: EventPublisher,
                      private val pluginStarters: util.List[PluginStarter]) extends InitializingBean, DisposableBean {

  private val PLUGIN_KEY: String = "ru.jira.scala.plugin.demo.jira-scala-plugin-demo"
  private val log = LoggerFactory.getLogger(classOf[MyEventListener])

  @EventListener
  def listen(event: PluginEnabledEvent): Unit = {
    if (PLUGIN_KEY == event.getPlugin.getKey) {
      log.debug(s"Plugin $PLUGIN_KEY started")
      pluginStarters.forEach(pluginStarter => pluginStarter.onStart())
      showWorkExportedPluginServiceToOSGISystem()
    }
  }

  override def afterPropertiesSet(): Unit = {
    log.debug("EventListener#afterPropertiesSet fired")
    eventPublisher.register(this)
  }

  override def destroy(): Unit = {
    log.debug("EventListener#destroy fired")
    eventPublisher.unregister(this)
  }

  private def showWorkExportedPluginServiceToOSGISystem(): Unit = {
    val myScalaInterfaceAsExportedComponent = ComponentAccessor.getOSGiComponentInstanceOfType(classOf[MyScalaInterface])
    val myJavaServiceAsExportedComponent = ComponentAccessor.getOSGiComponentInstanceOfType(classOf[MyJavaService])

    myScalaInterfaceAsExportedComponent.invoke()
    myJavaServiceAsExportedComponent.doDummyMethod()

    log.debug("myScalaService {}", myScalaInterfaceAsExportedComponent)
    log.debug("myJavaService {}", myJavaServiceAsExportedComponent)
  }
}
