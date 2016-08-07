package com.anchor.model

import java.sql.Time

/**
 * Created by mesfinmebrate on 03/04/2016.
 */
case class ConcreteBlock (start: Time,
                          finish: Time,
                          task: Option[Task]) extends ScheduledItem with Spoke
