package com.anchor.model

/**
  * Created by mesfinmebrate on 27/09/2016.
  */
object ScheduledTaskSpec {

  val base = ScheduledTask (
    taskId = Id(id = "THREAD2"),
    name = "Go for a run",
    taskType = TaskType.Thread,
    statusType = StatusType.Complete
  )
}