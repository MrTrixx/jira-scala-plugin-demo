package ru.jira.scala.plugin.demo.service;

import org.slf4j.LoggerFactory
import org.slf4j.Logger

class ScalaPluginStarter extends PluginStarter {
  private val log = LoggerFactory.getLogger(classOf[ScalaPluginStarter])


  override def onStart(): Unit = {
    log.debug("ScalaPluginStarter#onStart fired")
  }
}
