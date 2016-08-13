package com.anchor

/**
 * Created by mesfinmebrate on 09/04/2016.
 */

import com.anchor.model._
import play.api.libs.functional.syntax._
import play.api.libs.json.{JsResult, JsValue, Format, Json}
import play.api.libs.json.Reads._
import play.api.libs.json._

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

  implicit def formatThreadSeq(seq: Seq[Thread]) = Json.toJson(seq)

  implicit val formatBacklogItem = Json.format[BacklogItem]
  implicit val formatBufferBlock = Json.format[BufferBlock]
  implicit val formatConcreteBlock = Json.format[ConcreteBlock]
  implicit val formatLaserDonut = Json.format[LaserDonut]
  implicit val formatDonutCylinder = Json.format[DonutCylinder]
  implicit val formatFinancialTracking = Json.format[FinancialTracking]
  implicit val formatGoal = Json.format[Goal]
  implicit val formatReceipt = Json.format[Receipt]
  implicit val formatSaturday = Json.format[Saturday]
  implicit val formatSunday = Json.format[Sunday]
  implicit val formatTheme = Json.format[Theme]
  implicit val formatTimeTable = Json.format[TimeTable]
  implicit val formatWeek = Json.format[Week]
  implicit val formatWeekDay = Json.format[WeekDay]
  implicit val formatYear = Json.format[Year]

//  implicit val formatSpoke = new Format[Spoke] {
//    override def reads(json: JsValue): JsResult[Spoke] = {
//      Json.fromJson[BacklogItem](json) or
//        Json.fromJson[BufferBlock](json) or
//        Json.fromJson[ConcreteBlock](json) or
//        Json.fromJson[DonutCylinder](json) or
//        Json.fromJson[FinancialTracking](json) or
//        Json.fromJson[Goal](json) or
//        Json.fromJson[Hobby](json) or
//        Json.fromJson[LaserDonut](json) or
//        Json.fromJson[Portion](json) or
//        Json.fromJson[Receipt](json) or
//        Json.fromJson[Saturday](json) or
//        Json.fromJson[Sunday](json) or
//        Json.fromJson[Theme](json) or
//        Json.fromJson[Thread](json) or
//        Json.fromJson[TimeTable](json) or
//        Json.fromJson[Weave](json) or
//        Json.fromJson[Year](json)
//    }
//
//    override def writes(o: Spoke): JsValue = o match {
//      case backlogItem: BacklogItem => Json.toJson(backlogItem)
//      case bufferBlock: BufferBlock => Json.toJson(bufferBlock)
//      case concreteBlock: ConcreteBlock => Json.toJson(concreteBlock)
//      case donutCylinder: DonutCylinder => Json.toJson(donutCylinder)
//      case financialTracking: FinancialTracking => Json.toJson(financialTracking)
//      case goal: Goal => Json.toJson(goal)
//      case hobby: Hobby => Json.toJson(hobby)
//      case laserDonut: LaserDonut => Json.toJson(laserDonut)
//      case portion: Portion => Json.toJson(portion)
//      case receipt: Receipt => Json.toJson(receipt)
//      case saturday: Saturday => Json.toJson(saturday)
//      case sunday: Sunday => Json.toJson(Sunday)
//      case theme: Theme => Json.toJson(theme)
//      case thread: Thread => Json.toJson(thread)
//      case timeTable: TimeTable => Json.toJson(timeTable)
//      case weave: Weave => Json.toJson(Weave)
//      case year: Year => Json.toJson(Year)
//    }
//  }
//
//  implicit def formatSeq(seq: Seq[Spoke]) = Json.toJson(seq)
}