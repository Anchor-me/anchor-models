package com.anchor.model

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
case class Sunday (id: Id,
                   weekId: Id,
                   date: Long,
                   threads: Seq[Thread],
                   activeHobby: Option[Hobby],
                   financialTracking: Option[FinancialTracking]) extends Day {
  val portion = None
}