package controllers

import java.net.http.HttpClient.Redirect

import javax.inject.Inject
import play.api.mvc._


class getDirection @Inject()(cc:ControllerComponents) extends BaseController {

  override protected def controllerComponents: ControllerComponents = cc

  def doNow = Action{
    implicit request => Ok(views.html.index1())
  }

  def getRes(x: String) = Action{
    implicit request => Ok(views.html.index1())
  }

}
