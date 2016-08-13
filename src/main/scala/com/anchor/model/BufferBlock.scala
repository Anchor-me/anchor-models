package com.anchor.model

/**
 * Created by mesfinmebrate on 03/04/2016.
 */
case class BufferBlock (start: Long,
                        finish: Long,
                        firstTask: Option[Task],
                        secondTask: Option[Task]) extends ScheduledItem with Spoke
