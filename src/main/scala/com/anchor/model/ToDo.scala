package com.anchor.model

/**
  * Created by mesfinmebrate on 20/08/2016.
  */
case class ToDo (id: Id,
                 description: String,
                 status: StatusType.Value) extends Spoke
