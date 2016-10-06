package com.anchor

/**
 * Created by mesfinmebrate on 09/04/2016.
 */

import com.anchor.model._
import play.api.libs.json._

package object json {

  implicit val formatId = Json.format[Id]

  implicit val formatBacklogItemType = EnumUtils.format(BacklogItemType)
  implicit val formatDonutType = EnumUtils.format(DonutType)
  implicit val formatFinancialProgressType = EnumUtils.format(FinancialProgressType)
  implicit val formatGraduationType = EnumUtils.format(GraduationType)
  implicit val formatHobbyType = EnumUtils.format(HobbyType)
  implicit val formatHobbyFrequency = EnumUtils.format(HobbyFrequency)
  implicit val formatProgressType = EnumUtils.format(ProgressType)
  implicit val formatSpokeType = EnumUtils.format(SpokeType)
  implicit val formatStatusType = EnumUtils.format(StatusType)
  implicit val formatWeaveType = EnumUtils.format(WeaveType)
  implicit val formatGoalStatusType = EnumUtils.format(GoalStatusType)
  implicit val formatTaskType = EnumUtils.format(TaskType)
  implicit val formatTimetableType = EnumUtils.format(TimetableType)

  implicit val formatHobby = Json.format[Hobby]
  implicit val formatToDo = Json.format[ToDo]
  implicit val formatPortion = Json.format[Portion]
  implicit val formatThread = Json.format[Thread]
  implicit val formatWeave = Json.format[Weave]

  implicit val formatFinancialTracking = Json.format[FinancialTracking]

  implicit val formatDateTime = Json.format[DateTime]
  implicit val formatScheduledTask = Json.format[ScheduledTask]
  implicit val formatBufferBlock = Json.format[BufferBlock]
  implicit val formatConcreteBlock = Json.format[ConcreteBlock]

  implicit val formatBacklogItem = Json.format[BacklogItem]
  implicit val formatEpoch = Json.format[Epoch]
  implicit val formatLaserDonut = Json.format[LaserDonut]
  implicit val formatGoal = Json.format[Goal]
  implicit val formatReceipt = Json.format[Receipt]
  implicit val formatTheme = Json.format[Theme]

  implicit val formatScheduledItem = new Format[ScheduledItem] {
    override def reads(json: JsValue): JsResult[ScheduledItem] = {
      if(isConcrete(json)) {
        Json.fromJson[ConcreteBlock](json)
      }
      else {
        Json.fromJson[BufferBlock](json)
      }
    }

    def isConcrete(json: JsValue): Boolean = {
      (json \ "task") match {
        case _:JsDefined => true
        case _:JsUndefined => false
      }
    }

    override def writes(o: ScheduledItem): JsValue = o match {
      case bufferBlock: BufferBlock => Json.toJson(bufferBlock)
      case concreteBlock: ConcreteBlock => Json.toJson(concreteBlock)
    }
  }
  implicit val formatTimetable = Json.format[Timetable]
  implicit val formatRoutine = Json.format[Routine]
  implicit val formatYear = Json.format[Year]
}