package com.anchor.model

/**
  * Created by mesfinmebrate on 20/08/2016.
  */
case class ToDo (id: Id,
                 portionId: Id,
                 description: String,
                 order: Int,
                 status: StatusType.Value) extends Spoke
