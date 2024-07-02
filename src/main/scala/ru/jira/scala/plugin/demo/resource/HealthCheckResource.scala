package ru.jira.scala.plugin.demo.resource

import org.springframework.beans.factory.annotation.Autowired

import javax.ws.rs.core.MediaType
import javax.ws.rs.{GET, Path, Produces}

import ru.jira.scala.plugin.demo.service.MyJavaService

@Path("/healthcheck")
@Autowired
class HealthCheckResource(private val myJavaService: MyJavaService) {
  
  @GET
  @Produces(Array(MediaType.APPLICATION_JSON))
  def health(): String = {
    myJavaService.doDummyMethod()
    "OK"
  }

}