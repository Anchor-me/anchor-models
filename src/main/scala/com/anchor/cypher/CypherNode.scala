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
       |${bufferBlock.firstTask.map(o => s", firstTask: ${o.id}")}
       |${bufferBlock.secondTask.map(o => s", secondTask: ${o.id}")}
       |})
     """.stripMargin
  }

  def apply(concreteBlock: ConcreteBlock): String = {
    s"""
       |(concreteBlock: ConcreteBlock {
       |start: ${concreteBlock.start},
       |finish: ${concreteBlock.finish}
       |${concreteBlock.task.map(o => s", task: ${o.id}")}
       |})"
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
       |themeId: "${goal.themeId.id}",
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
       |laserDonutId: ${portion.laserDonutId.id},
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
       |weekId: "${saturday.weekId.id}",
       |date: ${saturday.date},
       |threads: [${saturday.threads.map(_.id).mkString(", ")}]
       |${saturday.portion.map(o => s", portion: ${o.id}")}
       |${saturday.financialTracking.map(o => s", financialTracking: ${o.id}")}
       |})
     """.stripMargin
  }

  def apply(sunday: Sunday): String = {
    s"""
       |(sunday:Sunday {
       |id: "${sunday.id.id}",
       |weekId: ${sunday.weekId.id},
       |date: ${sunday.date},
       |threads: [${sunday.threads.map(_.id).mkString(", ")}]
       |${sunday.activeHobby.map(o => s", activeHobby: ${o.id}")}
       |${sunday.financialTracking.map(o => s", financialTracking: ${o.id}")}
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
       |startDate: ${week.startDate},
       |finishDate: ${week.finishDate}
       |${week.weave.map(o => s", weave: ${o.id}")}
       |${week.laserDonut.map(o => s", laserDonut: ${o.id}")}
       |)}
     """.stripMargin
  }

  def apply(weekDay: WeekDay): String = {
    s"""
       |(weekDay:WeekDay {
       |id: "${weekDay.id.id}",
       |weekId: "${weekDay.weekId.id}",
       |date: ${weekDay.date},
       |threads: [${weekDay.threads.map(_.id).mkString(", ")}]
       |${weekDay.weave.map(o => s", weave: ${o.id}")}
       |${weekDay.portion.map(o => s", portion: ${o.id}")}
       |${weekDay.financialTracking.map(o => s", financialTracking: ${o.id}")}
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