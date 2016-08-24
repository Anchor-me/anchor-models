package com.anchor.model

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
case class Receipt (id: Id,
                    trackingId: Id,
                    purchasedItem: String,
                    expenditure: Double,
                    nameOfEstablishment: String) extends Spoke