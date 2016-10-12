package com.anchor.model

/**
  * Created by mesfinmebrate on 01/10/2016.
  */
object Placeholders {

  val LaserDonutPlaceholder = ScheduledTask (
    taskId = Id(id = "LDPLACEHOLDER"),
    name = "Placeholder for a Laser Donut Portion",
    taskType = TaskType.LaserDonutPortion,
    statusType = StatusType.NotReached
  )

  val WeavePlaceholder = ScheduledTask (
    taskId = Id(id = "WEAVEPLACEHOLDER"),
    name = "Placeholder for a Weave",
    taskType = TaskType.Weave,
    statusType = StatusType.NotReached
  )
}