package com.anchor.model

/**
  * Created by mesfinmebrate on 25/09/2016.
  */
case class DateTime(year: Int, month: Int, day: Int, hours: Int, minutes: Int, seconds: Int) {
  def toSeconds: Long = {
    new org.joda.time.DateTime (
      year,
      month,
      day,
      hours,
      minutes,
      seconds
    ).getMillis / 1000
  }
}

object DateTime {

  def fromString(dateTime: String): DateTime = {
    val Array(dateStr, timeStr) = dateTime.split(",")
    val date = Date(dateStr)
    val time = Time(timeStr)
    DateTime(
      date.year,
      date.month,
      date.day,
      time.hours,
      time.minutes,
      time.seconds
    )
  }

  private case class Date(day: Int, month: Int, year: Int)

  private case class Time(hours: Int, minutes: Int, seconds: Int)

  private object Date {
    def apply(date: String): Date = {
      val Array(day, month, year) = date.split("-").map(_.toInt)
      Date(
        day = day,
        month = month,
        year = year
      )
    }
  }

  private object Time {
    def apply(time: String): Time = {
      val Array(hours, minutes, seconds) = time.split(":").map(_.toInt)
      Time(
        hours = hours,
        minutes = minutes,
        seconds = seconds
      )
    }
  }

}