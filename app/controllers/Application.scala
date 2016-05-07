package controllers

import javax.inject._
import play.api._
// MVC関連のクラスがまとめられているパッケージ
import play.api.mvc._
 
class Application extends Controller {
  def index = Action {
    // Ok：HTTP ステータスコード200を返す
    Ok("Hello World")
  }
  def sampleLevel2 = Action {
    Ok(views.html.sampleLevel2("引数1")("引数2")("引数3"))
  }
}

