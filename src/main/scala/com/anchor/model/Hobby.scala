package com.anchor.model

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
case class Hobby (id: Id,
                  goalId: Option[Id],
                  summary: String,
                  description: String,
                  typeOf: HobbyType.Value,
                  frequency: HobbyFrequency.Value,
                  status: StatusType.Value) extends Task