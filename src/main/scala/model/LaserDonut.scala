package model

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
case class LaserDonut (id: Id,
                       summary: String,
                       description: String,
                       goalId: Id,
                       status: StatusType.Value,
                       milestone: String,
                       order: Int,
                       typeOf: DonutType.Value)