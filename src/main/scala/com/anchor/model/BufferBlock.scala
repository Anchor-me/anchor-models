package com.anchor.model

import ScheduledItemType._

/**
 * Created by mesfinmebrate on 03/04/2016.
 */
case class BufferBlock (start: DateTime,
                        finish: DateTime,
                        firstTask: Option[ScheduledTask],
                        secondTask: Option[ScheduledTask],
                        typeOf: ScheduledItemType.Value = Buffer) extends ScheduledItem
