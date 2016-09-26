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
       |yearId: "${backlogItem.yearId.id}",
       |summary: "${backlogItem.summary}",
       |description: "${backlogItem.description}",
       |typeOf: "${backlogItem.typeOf.toString}"
       |})
     """.stripMargin
  }

  def apply(epoch: Epoch): String = {
    s"""
       |(epoch: Epoch {
       |id: "${epoch.id.id}",
       |name: "${epoch.name}",
       |totem: "${epoch.totem}",
       |question: "${epoch.question}"
       |})
     """.stripMargin
  }

  def apply(financialTracking: FinancialTracking): String = {
    s"""
       |(financialTracking:FinancialTracking {
       |id: "${financialTracking.id.id}",
       |dayId: "${financialTracking.dayId.id}",
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
       |summary: "${hobby.summary}",
       |description: "${hobby.description}",
       |typeOf: "${hobby.typeOf.toString}",
       |frequency: "${hobby.frequency.toString}",
       |status: "${hobby.status.toString}"
       |${getOptionalField("goalId", hobby.goalId)}
       |})
     """.stripMargin
  }

  def apply(laserDonut: LaserDonut): String = {
    s"""
       |(laserDonut:LaserDonut {
       |id: "${laserDonut.id.id}",
       |goalId: "${laserDonut.goalId.id}",
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
       |${getOptionalField("goalId", thread.goalId)}
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
       |summary: "${weave.summary}",
       |description: "${weave.description}",
       |status: "${weave.status.toString}",
       |typeOf: "${weave.typeOf.toString}"
       |${getOptionalField("goalId", weave.goalId)}
       |})
     """.stripMargin
  }

  def apply(year: Year): String = {
    s"""
       |(year:Year {
       |id: "${year.id.id}",
       |epochId: "${year.epochId.id}"
       |${getDateField("startDate", year.startDate)}
       |${getDateField("finishDate", year.startDate)}
       |})
     """.stripMargin
  }

  private def getDateField(key: String, value: DateTime): String = {
    s""", $key : "${value.toString}""""
  }

  private def getOptionalField(key: String, value: Option[Id]): String = {
    value.map(o => s""", $key : "${o.id}"""").getOrElse("")
  }

  private def getArrayField(seq: Seq[Id]): String = {
    s"[${seq.map(id => s""""${id.id}"""").mkString(", ")}]"
  }
}