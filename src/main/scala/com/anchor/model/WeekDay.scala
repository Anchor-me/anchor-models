package com.anchor.model

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
case class WeekDay (id: Id,
                    weekId: Id,
                    date: Long,
                    threads: Seq[Id],
                    weave: Option[Id],
                    portion: Option[Id]) extends Day