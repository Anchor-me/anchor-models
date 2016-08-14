package com.anchor.model

/**
 * Created by mesfinmebrate on 03/04/2016.
 */
trait Day extends Spoke {
  def id: Id
  def weekId: Id
  def date: Long
  def portion: Option[Id]
}