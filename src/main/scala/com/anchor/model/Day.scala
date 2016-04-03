package com.anchor.model

import java.util.Date

/**
 * Created by mesfinmebrate on 03/04/2016.
 */
trait Day {
  def id: Id
  def weekId: Id
  def date: Date
  def portion: Option[Portion]
}