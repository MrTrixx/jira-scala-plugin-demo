package ru.jira.scala.plugin.demo.resource

import ru.jira.scala.plugin.demo.dto.SomeDto

import javax.ws.rs.core.MediaType
import javax.ws.rs.{Consumes, POST, Path, Produces};

@Path("/demo")
class DemoResource {
  
  @Path("/post")
  @POST
  @Consumes(Array(MediaType.APPLICATION_JSON))
  @Produces(Array(MediaType.APPLICATION_JSON))
  def postAndReturnSomeDto(someDto: SomeDto): SomeDto = {
    someDto
  }
}
