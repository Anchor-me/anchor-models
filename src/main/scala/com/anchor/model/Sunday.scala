package com.anchor.model

import java.lang.Thread
import java.util.Date

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
case class Sunday (id: Id,
                   weekId: Id,
                   date: Date,
                   threads: Seq[Thread],
                   activeHobby: Option[Hobby],
                   financialTracking: Option[FinancialTracking]) extends Day {
  val portion = None
}