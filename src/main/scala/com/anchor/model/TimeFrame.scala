package com.anchor.model

import java.util.Date

/**
 * Created by mesfinmebrate on 03/04/2016.
 */
trait TimeFrame extends Spoke {
  def startDate: Date
  def finishDate: Date
}