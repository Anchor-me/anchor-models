package com.anchor

import com.anchor.model._

/**
 * Created by mesfinmebrate on 07/08/2016.
 */
package object cypher {

  implicit class SpokeWrapper(spoke: Spoke) {
    def toCypher: String = {
      spoke match {
        case backlogItem: BacklogItem => CypherNode(backlogItem)
        case epoch: Epoch => CypherNode(epoch)
        case financialTracking: FinancialTracking => CypherNode(financialTracking)
        case goal: Goal => CypherNode(goal)
        case hobby: Hobby => CypherNode(hobby)
        case laserDonut: LaserDonut => CypherNode(laserDonut)
        case portion: Portion => CypherNode(portion)
        case receipt: Receipt => CypherNode(receipt)
        case theme: Theme => CypherNode(theme)
        case thread: Thread => CypherNode(thread)
        case toDo: ToDo => CypherNode(toDo)
        case weave: Weave => CypherNode(weave)
        case year: Year => CypherNode(year)
      }
    }
  }
}