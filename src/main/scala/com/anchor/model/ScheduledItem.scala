package com.anchor.model

import java.sql.Time

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
trait ScheduledItem extends Spoke with HasId {
  def id: Id
  def start: Long
  def finish: Long
}