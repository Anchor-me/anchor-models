package model

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
case class Thread (id: Id,
                   summary: String,
                   description: String,
                   goalId: Id,
                   status: StatusType.Value) extends Task