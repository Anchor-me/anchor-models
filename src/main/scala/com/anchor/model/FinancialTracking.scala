package com.anchor.model

/**
 * Created by mesfinmebrate on 02/04/2016.
 */
case class FinancialTracking (currentAmount: Double,
                              goalAmount: Double,
                              paidIn: Double,
                              paidOut: Double,
                              progress: FinancialProgressType.Value) extends Spoke
