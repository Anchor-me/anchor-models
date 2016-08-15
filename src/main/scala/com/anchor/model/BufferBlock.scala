package com.anchor.model

/**
 * Created by mesfinmebrate on 03/04/2016.
 */
case class BufferBlock (start: Long,
                        finish: Long,
                        firstTask: Option[Id],
                        secondTask: Option[Id]) extends ScheduledItem
