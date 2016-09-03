package com.anchor.model

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
case class Sunday (id: Id,
                   weekId: Id,
                   date: Long,
                   threads: Seq[Id],
                   activeHobby: Option[Id]) extends Day {
  val portion = None
}