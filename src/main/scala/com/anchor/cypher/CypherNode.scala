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
       |finish: ${bufferBlock.finish}
       |${getOptionalField("firstTask", bufferBlock.firstTask)}
       |${getOptionalField("secondTask", bufferBlock.secondTask)}
       |})
     """.stripMargin
  }

  def apply(concreteBlock: ConcreteBlock): String = {
    s"""
       |(concreteBlock: ConcreteBlock {
       |start: ${concreteBlock.start},
       |finish: ${concreteBlock.finish}
       |${getOptionalField("task", concreteBlock.task)}
       |})
     """.stripMargin
  }

  def apply(financialTracking: FinancialTracking): String = {
    s"""
       |(financialTracking:FinancialTracking {
       |id: "${financialTracking.id.id}",
       |yearId: "${financialTracking.yearId.id}",
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
       |themeId: "${goal.themeId.id}",
       |backlogItems: ${getArrayField(goal.backlogItems)},
       |summary: "${goal.summary}",
       |description: "${goal.description}",
       |level: ${goal.level},
       |priority: ${goal.priority},
       |status: "${goal.status.toString}",
       |graduation: "${goal.graduation.toString}"
       |})
    """.stripMargin
  }

  def apply(hobby: Hobby): String = {
    s"""
       |(hobby:Hobby {
       |id: "${hobby.id.id}",
       |goalId: "${hobby.id.id}",
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
       |goalId: "${laserDonut.id}",
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
       |laserDonutId: "${portion.laserDonutId.id}",
       |summary: "${portion.summary}",
       |order: ${portion.order},
       |status: "${portion.status.toString}"
       |})
     """.stripMargin
  }

  def apply(receipt: Receipt): String = {
    s"""
       |(receipt:Receipt {
       |id: "${receipt.id.id}",
       |trackingId: "${receipt.trackingId.id}",
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
       |weekId: "${saturday.weekId.id}",
       |date: ${saturday.date},
       |threads: ${getArrayField(saturday.threads)}
       |${getOptionalField("portion", saturday.portion)}
       |${getOptionalField("financialTracking", saturday.financialTracking)}
       |})
     """.stripMargin
  }

  def apply(sunday: Sunday): String = {
    s"""
       |(sunday:Sunday {
       |id: "${sunday.id.id}",
       |weekId: ${sunday.weekId.id},
       |date: ${sunday.date},
       |threads: ${getArrayField(sunday.threads)}
       |${getOptionalField("activeHobby", sunday.activeHobby)}
       |${getOptionalField("financialTracking", sunday.financialTracking)}
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
       |goalId: "${thread.goalId.id}",
       |summary: "${thread.summary}",
       |description: "${thread.description}",
       |status: "${thread.status.toString}"
       |})
     """.stripMargin
  }

//  def apply(timeTable: TimeTable): String = {
//    s"""
//       |(timeTable:TimeTable {
//       |dayId: "${timeTable.dayId.id}",
//       |scheduledItems:
//       |})
//     """.stripMargin
//  }

  def apply(toDo: ToDo): String = {
    s"""
       |(toDo:ToDo {
       |id: "${toDo.id.id}",
       |portionId: "${toDo.portionId.id}",
       |description: "${toDo.description}",
       |order: "${toDo.order}",
       |status: "${toDo.status.toString}"
       |})
     """.stripMargin
  }

  def apply(weave: Weave): String = {
    s"""
       |(weave:Weave {
       |id: "${weave.id.id}",
       |goalId: "${weave.goalId.id}",
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
       |yearId: "${week.yearId.id}",
       |startDate: ${week.startDate},
       |finishDate: ${week.finishDate}
       |${getOptionalField("weave", week.weave)}
       |${getOptionalField("laserDonut", week.laserDonut)}
       |})
     """.stripMargin
  }

  def apply(weekDay: WeekDay): String = {
    s"""
       |(weekDay:WeekDay {
       |id: "${weekDay.id.id}",
       |weekId: "${weekDay.weekId.id}",
       |date: ${weekDay.date},
       |threads: ${getArrayField(weekDay.threads)}
       |${getOptionalField("weave", weekDay.weave)}
       |${getOptionalField("portion", weekDay.portion)}
       |${getOptionalField("financialTracking", weekDay.financialTracking)}
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

  private def getOptionalField(key: String, value: Option[Id]): String = {
    value.map(o => s""", $key : "${o.id}"""").getOrElse("")
  }

  private def getArrayField(seq: Seq[Id]): String = {
    s"[${seq.map(id => s""""${id.id}"""").mkString(", ")}]"
  }
}