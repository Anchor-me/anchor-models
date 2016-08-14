package com.anchor.model

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
case class Week (id: Id,
                 startDate: Long,
                 finishDate: Long,
                 weave: Option[Id],
                 laserDonut: Option[Id]) extends TimeFrame