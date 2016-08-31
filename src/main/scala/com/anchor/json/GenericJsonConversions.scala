package com.anchor.json

import com.anchor.model.{BufferBlock, ConcreteBlock, Hobby, Portion, ScheduledItem, Task, Thread, Weave}
import play.api.libs.functional.syntax._
import play.api.libs.json.{Format, JsResult, JsValue, Json}

/**
  * Created by mesfinmebrate on 31/08/2016.
  */
object GenericJsonConversions {

  implicit val formatTask = new Format[Task] {
    override def reads(json: JsValue): JsResult[Task] = {
      Json.fromJson[Hobby](json) or
        Json.fromJson[Portion](json) or
        Json.fromJson[Thread](json) or
        Json.fromJson[Weave](json)
    }

    override def writes(o: Task): JsValue = o match {
      case hobby: Hobby => Json.toJson(hobby)
      case portion: Portion => Json.toJson(portion)
      case thread: Thread => Json.toJson(thread)
      case weave: Weave   => Json.toJson(weave)
    }
  }

  implicit val formatScheduledItem = new Format[ScheduledItem] {
    override def reads(json: JsValue): JsResult[ScheduledItem] = {
      Json.fromJson[BufferBlock](json) or
        Json.fromJson[ConcreteBlock](json)
    }

    override def writes(o: ScheduledItem): JsValue = o match {
      case bufferBlock: BufferBlock => Json.toJson(bufferBlock)
      case concreteBlock: ConcreteBlock => Json.toJson(concreteBlock)
    }
  }
}