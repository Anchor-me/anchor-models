package com.anchor.model

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
case class DonutCylinder (goalId: Id,
                          donuts: Seq[LaserDonut],
                          graduation: GraduationType.Value) {

  def next: Option[LaserDonut] = {
    donuts.headOption
  }
}