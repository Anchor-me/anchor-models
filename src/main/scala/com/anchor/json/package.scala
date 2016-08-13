package com.anchor

/**
 * Created by mesfinmebrate on 09/04/2016.
 */

import com.anchor.model._
import play.api.libs.functional.syntax._
import play.api.libs.json.{JsResult, JsValue, Format, Json}

package object json {

  implicit val formatId = Json.format[Id]

  implicit val formatBacklogItemType = EnumUtils.format(BacklogItemType)
  implicit val formatDonutType = EnumUtils.format(DonutType)
  implicit val formatFinancialProgressType = EnumUtils.format(FinancialProgressType)
  implicit val formatGraduationType = EnumUtils.format(GraduationType)
  implicit val formatHobbyType = EnumUtils.format(HobbyType)
  implicit val formatProgressType = EnumUtils.format(ProgressType)
  implicit val formatSpokeType = EnumUtils.format(SpokeType)
  implicit val formatStatusType = EnumUtils.format(StatusType)
  implicit val formatWeaveType = EnumUtils.format(WeaveType)

  implicit val formatHobby = Json.format[Hobby]
  implicit val formatPortion = Json.format[Portion]
  implicit val formatThread = Json.format[Thread]
  implicit val formatWeave = Json.format[Weave]

  implicit val formatFinancialTracking = Json.format[FinancialTracking]
  implicit val formatSaturday = Json.format[Saturday]
  implicit val formatSunday = Json.format[Sunday]
  implicit val formatWeekDay = Json.format[WeekDay]

  implicit val formatTask = new Format[Task] {
    override def reads(json: JsValue): JsResult[Task] = {
      Json.fromJson[Hobby](json) or
        Json.fromJson[Portion](json) or
        Json.fromJson[Thread](json) or
        Json.fromJson[Weave](json)
    }

    override def writes(o: Task): JsValue = o match {
      case hobby: Hobby => Json.toJson(hobby)
      case portion: Portion => Json.toJson(portion)
      case thread: Thread => Json.toJson(thread)
      case weave: Weave   => Json.toJson(weave)
    }
  }

  implicit val formatBufferBlock = Json.format[BufferBlock]
  implicit val formatConcreteBlock = Json.format[ConcreteBlock]

  implicit val formatScheduledItem = new Format[ScheduledItem] {
    override def reads(json: JsValue): JsResult[ScheduledItem] = {
      Json.fromJson[BufferBlock](json) or
        Json.fromJson[ConcreteBlock](json)
    }

    override def writes(o: ScheduledItem): JsValue = o match {
      case bufferBlock: BufferBlock => Json.toJson(bufferBlock)
      case concreteBlock: ConcreteBlock => Json.toJson(concreteBlock)
    }
  }

  implicit val formatBacklogItem = Json.format[BacklogItem]
  implicit val formatLaserDonut = Json.format[LaserDonut]
  implicit val formatDonutCylinder = Json.format[DonutCylinder]
  implicit val formatGoal = Json.format[Goal]
  implicit val formatReceipt = Json.format[Receipt]
  implicit val formatTheme = Json.format[Theme]
  implicit val formatTimeTable = Json.format[TimeTable]
  implicit val formatWeek = Json.format[Week]
  implicit val formatYear = Json.format[Year]
}