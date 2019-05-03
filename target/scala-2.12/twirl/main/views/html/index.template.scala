
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Neural Digit Recognition!</title>
  <link rel="stylesheet" href= """),_display_(/*8.33*/routes/*8.39*/.Assets.versioned("stylesheets/style.css")),format.raw/*8.81*/(""">
</head>
<body>
  <header class="header">
    <h1 class="header__title">Да это же самый настоящий <strong>ИНТЕЛЕКТИЩЕ</strong></h1>
  </header>
  <article class="article article_whitebg article_first">
    <h2 class="black"><br>Великий искусственный интелект победил!</h2>
    <img class="brain" src= """),_display_(/*16.30*/routes/*16.36*/.Assets.versioned("images/brain.jpg")),format.raw/*16.73*/(""">
    <p class="black">Победа Искусственного интелекта не за горами,<br> так что учимся с ним дружить!</p>
  </article>
  <article class="article article_bluebg article_second">
    <h2 class="white">Протестируем!</h2>
    <p class="white"></p>
    <form class="form">
      <div id ="aaa">asdasd</div>>
      <canvas height='280' width='280' id='example'
              onmousedown="pressed()"
              onmousemove="paint()"
              onmouseup="noPressed()">Обновите браузер</canvas>
      <script src= """),_display_(/*28.21*/routes/*28.27*/.Assets.versioned("javascripts/holst.js")),format.raw/*28.68*/("""></script>
       <button class="form_button" type="button" onclick= "clearP()">
         Обновить
      <script src="""),_display_(/*31.20*/routes/*31.26*/.Assets.versioned("javascripts/clear.js")),format.raw/*31.67*/("""></script>
       </button>
    </form>
  </article>
</body>
</html>"""))
      }
    }
  }

  def render(request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply()(request)

  def f:(() => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = () => (request) => apply()(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri May 03 10:05:50 MSK 2019
                  SOURCE: /home/serge/projexts/neurosite/app/views/index.scala.html
                  HASH: 034a2dceb3494c41ae2bc6c12e8c59e007040dab
                  MATRIX: 736->1|865->37|892->38|1048->168|1062->174|1124->216|1454->519|1469->525|1527->562|2068->1076|2083->1082|2145->1123|2290->1241|2305->1247|2367->1288
                  LINES: 21->1|26->2|27->3|32->8|32->8|32->8|40->16|40->16|40->16|52->28|52->28|52->28|55->31|55->31|55->31
                  -- GENERATED --
              */
          