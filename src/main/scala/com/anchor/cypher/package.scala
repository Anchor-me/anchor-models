package com.anchor

import com.anchor.model._

/**
 * Created by mesfinmebrate on 07/08/2016.
 */
package object cypher {

  implicit class SpokeWrapper(spoke: Spoke) {
    def toCypher: String = {
      spoke match {
        case goal: Goal => CypherNode(goal)
        case theme: Theme => CypherNode(theme)
      }
    }
  }
}