package model

import java.util.Date

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
case class WeekDay (id: Id,
                    weekId: Id,
                    date: Date,
                    threads: Seq[Thread],
                    portion: Option[Portion],
                    financialTracking: Option[FinancialTracking]) extends Day