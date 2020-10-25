package controllers

import javax.inject._

import play.api.mvc._

@Singleton
class MultiplicationTableController @Inject()(cc: ControllerComponents)() (implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {

  def firstPage2(number: Int): Action[AnyContent] =
    firstPage(number, number)

  def firstPage(from: Int, to: Int): Action[AnyContent] = Action {
    Ok(views.html.firstpage(from, to))
  }
}
