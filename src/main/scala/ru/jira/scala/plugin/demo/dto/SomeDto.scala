package ru.jira.scala.plugin.demo.dto

import org.codehaus.jackson.annotate.JsonProperty

import scala.beans.BeanProperty
import scala.compiletime.uninitialized

class SomeDto {
  @JsonProperty("someInnerDto")
  @BeanProperty
  var someInnerDto: SomeInnerDto = uninitialized
  @JsonProperty("someInt")
  @BeanProperty
  var someInt: Int = uninitialized
  @JsonProperty("someLong") 
  @BeanProperty
  var someLong: Long = uninitialized
  @JsonProperty("someString")
  @BeanProperty
  var someString: String = uninitialized
  @JsonProperty("someBoolean")
  @BeanProperty
  var someBoolean: Boolean = uninitialized 
  @JsonProperty("someMap")
  @BeanProperty
  var someMap: java.util.Map[String, Object] = uninitialized



}
