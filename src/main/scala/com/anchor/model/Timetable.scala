package com.anchor.model

/**
 * Created by mesfinmebrate on 03/04/2016.
 */
case class Timetable(id: Id,
                     dayId: Id,
                     scheduledItems: Seq[Id],
                     timetableType: TimetableType.Value) extends Spoke
