package com.anchor.cypher

import com.anchor.model._

/**
 * Created by mesfinmebrate on 07/08/2016.
 */
object CypherNode {

  def apply(backlogItem: BacklogItem): String = {
    s"""
       |(backlogItem:BacklogItem {
       |id: "${backlogItem.id.id}",
       |summary: "${backlogItem.summary}",
       |description: "${backlogItem.description}",
       |typeOf: "${backlogItem.typeOf.toString}"
       |})
     """.stripMargin
  }

  def apply(bufferBlock: BufferBlock): String = {
    s"""
       |(bufferBlock:BufferBlock {
       |start: ${bufferBlock.start},
       |finish: ${bufferBlock.finish},
       |firstTask: "${bufferBlock.firstTask.map(_.id.id).mkString}",
       |secondTask: "${bufferBlock.secondTask.map(_.id.id).mkString}"
       |})
     """.stripMargin
  }

  def apply(concreteBlock: ConcreteBlock): String = {
    s"""
       |(bufferBlock:BufferBlock {
       |start: ${concreteBlock.start},
       |finish: ${concreteBlock.finish}
       |})"
     """.stripMargin
  }

  def apply(donutCylinder: DonutCylinder): String = {
    s"""
       |(donutCylinder:DonutCylinder {
       |graduation: "${donutCylinder.graduation.toString}"
       |})
     """.stripMargin
  }

  def apply(financialTracking: FinancialTracking): String = {
    s"""
       |(financialTracking:FinancialTracking {
       |id: "${financialTracking.id.id}",
       |currentAmount: ${financialTracking.currentAmount},
       |goalAmount: ${financialTracking.goalAmount},
       |paidIn: ${financialTracking.paidIn},
       |paidOut: ${financialTracking.paidOut},
       |progress: "${financialTracking.progress.toString}"
       |})
     """.stripMargin
  }

  def apply(goal: Goal): String = {
    s"""
       |(goal:Goal {
       |id: "${goal.id.id}",
       |summary: "${goal.summary}",
       |description: "${goal.description}",
       |level: ${goal.level},
       |priority: ${goal.priority}
       |})
    """.stripMargin
  }

  def apply(hobby: Hobby): String = {
    s"""
       |(hobby:Hobby {
       |id: "${hobby.id.id}",
       |summary: "${hobby.summary}",
       |description: "${hobby.description}",
       |typeOf: "${hobby.typeOf.toString}",
       |status: "${hobby.status.toString}"
       |})
     """.stripMargin
  }

  def apply(laserDonut: LaserDonut): String = {
    s"""
       |(laserDonut:LaserDonut {
       |id: "${laserDonut.id.id}",
       |summary: "${laserDonut.summary}",
       |description: "${laserDonut.description}",
       |status: "${laserDonut.status.toString}",
       |milestone: "${laserDonut.milestone}",
       |order: ${laserDonut.order},
       |typeOf: "${laserDonut.typeOf.toString}"
       |})
     """.stripMargin
  }

  def apply(portion: Portion): String = {
    s"""
       |(portion:Portion {
       |id: "${portion.id.id}",
       |summary: "${portion.summary}",
       |order: ${portion.order},
       |status: "${portion.status.toString}"
       |})
     """.stripMargin
  }

  def apply(receipt: Receipt): String = {
    s"""
       |(receipt:Receipt {
       |purchasedItem: "${receipt.purchasedItem}",
       |expenditure: ${receipt.expenditure},
       |nameOfEstablishment: "${receipt.nameOfEstablishment}"
       |})
     """.stripMargin
  }

  def apply(saturday: Saturday): String = {
    s"""
       |(saturday:Saturday {
       |id: "${saturday.id.id}",
       |date: ${saturday.date}
       |})
     """.stripMargin
  }

  def apply(sunday: Sunday): String = {
    s"""
       |(sunday:Sunday {
       |id: "${sunday.id.id}",
       |date: ${sunday.date}
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

  def apply(thread: Thread): String = {
    s"""
       |(thread:Thread {
       |id: "${thread.id.id}",
       |summary: "${thread.summary}",
       |description: "${thread.description}",
       |status: "${thread.status.toString}"
       |})
     """.stripMargin
  }

  def apply(weave: Weave): String = {
    s"""
       |(weave:Weave {
       |id: "${weave.id.id}",
       |summary: "${weave.summary}",
       |description: "${weave.description}",
       |status: "${weave.status.toString}",
       |typeOf: "${weave.typeOf.toString}"
       |})
     """.stripMargin
  }

  def apply(week: Week): String = {
    s"""
       |(week:Week {
       |id: "${week.id.id}",
       |startDate: ${week.startDate},
       |finishDate: ${week.finishDate}
       |)}
     """.stripMargin
  }

  def apply(weekDay: WeekDay): String = {
    s"""
       |(weekDay:WeekDay {
       |id: "${weekDay.id.id}",
       |date: ${weekDay.date}
       |})
     """.stripMargin
  }

  def apply(year: Year): String = {
    s"""
       |(year:Year {
       |id: "${year.id}",
       |startDate: ${year.startDate},
       |finishDate: ${year.finishDate}
       |})
     """.stripMargin
  }
}