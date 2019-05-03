package models

import play.api.libs.json.Json

case class inputArr(arr : String)

object inputArr {
  implicit val arrFormat = Json.format[inputArr]
}