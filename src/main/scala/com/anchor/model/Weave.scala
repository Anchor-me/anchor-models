package com.anchor.model

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
case class Weave (id: Id,
                  summary: String,
                  description: String,
                  goal: Id,
                  status: StatusType.Value,
                  typeOf: WeaveType.Value) extends Task
