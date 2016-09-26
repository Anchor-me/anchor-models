package com.anchor.model

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by mesfinmebrate on 26/09/2016.
  */
class DateTimeSpec extends FlatSpec with Matchers {

  "DateTime" should "be derived from a given String" in {
    val input = "2016-09-27,00:00:00"
    val output = DateTime.fromString(input)
    val expected = DateTime(
      year = 2016,
      month = 9,
      day = 27,
      hours = 0,
      minutes = 0,
      seconds = 0
    )

    output should be (expected)
  }

  "DateTime" should "return its internal data as a pretty printed String" in {
    val input = DateTime(
      year = 2016,
      month = 9,
      day = 27,
      hours = 0,
      minutes = 0,
      seconds = 0
    )
    val output = input.toString
    val expected = "2016-9-27,0:0:0"

    output should be (expected)
  }
}