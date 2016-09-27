package com.anchor.model

/**
  * Created by mesfinmebrate on 25/09/2016.
  */

case class ScheduledTask(taskId: Id,
                         name: String,
                         taskType: TaskType.Value,
                         statusType: StatusType.Value)

object LaserDonutPlaceholder {

  def apply = ScheduledTask (
    taskId = Id(id = "LDPLACEHOLDER"),
    name = "Placeholder for a Laser Donut Portion",
    taskType = TaskType.LaserDonutPortion,
    statusType = StatusType.NotStarted
  )
}

object WeavePlaceholder {

  def apply = ScheduledTask (
    taskId = Id(id = "WEAVEPLACEHOLDER"),
    name = "Placeholder for a Weave",
    taskType = TaskType.Weave,
    statusType = StatusType.NotStarted
  )
}