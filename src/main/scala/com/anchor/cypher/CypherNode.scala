package com.anchor.cypher

import com.anchor.model.{Theme, Goal}

/**
 * Created by mesfinmebrate on 07/08/2016.
 */
object CypherNode {

  def apply(goal: Goal): String = {
    s"""
       |(goal:Goal {
       |id: "${goal.id.id}",
       |themeId: "${goal.themeId.id}",
       |summary: "${goal.summary}",
       |description: "${goal.description}",
       |level: ${goal.level},
       |priority: ${goal.priority}
       |})
    """.stripMargin
  }

  def apply(theme: Theme): String = {
    s"""
       |(theme:Theme {
       |id: "${theme.id.id}",
       |yearId: "${theme.yearId.id}",
       |name: "${theme.name}"
       |})
     """.stripMargin
  }
}