package com.milin.ptesting

import org.apache.spark.sql.Column
import org.apache.spark.sql.functions._

/**
  * Created by milin.korath on 3/5/2017.
  */
object SubStringTest {


  def getSubText(column:String,searchWord:String,limit:Int):Column={
    substring(split(col(column),searchWord).getItem(1),0,limit)
  }

}
