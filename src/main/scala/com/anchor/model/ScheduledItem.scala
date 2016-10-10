package com.anchor.model

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
trait ScheduledItem extends Spoke {
  def start: DateTime
  def finish: DateTime
  def typeOf: ScheduledItemType.Value
}