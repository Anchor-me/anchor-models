package model

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
case class Portion (id: Id,
                    laserDonutId: Id,
                    summary: String,
                    toDos: Seq[String],
                    order: Int,
                    status: StatusType.Value) extends Task