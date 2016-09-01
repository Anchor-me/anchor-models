package com.anchor.model

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
case class Week (id: Id,
                 yearId: Id,
                 startDate: Long,
                 finishDate: Long,
                 threads: Seq[Id],
                 weave: Option[Id],
                 laserDonut: Option[Id]) extends TimeFrame