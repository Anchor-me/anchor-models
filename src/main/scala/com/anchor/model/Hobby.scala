package com.anchor.model

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
case class Hobby (id: Id,
                  goalId: Id,
                  summary: String,
                  description: String,
                  typeOf: HobbyType.Value,
                  status: StatusType.Value) extends Task