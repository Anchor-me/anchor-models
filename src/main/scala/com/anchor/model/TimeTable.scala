package com.anchor.model

import java.util.Date

/**
 * Created by mesfinmebrate on 03/04/2016.
 */
case class TimeTable (dayId: Id,
                      scheduledItems: Seq[ScheduledItem]) extends Spoke
