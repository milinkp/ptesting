package com.milin.ptesting

import org.apache.spark.sql.{Column, DataFrame}
import org.apache.spark.sql.functions._

/**
  * Created by milin.korath on 3/5/2017.
  */
object SubStringTest {


  def getSubText(df:DataFrame,nColName:String,column:String,searchWord:String,limit:Int,offSet:Int=0)={
    df.withColumn(nColName,substring(
      split(col(column),searchWord).getItem(1),offSet,limit))
  }

}
