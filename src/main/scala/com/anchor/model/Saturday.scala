package com.anchor.model

import java.util.Date

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
case class Saturday (id: Id,
                     weekId: Id,
                     date: Date,
                     threads: Seq[Thread],
                     portion: Option[Portion],
                     passiveHobby: Option[Hobby],
                     financialTracking: Option[FinancialTracking]) extends Day