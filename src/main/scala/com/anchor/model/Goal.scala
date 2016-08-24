package com.anchor.model

/**
 * Created by mesfinmebrate on 19/03/2016.
 */
case class Goal (id: Id,
                 themeId: Id,
                 backlogItems: Seq[Id],
                 summary: String,
                 description: String,
                 level: Int,
                 priority: Boolean,
                 status: GoalStatusType.Value,
                 graduation: GraduationType.Value) extends HasId with Spoke