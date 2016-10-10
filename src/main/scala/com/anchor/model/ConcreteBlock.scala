package com.anchor.model

import ScheduledItemType._

/**
 * Created by mesfinmebrate on 03/04/2016.
 */
case class ConcreteBlock (start: DateTime,
                          finish: DateTime,
                          task: Option[ScheduledTask],
                          typeOf: ScheduledItemType.Value = Concrete) extends ScheduledItem
