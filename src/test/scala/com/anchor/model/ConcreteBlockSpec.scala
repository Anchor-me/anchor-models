package com.anchor.model

/**
  * Created by mesfinmebrate on 27/09/2016.
  */
object ConcreteBlockSpec {

  val base = ConcreteBlock(
    start = DateTimeSpec.base.copy(
      hours = 20,
      minutes = 46,
      seconds = 58
    ),
    finish = DateTimeSpec.base.copy(
      hours = 21,
      minutes = 16,
      seconds = 58
    ),
    task = Some(ScheduledTaskSpec.base.copy(
      taskId = Id(id = "THREAD3"),
      name = "Take a shower",
      taskType = TaskType.Thread,
      statusType = StatusType.NotComplete
    ))
  )
}