package com.anchor.model

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
case class Year (id: Id,
                 epochId: Id,
                 startDate: Long,
                 finishDate: Long,
                 threads: Seq[Id]) extends TimeFrame