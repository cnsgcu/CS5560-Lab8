package controllers

import edu.knowitall.openie.{Instance, OpenIE}
import play.api.mvc._

object Application extends Controller {
  val openIE = new OpenIE()

  def index = Action {
    Ok(views.html.index())
  }

  def nlp = Action { implicit request =>
    val msg = request.body.asText.get

    val insts = openIE(msg)

    Ok(insts.foldLeft("")((a, v) => a + "<br/>" + v.extraction.toString))
  }
}