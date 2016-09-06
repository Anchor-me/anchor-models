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
        case bufferBlock: BufferBlock => CypherNode(bufferBlock)
        case concreteBlock: ConcreteBlock => CypherNode(concreteBlock)
        case epoch: Epoch => CypherNode(epoch)
        case financialTracking: FinancialTracking => CypherNode(financialTracking)
        case goal: Goal => CypherNode(goal)
        case hobby: Hobby => CypherNode(hobby)
        case laserDonut: LaserDonut => CypherNode(laserDonut)
        case portion: Portion => CypherNode(portion)
        case receipt: Receipt => CypherNode(receipt)
        case saturday: Saturday => CypherNode(saturday)
        case sunday: Sunday => CypherNode(sunday)
        case theme: Theme => CypherNode(theme)
        case thread: Thread => CypherNode(thread)
        case timetable: Timetable => CypherNode(timetable)
        case toDo: ToDo => CypherNode(toDo)
        case weave: Weave => CypherNode(weave)
        case week: Week => CypherNode(week)
        case weekDay: WeekDay => CypherNode(weekDay)
        case year: Year => CypherNode(year)
      }
    }
  }
}