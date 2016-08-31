package com.anchor

/**
 * Created by mesfinmebrate on 09/04/2016.
 */

import com.anchor.model._
import play.api.libs.json.Json

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
  implicit val formatGoalStatusType = EnumUtils.format(GoalStatusType)

  implicit val formatHobby = Json.format[Hobby]
  implicit val formatToDo = Json.format[ToDo]
  implicit val formatPortion = Json.format[Portion]
  implicit val formatThread = Json.format[Thread]
  implicit val formatWeave = Json.format[Weave]

  implicit val formatFinancialTracking = Json.format[FinancialTracking]
  implicit val formatSaturday = Json.format[Saturday]
  implicit val formatSunday = Json.format[Sunday]
  implicit val formatWeekDay = Json.format[WeekDay]

  implicit val formatBufferBlock = Json.format[BufferBlock]
  implicit val formatConcreteBlock = Json.format[ConcreteBlock]

  implicit val formatBacklogItem = Json.format[BacklogItem]
  implicit val formatLaserDonut = Json.format[LaserDonut]
  implicit val formatGoal = Json.format[Goal]
  implicit val formatReceipt = Json.format[Receipt]
  implicit val formatTheme = Json.format[Theme]
  implicit val formatTimeTable = Json.format[TimeTable]
  implicit val formatWeek = Json.format[Week]
  implicit val formatYear = Json.format[Year]
}