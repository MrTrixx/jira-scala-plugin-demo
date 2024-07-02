package ru.jira.scala.plugin.demo.dto

import org.codehaus.jackson.annotate.JsonProperty

import java.util
import scala.beans.BeanProperty
import scala.compiletime.uninitialized

class SomeInnerDto {
  @JsonProperty("fields")
  @BeanProperty
  var fields: util.Map[String, Object] = uninitialized
}
