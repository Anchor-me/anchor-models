package com.anchor.model

import java.sql.Time

/**
 * Created by mesfinmebrate on 03/04/2016.
 */
case class BufferBlock (start: Time,
                        finish: Time,
                        firstTask: Option[Task],
                        secondTask: Option[Task]) extends ScheduledItem with Spoke
