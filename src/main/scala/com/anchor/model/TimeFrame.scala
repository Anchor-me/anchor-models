package com.anchor.model

/**
 * Created by mesfinmebrate on 03/04/2016.
 */
trait TimeFrame extends Spoke {
  def startDate: DateTime
  def finishDate: DateTime
}