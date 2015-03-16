package controllers

import edu.knowitall.openie.OpenIE
import play.api.mvc._

object Application extends Controller {
  val openIE = new OpenIE()

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

}