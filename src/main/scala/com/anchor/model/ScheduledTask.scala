package com.anchor.model

/**
  * Created by mesfinmebrate on 25/09/2016.
  */
case class ScheduledTask(taskId: Id,
                         name: String,
                         taskType: TaskType.Value,
                         statusType: StatusType.Value)
