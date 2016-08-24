package com.anchor.model

/**
 * Created by mesfinmebrate on 07/08/2016.
 */
case class BacklogItem(id: Id,
                       yearId: Id,
                       summary: String,
                       description: String,
                       typeOf: BacklogItemType.Value
                       ) extends HasId with Spoke
