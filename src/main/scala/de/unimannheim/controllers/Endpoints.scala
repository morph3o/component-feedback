package de.unimannheim.controllers

import de.unimannheim.domain.Repository
import org.scalatra.json._
import org.json4s.{DefaultFormats, Formats, JValue}
import org.json4s.JsonDSL._

/**
  * Created by morph3o on 05.12.16.
  */
class Endpoints extends ComponentFeedbackStack with JacksonJsonSupport {

  protected implicit lazy val jsonFormats: Formats = DefaultFormats
  protected override def transformRequestBody(body: JValue): JValue = body.camelizeKeys

  before() {
    contentType = formats("json")
  }

  def error(title: String, body: String) = {
    ("type" -> "Error") ~
    ("title" -> title) ~
    ("body" -> body)
  }

  post("/get-feedback") {
    val repository = parsedBody.extract[Repository]

    if(repository.git.isEmpty) halt(400, this.error("Error with the parameters", "The parameter `git` is required."))
    else if(repository.emails.isEmpty) halt(400, this.error("Error with the parameters", "The parameter `emails` is required."))

    println(repository)
  }

}
