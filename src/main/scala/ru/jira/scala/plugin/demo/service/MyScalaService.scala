package ru.jira.scala.plugin.demo.service

import org.slf4j.LoggerFactory
import ru.jira.scala.plugin.demo.service.MyScalaInterface

class MyScalaService extends MyScalaInterface {
  private val log = LoggerFactory.getLogger(classOf[MyScalaService])

  override def invoke(): Unit = {
    log.debug("MyScalaService#invoke fired")
  }
}
