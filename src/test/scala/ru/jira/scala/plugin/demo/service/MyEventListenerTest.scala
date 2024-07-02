package ru.jira.scala.plugin.demo.service

import com.atlassian.event.api.EventPublisher
import org.scalatest.funsuite.AnyFunSuiteLike
import org.mockito.Mockito.{mock, verify}

import java.util
import java.util.Collections


class MyEventListenerTest extends AnyFunSuiteLike {


  test("testDestroy") {
    val publisher = mock(classOf[EventPublisher])
    val pluginStarters = Collections.emptyList[PluginStarter]()

    val eventListener = new MyEventListener(publisher, pluginStarters)
    eventListener.destroy()

    verify(publisher).unregister(eventListener)
  }

  test("testAfterPropertiesSet") {
    val publisher = mock(classOf[EventPublisher])
    val pluginStarters = Collections.emptyList[PluginStarter]()

    val eventListener = new MyEventListener(publisher, pluginStarters)
    eventListener.afterPropertiesSet()

    verify(publisher).register(eventListener)
  }

}
