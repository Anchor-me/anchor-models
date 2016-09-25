package com.anchor.model

import java.sql.Time

/**
 * Created by mesfinmebrate on 03/04/2016.
 */
case class ConcreteBlock (start: DateTime,
                          finish: DateTime,
                          task: Option[ScheduledTask]) extends ScheduledItem
