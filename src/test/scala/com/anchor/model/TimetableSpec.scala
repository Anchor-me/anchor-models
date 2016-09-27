package com.anchor.model

/**
  * Created by mesfinmebrate on 27/09/2016.
  */
object TimetableSpec {

  val base = Timetable (
    date = Some(DateTimeSpec.base),
    scheduledItems = Seq(BufferBlockSpec.base, ConcreteBlockSpec.base),
    typeOf = TimetableType.Tuesday
  )
}