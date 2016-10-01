package com.anchor.model

/**
  * Created by mesfinmebrate on 03/09/2016.
  */
object TimetableType extends Enumeration {
  val Daily = Value(365)
  val Weekdays = Value(260)
  val Weekends = Value(105)
  val Monday = Value(1)
  val Tuesday = Value(2)
  val Wednesday = Value(3)
  val Thursday = Value(4)
  val Friday = Value(5)
  val Saturday = Value(6)
  val Sunday = Value(7)
  val OneOff = Value(0)
}