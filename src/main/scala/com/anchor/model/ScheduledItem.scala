package com.anchor.model

import java.sql.Time

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
trait ScheduledItem {
  def start: Time
  def finish: Time
}