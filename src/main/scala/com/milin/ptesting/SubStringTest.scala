package com.milin.ptesting

import org.apache.spark.sql.{Column, DataFrame}
import org.apache.spark.sql.functions._

/**
  * Created by milin.korath on 3/5/2017.
  */
object SubStringTest {

  /**
    * create a new column with the substring of given column ,
    * if the provided searchword contains in the given input column.User can configure the substring
    * using limit and offset parameter
    *
    * @param df         given dataframe
    * @param nColName   new column name
    * @param column     given column
    * @param searchWord word to search
    * @param limit      length of the output string
    * @param offSet     offset of the output string
    * @return dataframe having new column
    */

  def getSubText(df: DataFrame, nColName: String, column: String, searchWord: String, limit: Int, offSet: Int = 0) = {
    df.withColumn(nColName, substring(
      split(col(column), searchWord).getItem(1), offSet, limit))
    println("checking branch rebase")
    println("added some more changes")
  }
}