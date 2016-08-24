package com.anchor.model

/**
 * Created by mesfinmebrate on 02/04/2016.
 */
case class FinancialTracking (id: Id,
                              yearId: Id,
                              currentAmount: Double,
                              goalAmount: Double,
                              paidIn: Double,
                              paidOut: Double,
                              progress: FinancialProgressType.Value) extends Spoke
