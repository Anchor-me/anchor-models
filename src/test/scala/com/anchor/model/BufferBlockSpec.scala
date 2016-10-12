package com.anchor.model

/**
  * Created by mesfinmebrate on 27/09/2016.
  */
object BufferBlockSpec {

  val base = BufferBlock(
    start = DateTimeSpec.base.copy(
      hours = 20,
      minutes = 16,
      seconds = 58
    ),
    finish = DateTimeSpec.base.copy(
      hours = 20,
      minutes = 46,
      seconds = 58
    ),
    firstTask = Some(ScheduledTaskSpec.base),
    secondTask = Some(ScheduledTaskSpec.base.copy(
      taskId = Id(id = "THREAD3"),
      name = "Take a shower",
      taskType = TaskType.Thread,
      statusType = StatusType.Incomplete
    ))
  )
}