package com.anchor.model

/**
 * Created by mesfinmebrate on 03/04/2016.
 */
case class Timetable(date: Option[DateTime],
                     scheduledItems: Seq[ScheduledItem],
                     typeOf: TimetableType.Value) extends Spoke
