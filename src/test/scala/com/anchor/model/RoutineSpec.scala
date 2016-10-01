package com.anchor.model

import Placeholders._
import play.api.libs.json.Json
import com.anchor.json._

/**
  * Created by mesfinmebrate on 27/09/2016.
  */

object RoutineSpec extends App {

  val base = Routine (
    id = Id("ROUTINE1"),
    name = "Lean month",
    timetables = Seq(TimetableSpec.base),
    isCurrent = true
  )

  override def main(args: Array[String]): Unit = {
    val wakeUp = ScheduledTask (
      taskId = Id(id = "THREAD1"),
      name = "Wake up",
      taskType = TaskType.Thread,
      statusType = StatusType.Complete
    )

    val goRunning = ScheduledTask (
      taskId = Id(id = "THREAD2"),
      name = "Go for a run",
      taskType = TaskType.Thread,
      statusType = StatusType.Complete
    )

    val takeShower = ScheduledTask (
      taskId = Id(id = "THREAD3"),
      name = "Take a shower",
      taskType = TaskType.Thread,
      statusType = StatusType.Complete
    )

    val commute = ScheduledTask (
      taskId = Id(id = "THREAD7"),
      name = "Commute to work",
      taskType = TaskType.Thread,
      statusType = StatusType.Complete
    )

    val buildServer = ScheduledTask (
      taskId = Id(id = "WEAVE1"),
      name = "Configure build server",
      taskType = TaskType.Weave,
      statusType = StatusType.NotComplete
    )

    val dojo = ScheduledTask (
      taskId = Id(id = "WEAVE3"),
      name = "Organise an Akka dojo",
      taskType = TaskType.Weave,
      statusType = StatusType.NotStarted
    )

    val ferrisWheel = ScheduledTask (
      taskId = Id(id = "PORTION1"),
      name = "Create case classes",
      taskType = TaskType.LaserDonutPortion,
      statusType = StatusType.Complete
    )

    val pingPong = ScheduledTask (
      taskId = Id(id = "HOBBY1"),
      name = "Play ping-pong",
      taskType = TaskType.ActiveHobby,
      statusType = StatusType.NotStarted
    )

    val infiniteJest = ScheduledTask (
      taskId = Id(id = "HOBBY3"),
      name = "Read Infinite Jest",
      taskType = TaskType.PassiveHobby,
      statusType = StatusType.NotStarted
    )

    val sleep = ScheduledTask (
      taskId = Id(id = "THREAD4"),
      name = "Sleep",
      taskType = TaskType.Thread,
      statusType = StatusType.Complete
    )

    val wakeUpOnly = ConcreteBlock(
      task = Some(wakeUp),
      start = DateTimeSpec.base.copy(hours = 6, minutes = 0, seconds = 0),
      finish = DateTimeSpec.base.copy(hours = 6, minutes = 10, seconds = 0)
    )

    val wakeUpAndRun = BufferBlock(
      firstTask = Some(wakeUp),
      secondTask = Some(goRunning),
      start = DateTimeSpec.base.copy(hours = 6, minutes = 10, seconds = 0),
      finish = DateTimeSpec.base.copy(hours = 6, minutes = 20, seconds = 0)
    )

    val goRunningOnly = ConcreteBlock(
      task = Some(goRunning),
      start = DateTimeSpec.base.copy(hours = 6, minutes = 20, seconds = 0),
      finish = DateTimeSpec.base.copy(hours = 7, minutes = 20, seconds = 0)
    )

    val goRunningAndShower = BufferBlock(
      firstTask = Some(goRunning),
      secondTask = Some(takeShower),
      start = DateTimeSpec.base.copy(hours = 7, minutes = 20, seconds = 0),
      finish = DateTimeSpec.base.copy(hours = 7, minutes = 30, seconds = 0)
    )

    val takeShowerOnly = ConcreteBlock(
      task = Some(takeShower),
      start = DateTimeSpec.base.copy(hours = 7, minutes = 30, seconds = 0),
      finish = DateTimeSpec.base.copy(hours = 8, minutes = 0, seconds = 0)
    )

    val showerAndCommute = BufferBlock(
      firstTask = Some(takeShower),
      secondTask = Some(commute),
      start = DateTimeSpec.base.copy(hours = 8, minutes = 0, seconds = 0),
      finish = DateTimeSpec.base.copy(hours = 8, minutes = 20, seconds = 0)
    )

    val commuteOnly = ConcreteBlock(
      task = Some(commute),
      start = DateTimeSpec.base.copy(hours = 8, minutes = 20, seconds = 0),
      finish = DateTimeSpec.base.copy(hours = 9, minutes = 10, seconds = 0)
    )

    val commuteAndWeave = BufferBlock(
      firstTask = Some(commute),
      secondTask = Some(WeavePlaceholder),
      start = DateTimeSpec.base.copy(hours = 9, minutes = 10, seconds = 0),
      finish = DateTimeSpec.base.copy(hours = 9, minutes = 20, seconds = 0)
    )

    val weaveOnly = ConcreteBlock(
      task = Some(WeavePlaceholder),
      start = DateTimeSpec.base.copy(hours = 9, minutes = 20, seconds = 0),
      finish = DateTimeSpec.base.copy(hours = 16, minutes = 0, seconds = 0)
    )

    val weaveAndPortion = BufferBlock(
      firstTask = Some(WeavePlaceholder),
      secondTask = Some(WeavePlaceholder),
      start = DateTimeSpec.base.copy(hours = 16, minutes = 0, seconds = 0),
      finish = DateTimeSpec.base.copy(hours = 16, minutes = 30, seconds = 0)
    )

    val portionOnly = ConcreteBlock(
      task = Some(LaserDonutPlaceholder),
      start = DateTimeSpec.base.copy(hours = 16, minutes = 30, seconds = 0),
      finish = DateTimeSpec.base.copy(hours = 20, minutes = 30, seconds = 0)
    )

    val portionAndSleep = BufferBlock(
      firstTask = Some(LaserDonutPlaceholder),
      secondTask = Some(sleep),
      start = DateTimeSpec.base.copy(hours = 20, minutes = 30, seconds = 0),
      finish = DateTimeSpec.base.copy(hours = 21, minutes = 20, seconds = 0)
    )

    val sleepOnly = ConcreteBlock(
      task = Some(sleep),
      start = DateTimeSpec.base.copy(hours = 21, minutes = 20, seconds = 0),
      finish = DateTimeSpec.base.copy(hours = 6, minutes = 0, seconds = 0)
    )

    val timetable = Timetable(
      date = None,
      scheduledItems = Seq(
        wakeUpOnly,
        wakeUpAndRun,
        goRunningOnly,
        goRunningAndShower,
        takeShowerOnly,
        showerAndCommute,
        commuteOnly,
        commuteAndWeave,
        weaveOnly,
        weaveAndPortion,
        portionOnly,
        portionAndSleep
      ),
      typeOf = TimetableType.Daily
    )

    val routine = Routine(
      id = Id("ROUTINE1"),
      name = "Lean month",
      timetables = Seq(timetable),
      isCurrent = true
    )

    println(Json.prettyPrint(Json.toJson(routine)))
  }
}