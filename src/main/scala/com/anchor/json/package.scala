package com.anchor

/**
 * Created by mesfinmebrate on 09/04/2016.
 */

import com.anchor.model._
import play.api.libs.json.Json

package object json {
  implicit val formatId = Json.format[Id]
  implicit val formatGoal = Json.format[Goal]
}