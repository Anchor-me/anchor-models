package com.anchor.model

/**
  * Created by mesfinmebrate on 05/09/2016.
  */
case class Routine(id: Id,
                   name: String,
                   timetables: Seq[Id])
