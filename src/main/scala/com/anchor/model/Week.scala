package com.anchor.model

import java.util.Date

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
case class Week (id: Id,
                 startDate: Date,
                 finishDate: Date,
                 weave: Option[Weave],
                 laserDonut: Option[LaserDonut]) extends TimeFrame with Spoke